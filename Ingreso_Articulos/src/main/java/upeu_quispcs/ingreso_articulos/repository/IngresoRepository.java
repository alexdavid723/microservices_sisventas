package upeu_quispcs.ingreso_articulos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import upeu_quispcs.ingreso_articulos.entity.Ingreso;

public interface IngresoRepository extends JpaRepository<Ingreso, Integer> {
}
