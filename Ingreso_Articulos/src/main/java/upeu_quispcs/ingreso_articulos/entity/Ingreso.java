package upeu_quispcs.ingreso_articulos.entity;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;
@Entity
@Data
@Table(name = "ingreso")
public class Ingreso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String tipo_comprobante;
    private String serie_comprobante;
    private String num_comprobante;
    private LocalDate fecha;
    private Double impuesto;
    private Double total;
    private String estado;

}
