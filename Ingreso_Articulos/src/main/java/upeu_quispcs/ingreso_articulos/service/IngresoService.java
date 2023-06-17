package upeu_quispcs.ingreso_articulos.service;

import upeu_quispcs.ingreso_articulos.entity.DetalleIngreso;
import upeu_quispcs.ingreso_articulos.entity.Ingreso;

import java.util.List;
import java.util.Optional;

public interface IngresoService {
    public List<Ingreso> listar();

    public Ingreso guardar(Ingreso ingreso);

    public Ingreso actualizar(Ingreso ingreso);

    public Optional<Ingreso> listarPorId(Integer id);

    public void eliminarPorId(Integer id);
}
