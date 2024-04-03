package pe.edu.upc.urpetapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.urpetapi.entities.Boleta;

@Repository
public interface iBoletaRepository extends JpaRepository<Boleta, Integer> {
}
