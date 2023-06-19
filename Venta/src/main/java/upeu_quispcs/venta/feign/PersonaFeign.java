package upeu_quispcs.venta.feign;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.cloud.openfeign.FeignClient;
import upeu_quispcs.venta.dto.Persona;
@FeignClient(name = "persona-service", path = "/persona")
public interface PersonaFeign {
    @GetMapping("/{id}")
    public ResponseEntity<Persona> listById(@PathVariable(required = true) Integer id);
}
