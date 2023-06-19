package upeu_quispcs.venta.entiry;

import jakarta.persistence.*;
import lombok.Data;
import upeu_quispcs.venta.dto.Articulo;

@Entity
@Data
public class VentaDetalle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Transient
    private Articulo articulo;
    private Double cantidad;
    private Double precio;
    private Integer articuloId;
    public VentaDetalle() {
        this.cantidad = (double) 0;
        this.precio = (double) 0;
    }

    public Integer getArticuloId() {
        return articuloId;
    }

    public void setArticuloId(Integer articuloId) {
        this.articuloId = articuloId;
    }
}
