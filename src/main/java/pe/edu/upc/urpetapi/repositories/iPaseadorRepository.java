package pe.edu.upc.urpetapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.urpetapi.dtos.ListarPaseadoresDto;
import pe.edu.upc.urpetapi.entities.Paseador;

import java.util.List;

@Repository
public interface iPaseadorRepository extends JpaRepository<Paseador, Integer> {
    @Query(value = "select u.usuario_nombre, u.usuario_telefono, u.usuario_correo, u.usuario_foto, p.* from paseador p \n " +
            "join usuario u on u.usuario_id =p.usuario_id \n " +
            "where p.paseador_estado = 'DISPONIBLE'", nativeQuery = true)
    public List<ListarPaseadoresDto> ListarPaseadores();//---------------------------HU09: Revisar Paseadores Disponibles

    @Query(value = "select u.usuario_nombre, u.usuario_telefono, u.usuario_correo, u.usuario_foto, p.* from paseador p \n " +
            "join usuario u on u.usuario_id =p.usuario_id \n " +
            "where u.username = :username", nativeQuery = true)
    public List<ListarPaseadoresDto> InfoPaseador(@Param("username") String username);//---------------------------HU27: Revisar Perfil

    @Query(value = "select u.usuario_nombre, u.usuario_telefono, u.usuario_correo, u.usuario_foto, p.* from paseador p \n " +
            "join usuario u on u.usuario_id =p.usuario_id \n " +
            "where p.paseador_estado = 'DISPONIBLE' \n " +
            "order by p.paseador_precio asc limit 1", nativeQuery = true)
    public List<ListarPaseadoresDto> PaseadorMasBarato();//---------------------------HU10: Tarifa mas Accesible
}
