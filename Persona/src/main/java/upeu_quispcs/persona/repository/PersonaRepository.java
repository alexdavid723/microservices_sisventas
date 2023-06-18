package upeu_quispcs.persona.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import upeu_quispcs.persona.entiry.Persona;

public interface PersonaRepository extends JpaRepository<Persona, Integer> {
}
