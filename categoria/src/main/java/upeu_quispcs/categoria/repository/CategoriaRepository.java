package upeu_quispcs.categoria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import upeu_quispcs.categoria.entity.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {
}
