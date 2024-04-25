package pe.edu.upc.urpetapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.urpetapi.dtos.BoletaDto;
import pe.edu.upc.urpetapi.entities.Boleta;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface iBoletaRepository extends JpaRepository<Boleta, Integer> {

    @Query(value = "select * from boleta \n" +
            "where boleta_fecha between :fechaA and :fechaB ",nativeQuery = true)
    public List<BoletaDto> BoletasFechas(@Param("fechaA") LocalDate fechaA, @Param("fechaB") LocalDate fechaB);
}
