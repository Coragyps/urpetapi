package pe.edu.upc.urpetapi.repositories;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.urpetapi.entities.Membresia;

import java.util.List;

@Repository
public interface iMembresiaRepository extends JpaRepository<Membresia, Integer> {
    @Query(value = "select m.* from membresia m \n " +
            "join usuario u on u.usuario_id = m.usuario_id \n " +
            "where u.username = :username ", nativeQuery = true)
    public List<Membresia> MembresiaPorUsuario(@Param("username") String username);//---------------------------HU23: Revisar Historial de Membresías

    @Query(value = "select m.* from membresia m \n " +
            "where m.membresia_estado = 'ACTIVA' ", nativeQuery = true)
    public List<Membresia> MembresiasActivas();//---------------------------HU12: Revisar Membresias Activas

    @Modifying
    @Transactional
    @Query(value = "update membresia  set membresia_estado  = 'CANCELADA' \n " +
            "where membresia_id = :id ", nativeQuery = true)
    public void Cancelar(@Param("id") Integer id);//---------------------------HU25: Cancelar Membresia
}
