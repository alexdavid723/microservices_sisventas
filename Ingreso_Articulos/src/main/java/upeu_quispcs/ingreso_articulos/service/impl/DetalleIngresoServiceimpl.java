package upeu_quispcs.ingreso_articulos.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import upeu_quispcs.ingreso_articulos.entity.DetalleIngreso;
import upeu_quispcs.ingreso_articulos.repository.DetalleIngresoRepository;
import upeu_quispcs.ingreso_articulos.service.DetalleIngresoService;

import java.util.List;
import java.util.Optional;
@Service
public class DetalleIngresoServiceimpl implements DetalleIngresoService{
    @Autowired
    private DetalleIngresoRepository detalleIngresoRepository;

    @Override
    public List<DetalleIngreso> listar() {
        return detalleIngresoRepository.findAll();
    }

    @Override
    public DetalleIngreso guardar(DetalleIngreso detalleIngreso) {
        return detalleIngresoRepository.save(detalleIngreso);
    }

    @Override
    public DetalleIngreso actualizar(DetalleIngreso detalleIngreso) {
        return detalleIngresoRepository.save(detalleIngreso);
    }

    @Override
    public Optional<DetalleIngreso> listarPorId(Integer id) {
        return detalleIngresoRepository.findById(id);
    }

    @Override
    public void eliminarPorId(Integer id) {
        detalleIngresoRepository.deleteById(id);
    }
}
