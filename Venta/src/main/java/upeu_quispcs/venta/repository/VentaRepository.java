package upeu_quispcs.venta.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import upeu_quispcs.venta.entiry.Venta;

public interface VentaRepository extends JpaRepository<Venta, Integer> {
}
