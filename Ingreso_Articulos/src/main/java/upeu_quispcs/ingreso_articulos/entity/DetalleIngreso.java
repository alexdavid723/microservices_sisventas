package upeu_quispcs.ingreso_articulos.entity;
import jakarta.persistence.*;
@Entity
@Table(name = "detalle_ingreso")
public class DetalleIngreso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "ingreso_id")
    private Ingreso ingreso;
    @Column(name = "cantidad")
    private int cantidad;
    private Double precio_ingreso;

}
