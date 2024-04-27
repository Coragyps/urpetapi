package pe.edu.upc.urpetapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.urpetapi.entities.Billetera;
import pe.edu.upc.urpetapi.entities.Mascota;

import java.util.List;

@Repository
public interface iMascotaRepository extends JpaRepository<Mascota, Integer> {
    @Query(value = "select m.* from mascota m \n " +
            "join usuario u on m.usuario_id = u.usuario_id \n " +
            "where u.username = :username and m.mascota_habilitado = true", nativeQuery = true)
    public List<Mascota> MascotaPorUsuario(@Param("username") String username);//---------------------------HU08: Revisar Mascotas Registradas
}
