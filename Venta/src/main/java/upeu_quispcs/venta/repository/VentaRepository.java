package upeu_quispcs.venta.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import upeu_quispcs.venta.entity.Venta;

public interface VentaRepository extends JpaRepository<Venta, Integer> {
}
