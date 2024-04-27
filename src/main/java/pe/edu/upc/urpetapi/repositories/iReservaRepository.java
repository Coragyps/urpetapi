package pe.edu.upc.urpetapi.repositories;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;
import pe.edu.upc.urpetapi.entities.Reserva;

import java.util.List;

@Repository
public interface iReservaRepository extends JpaRepository<Reserva, Integer> {
    @Query(value = "select r.* from reserva r \n " +
            "join mascota m on m.mascota_id = r.mascota_id \n " +
            "join usuario u on u.usuario_id = m.usuario_id \n " +
            "where u.username = :username ", nativeQuery = true)
    public List<Reserva> ReservaPorCliente(@Param("username") String username);//---------------------------HU14: Revisar Historial de Paseos Adquiridos

    @Query(value = "select u.username, count(r.reserva_id) from reserva r \n " +
            "join mascota m on m.mascota_id = r.mascota_id \n " +
            "join usuario u on u.usuario_id =m.usuario_id \n " +
            "join paseador p on p.paseador_id = r.paseador_id \n " +
            "join usuario pas on pas.usuario_id =p.usuario_id \n " +
            "where pas.username =:username \n " +
            "group by u.username ", nativeQuery = true)
    public List<String[]> PaseosporCliente(@Param("username") String username);//---------------------------HU17: Cantidad de Paseos por Cliente

    @Query(value = "select r.* from reserva r \n " +
            "join paseador p on p.paseador_id =r.paseador_id \n " +
            "join usuario u on u.usuario_id = p.usuario_id \n " +
            "where r.reserva_estado ='FINALIZADA' and u.username = :username ", nativeQuery = true)
    public List<Reserva> ReservaPorPaseador(@Param("username") String username);//---------------------------HU04: Revisar Historial de Paseos Completados

    @Query(value = "select r.* from reserva r \n " +
            "join paseador p on p.paseador_id =r.paseador_id \n " +
            "join usuario u on u.usuario_id = p.usuario_id \n " +
            "where r.reserva_estado ='PENDIENTE' and u.username = :username ", nativeQuery = true)
    public List<Reserva> PaseosPendientes(@Param("username") String username);//---------------------------HU02: Revisar Paseos Pendientes

    @Query(value = "select r.* from reserva r \n " +
            "join paseador p on p.paseador_id =r.paseador_id \n " +
            "join usuario u on u.usuario_id = p.usuario_id \n " +
            "where r.reserva_estado ='ACEPTADA' and u.username = :username ", nativeQuery = true)
    public List<Reserva> PaseosAceptados(@Param("username") String username);//---------------------------HU35: Revisar Paseos Aceptados

    @Query(value = "select r.* from reserva r \n " +
            "join paseador p on p.paseador_id =r.paseador_id \n " +
            "join usuario u on u.usuario_id = p.usuario_id \n " +
            "where r.reserva_estado ='RECHAZADA' and u.username = :username ", nativeQuery = true)
    public List<Reserva> PaseosRechazados(@Param("username") String username);//---------------------------HU36: Revisar Paseos Rechazados

    @Modifying
    @Transactional
    @Query(value = "update reserva set reserva_estado = 'RECHAZADA' \n " +
            "where reserva_id = :id ", nativeQuery = true)
    public void Rechazar(@Param("id") Integer id);//---------------------------HU03: Confirmar Paseo

    @Modifying
    @Transactional
    @Query(value = "update reserva set reserva_estado = 'ACEPTADA' \n " +
            "where reserva_id = :id ", nativeQuery = true)
    public void Aceptar(@Param("id") Integer id);//---------------------------HU03: Confirmar Paseo

    @Modifying
    @Transactional
    @Query(value = "update reserva set reserva_estado = 'FINALIZADA' \n " +
            "where reserva_id = :id ", nativeQuery = true)
    public void Finalizar(@Param("id") Integer id);//---------------------------HU28: Terminar Paseo


}
