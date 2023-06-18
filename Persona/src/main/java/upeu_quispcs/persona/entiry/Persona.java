package upeu_quispcs.persona.entiry;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String tipo_persona;
    private String nombre;
    private String apellidos;
    private String num_documento;
    private String direccion;
    private String telefono;
    private String email;
}
