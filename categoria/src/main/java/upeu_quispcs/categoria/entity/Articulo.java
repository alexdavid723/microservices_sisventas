package upeu_quispcs.categoria.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Articulo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "categoria_id")
    @JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
    private Categoria categoria;
    private String nombre;
    private String codigo;
    private Double precio_venta;
    private int stock;
    private String descrpcion;
    @Column(columnDefinition = "BIT")
    private Boolean estado;

}
