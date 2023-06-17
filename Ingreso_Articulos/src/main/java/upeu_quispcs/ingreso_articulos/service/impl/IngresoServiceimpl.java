package upeu_quispcs.ingreso_articulos.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import upeu_quispcs.ingreso_articulos.entity.Ingreso;
import upeu_quispcs.ingreso_articulos.repository.IngresoRepository;
import upeu_quispcs.ingreso_articulos.service.IngresoService;

import java.util.List;
import java.util.Optional;

@Service
public class IngresoServiceimpl implements IngresoService {
    @Autowired
    private IngresoRepository ingresoRepository;

    @Override
    public List<Ingreso> listar() {
        return ingresoRepository.findAll();
    }

    @Override
    public Ingreso guardar(Ingreso ingreso) {
        return ingresoRepository.save(ingreso);
    }

    @Override
    public Ingreso actualizar(Ingreso ingreso) {
        return ingresoRepository.save(ingreso);
    }

    @Override
    public Optional<Ingreso> listarPorId(Integer id) {
        return ingresoRepository.findById(id);
    }

    @Override
    public void eliminarPorId(Integer id) {
        ingresoRepository.deleteById(id);
    }

}
