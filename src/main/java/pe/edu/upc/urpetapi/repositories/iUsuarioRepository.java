package pe.edu.upc.urpetapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.upc.urpetapi.dtos.ListarPaseadoresDto;
import pe.edu.upc.urpetapi.entities.Usuario;

import java.util.List;


@Repository
public interface iUsuarioRepository extends JpaRepository<Usuario, Integer> {
    public Usuario findByUsername(String username);
    public Boolean existsByUsername(String username);
    @Transactional
    @Modifying
    @Query(value = "insert into Rol (rol, usuario_id) VALUES (:rol, :user_id)", nativeQuery = true)
    public void insRol(@Param("rol") String rol, @Param("user_id") int  user_id);

    @Transactional
    @Modifying
    @Query(value = "insert into Paseador (paseador_descripcion,paseador_edad,paseador_estado, \n " +
            "paseador_facebook,paseador_hora_fin,paseador_hora_inicio,paseador_instagram, \n " +
            "paseador_latitud,paseador_longitud,paseador_precio,paseador_slogan,paseador_validado, \n " +
            "usuario_id) values ('','2000-01-01','DISPONIBLE','','20:00:00','08:00:00','', \n " +
            "-12.197769,-77.008055,0,'',false,:user_id) ", nativeQuery = true)
    public void insPas(@Param("user_id") int user_id);
}