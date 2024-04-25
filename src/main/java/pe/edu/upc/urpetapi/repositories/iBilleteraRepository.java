package pe.edu.upc.urpetapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.urpetapi.entities.Billetera;

import java.util.List;

@Repository
public interface iBilleteraRepository extends JpaRepository<Billetera, Integer> {
    @Query(value = "select b.* from billetera b \n " +
            "join usuario u on b.usuario_id = u.usuario_id \n " +
            "where u.username = :username",nativeQuery = true)
    public List<Billetera> BilleteraPorUsuario(@Param("username") String username);
}
