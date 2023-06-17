package upeu_quispcs.ingreso_articulos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import upeu_quispcs.ingreso_articulos.entity.DetalleIngreso;
import upeu_quispcs.ingreso_articulos.service.DetalleIngresoService;

import java.util.List;
@RestController
@RequestMapping("/DetalleIngreso")
public class DetalleIngresoController {
    @Autowired
    private DetalleIngresoService detalleIngresoService;

    @GetMapping()
    public List<DetalleIngreso> listar() {
        return detalleIngresoService.listar();
    }

    @PostMapping()
    public DetalleIngreso guardar(@RequestBody DetalleIngreso detalleIngreso) {
        return detalleIngresoService.guardar(detalleIngreso);
    }

    @GetMapping("/{id}")

    public ResponseEntity<DetalleIngreso> listById(@PathVariable(required = true) Integer id) {
        return ResponseEntity.ok().body(detalleIngresoService.listarPorId(id).get());
    }
    @PutMapping()
    public DetalleIngreso actualizar(@RequestBody DetalleIngreso detalleIngreso){
        return detalleIngresoService.actualizar(detalleIngreso);
    }
    @DeleteMapping("/{id}")
    public void eliminarPorId(@PathVariable(required = true) Integer id ){
        detalleIngresoService.eliminarPorId(id);
    }
}
