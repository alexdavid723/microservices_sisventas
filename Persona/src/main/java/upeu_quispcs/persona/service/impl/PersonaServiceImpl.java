package upeu_quispcs.persona.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import upeu_quispcs.persona.entiry.Persona;
import upeu_quispcs.persona.repository.PersonaRepository;
import upeu_quispcs.persona.service.PersonaService;

import java.util.List;
import java.util.Optional;

@Service
public class PersonaServiceImpl implements PersonaService {
    @Autowired
    private PersonaRepository personaRepository;

    @Override
    public List<Persona> listar() {
        return personaRepository.findAll();
    }

    @Override
    public Persona guardar(Persona persona) {
        return personaRepository.save(persona);
    }

    @Override
    public Persona actualizar(Persona persona) {
        return personaRepository.save(persona);
    }

    @Override
    public Optional<Persona> listarPorId(Integer id) {
        return personaRepository.findById(id);
    }

    @Override
    public void eliminarPorId(Integer id) {
        personaRepository.deleteById(id);
    }
}
