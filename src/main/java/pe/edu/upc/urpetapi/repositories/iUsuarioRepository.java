package pe.edu.upc.urpetapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.urpetapi.dtos.ListarPaseadoresDTO;
import pe.edu.upc.urpetapi.entities.Usuario;

import java.util.List;


@Repository
public interface iUsuarioRepository extends JpaRepository<Usuario, Integer> {
    public Usuario findByUsername(String username);
    @Query(value = "select u.usuario_id, u.paseador_descripcion, u.paseador_edad, u.paseador_facebook, u.paseador_hora_fin, \n" +
            "u.paseador_hora_inicio, u.paseador_instagram, u.paseador_latitud, u.paseador_longitud, \n" +
            "u.paseador_precio, u.paseador_slogan, u.paseador_validado, u.usuario_correo, u.usuario_estado, \n " +
            "u.usuario_foto, u.usuario_nombre, u.usuario_telefono \n" +
            "from usuario u \n " +
            "join rol r on u.usuario_id = r.user_id \n " +
            "where r.rol_tipo = 'PASEADOR' and \n " +
            "u.usuario_estado = 'DISPONIBLE'", nativeQuery = true)
    public List<ListarPaseadoresDTO> ListarPaseadores();
}