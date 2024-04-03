package pe.edu.upc.urpetapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.urpetapi.entities.Comentario;

@Repository
public interface iComentarioRepository extends JpaRepository<Comentario, Integer> {
}
