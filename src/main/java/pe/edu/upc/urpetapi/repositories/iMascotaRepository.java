package pe.edu.upc.urpetapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.urpetapi.entities.Mascota;

@Repository
public interface iMascotaRepository extends JpaRepository<Mascota, Integer> {
}
