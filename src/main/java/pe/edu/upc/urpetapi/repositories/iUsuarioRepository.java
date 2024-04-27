package pe.edu.upc.urpetapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.urpetapi.dtos.ListarPaseadoresDto;
import pe.edu.upc.urpetapi.entities.Usuario;

import java.util.List;


@Repository
public interface iUsuarioRepository extends JpaRepository<Usuario, Integer> {
    public Usuario findByUsername(String username);
}