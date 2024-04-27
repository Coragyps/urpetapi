package pe.edu.upc.urpetapi.repositories;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.urpetapi.entities.Billetera;

import java.util.List;

@Repository
public interface iBilleteraRepository extends JpaRepository<Billetera, Integer> {
    @Query(value = "select b.* from billetera b \n " +
            "join usuario u on b.usuario_id = u.usuario_id \n " +
            "where u.username = :username", nativeQuery = true)
    public List<Billetera> BilleteraPorUsuario(@Param("username") String username);//---------------------------HU21: Revisar Monto de la Billetera Virtual

    @Modifying
    @Transactional
    @Query(value = "update billetera set billetera_monto = billetera_monto + :cantidad \n " +
            "where billetera_id = :id ", nativeQuery = true)
    public void RecargarBilleter(@Param("id") Integer id, @Param("cantidad") double cantidad);//---------------------------HU22: Recargar Billetera Virtual

    @Modifying
    @Transactional
    @Query(value = "update billetera set billetera_monto = billetera_monto - :cantidad \n " +
            "where billetera_id = :id ", nativeQuery = true)
    public void UsarBilleter(@Param("id") Integer id, @Param("cantidad") double cantidad);//---------------------------HU13: Pagar con Billetera Virtual
}
