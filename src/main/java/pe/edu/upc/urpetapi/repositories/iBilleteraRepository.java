package pe.edu.upc.urpetapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.urpetapi.entities.Billetera;

@Repository
public interface iBilleteraRepository extends JpaRepository<Billetera, Integer> {
}
