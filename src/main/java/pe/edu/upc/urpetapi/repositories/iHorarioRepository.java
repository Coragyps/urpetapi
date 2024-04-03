package pe.edu.upc.urpetapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.urpetapi.entities.Horario;

@Repository
public interface iHorarioRepository extends JpaRepository<Horario, Integer> {
}
