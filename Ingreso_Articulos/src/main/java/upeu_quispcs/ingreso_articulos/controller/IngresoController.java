package upeu_quispcs.ingreso_articulos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import upeu_quispcs.ingreso_articulos.entity.Ingreso;
import upeu_quispcs.ingreso_articulos.service.IngresoService;

import java.util.List;
@RestController
@RequestMapping("/Ingreso")

public class IngresoController {
    @Autowired
    private IngresoService ingresoService;

    @GetMapping()
    public ResponseEntity<List<Ingreso>> list() {
        return ResponseEntity.ok().body(ingresoService.listar());
    }

    @PostMapping()
    public Ingreso guardar(@RequestBody Ingreso ingreso) {
        return ingresoService.guardar(ingreso);
    }

    @PutMapping()
    public Ingreso actualizar(@RequestBody Ingreso ingreso){
        return ingresoService.actualizar(ingreso);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Ingreso> listById(@PathVariable(required = true) Integer id) {
        return ResponseEntity.ok().body(ingresoService.listarPorId(id).get());
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable(required = true) Integer id) {
        ingresoService.eliminarPorId(id);
    }
}
