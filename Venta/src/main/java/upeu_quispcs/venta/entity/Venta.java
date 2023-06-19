package upeu_quispcs.venta.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;
import upeu_quispcs.venta.dto.Persona;

import java.util.List;
@Entity
@Data
public class Venta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String tipo_comprobante;
    private String serie_comprobante;
    private String numero_comprobante;
    private String fecha;
    private Double impuesto;
    private Double total;
    private String estado;
    private Integer personaId;
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "venta_id")
    private List<VentaDetalle> detalle;
    @Transient
    private Persona persona;

    public Integer getPersonaId() {
        return personaId;
    }

    public void setPersonaId(Integer personaId) {
        this.personaId = personaId;
    }

    public List<VentaDetalle> getDetalle() {
        return detalle;
    }

    public void setDetalle(List<VentaDetalle> detalle) {
        this.detalle = detalle;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
}
