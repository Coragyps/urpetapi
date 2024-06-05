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
    @Modifying
    @Transactional
    @Query(value = "update reserva set reserva_estado = :estado \n " +
            "where reserva_id = :idreserva ", nativeQuery = true)
    public void Estado(@Param("idreserva") Integer idreserva, @Param("estado") String estado);//---------------------------HU03: Confirmar Paseo

    @Query(value = "select r.* from reserva r \n " +
            "join paseador p on p.paseador_id =r.paseador_id \n " +
            "join usuario u on u.usuario_id = p.usuario_id \n " +
            "where r.reserva_estado = :estado and u.usuario_id = :idpaseador ", nativeQuery = true)
    public List<Reserva> EstadoPaseador(@Param("idpaseador") int idpaseador, @Param("estado") String estado);//---------------------------HU04: Revisar Historial de Paseos Completados

    @Query(value = "select r.* from reserva r \n " +
            "join paseador p on p.paseador_id =r.paseador_id \n " +
            "join usuario u on u.usuario_id = p.usuario_id \n " +
            "where u.usuario_id = :idpaseador ", nativeQuery = true)
    public List<Reserva> TodoPaseador(@Param("idpaseador") int idpaseador);

    @Query(value = "select r.* from reserva r \n " +
            "join mascota m on m.mascota_id = r.mascota_id \n " +
            "join usuario u on u.usuario_id = m.usuario_id \n " +
            "where r.reserva_estado = :estado and u.usuario_id = :idusuario ", nativeQuery = true)
    public List<Reserva> EstadoUsuario(@Param("idusuario") int idusuario, @Param("estado") String estado);

    @Query(value = "select r.* from reserva r \n " +
            "join mascota m on m.mascota_id = r.mascota_id \n " +
            "join usuario u on u.usuario_id = m.usuario_id \n " +
            "where u.usuario_id = :idusuario ", nativeQuery = true)
    public List<Reserva> TodoUsuario(@Param("idusuario") int idusuario);//---------------------------HU14: Revisar Historial de Paseos Adquiridos

    @Query(value = "select u.username, count(r.reserva_id) from reserva r \n " +
            "join mascota m on m.mascota_id = r.mascota_id \n " +
            "join usuario u on u.usuario_id =m.usuario_id \n " +
            "join paseador p on p.paseador_id = r.paseador_id \n " +
            "join usuario pas on pas.usuario_id =p.usuario_id \n " +
            "where pas.usuario_id = :idpaseador \n " +
            "group by u.username ", nativeQuery = true)
    public List<String[]> PaseosporCliente(@Param("idpaseador") int idpaseador);//---------------------------HU17: Cantidad de Paseos por Cliente
}
