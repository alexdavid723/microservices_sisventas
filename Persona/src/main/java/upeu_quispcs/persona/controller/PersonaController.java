package upeu_quispcs.persona.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import upeu_quispcs.persona.entiry.Persona;
import upeu_quispcs.persona.service.PersonaService;

import java.util.List;

@RestController
@RequestMapping("/persona")
public class PersonaController {
    @Autowired
    private PersonaService personaService;

    @GetMapping()
    public ResponseEntity<List<Persona>> list() {
        return ResponseEntity.ok().body(personaService.listar());
    }

    @PostMapping()
    public ResponseEntity<Persona> save(@RequestBody Persona persona) {
        return ResponseEntity.ok(personaService.guardar(persona));
    }

    @PutMapping()
    public ResponseEntity<Persona> update(@RequestBody Persona persona) {
        return ResponseEntity.ok(personaService.actualizar(persona));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Persona> listById(@PathVariable(required = true) Integer id) {
        return ResponseEntity.ok().body(personaService.listarPorId(id).get());
    }

    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable(required = true) Integer id) {
        personaService.eliminarPorId(id);
        return "Eliminacion Correcta";
    }
}
