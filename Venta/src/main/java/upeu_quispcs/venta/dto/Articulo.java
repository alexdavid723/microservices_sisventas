package upeu_quispcs.venta.dto;

import lombok.Data;

@Data
public class Articulo {
    private Integer id;
    private Categoria categoria;
    private String nombre;
    private String codigo;
    private Double precio_venta;
    private int stock;
    private String descrpcion;
    private Boolean estado;
}
