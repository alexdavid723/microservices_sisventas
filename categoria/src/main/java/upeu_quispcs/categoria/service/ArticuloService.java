package upeu_quispcs.categoria.service;

import upeu_quispcs.categoria.entity.Articulo;

import java.util.List;
import java.util.Optional;

public interface ArticuloService {
    public List<Articulo> listar();

    public Articulo guardar(Articulo producto);

    public Articulo actualizar(Articulo producto);

    public Optional<Articulo> listarPorId(Integer id);

    public void eliminarPorId(Integer id);
}
