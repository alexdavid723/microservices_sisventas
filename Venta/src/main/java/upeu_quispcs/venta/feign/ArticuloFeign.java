package upeu_quispcs.venta.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import upeu_quispcs.venta.dto.Articulo;
@FeignClient(name = "categoria-service", path = "/articulo")
public interface ArticuloFeign {
    @GetMapping("/{id}")
    public ResponseEntity<Articulo> listById(@PathVariable(required = true) Integer id) ;
}
