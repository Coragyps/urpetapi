package pe.edu.upc.urpetapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.urpetapi.entities.Usuario;


@Repository
public interface iUsuarioRepository extends JpaRepository<Usuario, Integer> {
    public Usuario findByUsername(String username);
}