package upeu_quispcs.venta.dto;

import lombok.Data;

@Data
public class Persona {
    private Integer id;
    private String tipo_persona;
    private String nombre;
    private String apellidos;
    private String num_documento;
    private String direccion;
    private String telefono;
    private String email;
}
