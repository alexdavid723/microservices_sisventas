package upeu_quispcs.categoria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import upeu_quispcs.categoria.entity.Articulo;

public interface ArticuloRepository extends JpaRepository<Articulo, Integer> {
}
