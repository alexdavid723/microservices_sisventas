package upeu_quispcs.ingreso_articulos.service;

import upeu_quispcs.ingreso_articulos.entity.DetalleIngreso;

import java.util.List;
import java.util.Optional;

public interface DetalleIngresoService {
    public List<DetalleIngreso> listar();

    public DetalleIngreso guardar(DetalleIngreso detalleIngreso);

    public DetalleIngreso actualizar(DetalleIngreso detalleIngreso);

    public Optional<DetalleIngreso> listarPorId(Integer id);

    public void eliminarPorId(Integer id);
}
