package upeu_quispcs.ingreso_articulos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import upeu_quispcs.ingreso_articulos.entity.DetalleIngreso;

public interface DetalleIngresoRepository extends JpaRepository<DetalleIngreso, Integer> {
}
