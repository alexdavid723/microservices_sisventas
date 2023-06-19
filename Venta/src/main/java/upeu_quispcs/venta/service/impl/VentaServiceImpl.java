package upeu_quispcs.venta.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import upeu_quispcs.venta.dto.Articulo;
import upeu_quispcs.venta.dto.Persona;
import upeu_quispcs.venta.entiry.Venta;
import upeu_quispcs.venta.entiry.VentaDetalle;
import upeu_quispcs.venta.feign.ArticuloFeign;
import upeu_quispcs.venta.feign.PersonaFeign;
import upeu_quispcs.venta.repository.VentaRepository;
import upeu_quispcs.venta.service.VentaService;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class VentaServiceImpl implements VentaService {
    @Autowired
    private VentaRepository ventaRepository;

    @Autowired
    private PersonaFeign personaFeign;

    @Autowired
    private ArticuloFeign articuloFeign;

    @Override
    public List<Venta> listar() {
        return ventaRepository.findAll();
    }

    @Override
    public Venta guardar(Venta venta) {
        return ventaRepository.save(venta);
    }

    @Override
    public Venta actualizar(Venta venta) {
        return ventaRepository.save(venta);
    }

    @Override
    public Optional<Venta> listarPorId(Integer id) {
        Venta venta = ventaRepository.findById(id).get();

        Persona persona = personaFeign.listById(venta.getPersonaId()).getBody();
        List<VentaDetalle> ventaDetalles = venta.getDetalle().stream().map(ventaDetalle -> {
            System.out.println(ventaDetalle.toString());
            Articulo articulo = articuloFeign.listById(ventaDetalle.getArticuloId()).getBody();
            System.out.println(articulo.toString());
            System.out.println(articulo.getNombre());
            ventaDetalle.setArticulo(articulo);
            return ventaDetalle;
        }).collect(Collectors.toList());
        venta.setDetalle(ventaDetalles);

        venta.setPersona(persona);
        return Optional.of(venta);
    }

    @Override
    public void eliminarPorId(Integer id) {
        ventaRepository.deleteById(id);
    }

}
