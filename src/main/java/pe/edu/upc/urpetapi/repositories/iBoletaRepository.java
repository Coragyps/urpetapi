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
            "where boleta_fecha between :fechaA and :fechaB ", nativeQuery = true)
    public List<BoletaDto> BoletasFechas(@Param("fechaA") LocalDate fechaA, @Param("fechaB") LocalDate fechaB);//---------------------------HU06: Revisar Boletas por Año

    @Query(value = "select 1 as bol, '2000-01-01' as dat, sum(b.boleta_impuesto) , b.boleta_moneda, sum(b.boleta_monto), 1 as res from boleta b \n " +
            "join reserva r on r.reserva_id = b.reserva_id \n " +
            "group by b.boleta_moneda ", nativeQuery = true)
    public List<BoletaDto> IngresoTotal();//---------------------------HU19: Revisar Ingreso Total

    @Query(value = "select b.* from boleta b \n " +
            "join reserva r ON b.reserva_id = r.reserva_id \n " +
            "join mascota m on m.mascota_id =r.mascota_id \n " +
            "join usuario u on u.usuario_id =m.usuario_id \n " +
            "where u.username = :username ", nativeQuery = true)
    public List<BoletaDto> BoletasPorUsuario(@Param("username") String usename);//---------------------------HU33: Revisar Boletas
}
