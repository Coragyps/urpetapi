package pe.edu.upc.urpetapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.urpetapi.entities.Comentario;

import java.util.List;

@Repository
public interface iComentarioRepository extends JpaRepository<Comentario, Integer> {
    @Query(value = "select c.* from comentario c \n " +
            "join reserva r on c.reserva_id = r.reserva_id \n " +
            "join paseador p on r.paseador_id = p.paseador_id \n " +
            "join usuario u on u.usuario_id =p.usuario_id \n " +
            "where u.username = :username", nativeQuery = true)
    public List<Comentario> ComentarioPorPaseador(@Param("username") String username);//---------------------------HU05: Revisar Comentarios

    @Query(value = "select u.usuario_id, u.username, avg(c.comentario_puntuacion) as promedio from comentario c \n " +
            "join reserva r on c.reserva_id = r.reserva_id\n " +
            "join paseador p on p.paseador_id = r.paseador_id \n " +
            "join usuario u on u.usuario_id =p.usuario_id \n " +
            "group by u.usuario_id order by promedio desc \n " +
            "limit 1 ", nativeQuery = true)
    public List<Comentario> MayorPuntuacionPaseador();//---------------------------HU26: Paseador con mejor Puntuación

    @Query(value = "select c.* from comentario c \n " +
            "join reserva r on c.reserva_id = r.reserva_id \n " +
            "join paseador p on p.paseador_id = r.paseador_id \n " +
            "join usuario u on u.usuario_id =p.usuario_id \n " +
            "order by c.comentario_puntuacion asc \n " +
            "limit 1 ", nativeQuery = true)
    public List<Comentario> PeorComentario(@Param("username") String username);//---------------------------HU16: Comentario con Menor Puntuacion
}
