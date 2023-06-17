package upeu_quispcs.categoria.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import upeu_quispcs.categoria.entity.Articulo;
import upeu_quispcs.categoria.repository.ArticuloRepository;
import upeu_quispcs.categoria.service.ArticuloService;

import java.util.List;
import java.util.Optional;
@Service
public class ArticuloServiceimpl implements ArticuloService {
    @Autowired
    private ArticuloRepository articuloRepository;

    @Override
    public List<Articulo> listar() {
        return articuloRepository.findAll();
    }

    @Override
    public Articulo guardar(Articulo articulo) {
        return articuloRepository.save(articulo);
    }

    @Override
    public Articulo actualizar(Articulo articulo) {
        return articuloRepository.save(articulo);
    }

    @Override
    public Optional<Articulo> listarPorId(Integer id) {
        return articuloRepository.findById(id);
    }

    @Override
    public void eliminarPorId(Integer id) {
        articuloRepository.deleteById(id);
    }
}
