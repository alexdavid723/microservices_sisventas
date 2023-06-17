package upeu_quispcs.categoria.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import upeu_quispcs.categoria.entity.Articulo;
import upeu_quispcs.categoria.service.ArticuloService;

import java.util.List;
@RestController
@RequestMapping("/articulo")

public class ArticuloController {
    @Autowired
    private ArticuloService articuloService;

    @GetMapping()
    public List<Articulo> listar() {
        return articuloService.listar();
    }

    @PostMapping()
    public Articulo guardar(@RequestBody Articulo articulo) {
        return articuloService.guardar(articulo);
    }

    @GetMapping("/{id}")

    public ResponseEntity<Articulo> listById(@PathVariable(required = true) Integer id) {
        return ResponseEntity.ok().body(articuloService.listarPorId(id).get());
    }
    @PutMapping()
    public Articulo actualizar(@RequestBody Articulo articulo){
        return articuloService.actualizar(articulo);
    }
    @DeleteMapping("/{id}")
    public void eliminarPorId(@PathVariable(required = true) Integer id ){
        articuloService.eliminarPorId(id);
    }
}
