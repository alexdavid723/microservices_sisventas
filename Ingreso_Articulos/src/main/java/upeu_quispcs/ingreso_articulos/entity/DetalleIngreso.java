package upeu_quispcs.ingreso_articulos.entity;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "detalle_ingreso")
public class DetalleIngreso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private int cantidad;
    private Double precio_ingreso;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ingreso_id")
    @JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
    private Ingreso ingreso;

}
