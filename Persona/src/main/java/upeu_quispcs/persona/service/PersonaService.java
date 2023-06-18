package upeu_quispcs.persona.service;


import upeu_quispcs.persona.entiry.Persona;

import java.util.List;
import java.util.Optional;

public interface PersonaService {
    public List<Persona> listar();

    public Persona guardar(Persona persona);

    public Persona actualizar(Persona persona);

    public Optional<Persona> listarPorId(Integer id);

    public void eliminarPorId(Integer id);
}
