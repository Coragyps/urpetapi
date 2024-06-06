package pe.edu.upc.urpetapi.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.urpetapi.entities.Usuario;
import pe.edu.upc.urpetapi.repositories.iUsuarioRepository;
import pe.edu.upc.urpetapi.services.iUsuarioService;

import java.util.List;

@Service
public class UsuarioServiceImplement implements iUsuarioService {
    @Autowired
    private iUsuarioRepository useR;

    @Override
    public void insert(Usuario usuario) {
        useR.save(usuario);
    }

    @Override
    public void delete(int id) {
        useR.deleteById(id);
    }

    @Override
    public List<Usuario> list() {
        return useR.findAll();
    }

    @Override
    public Usuario listId(int id) {
        return useR.findById(id).orElse(new Usuario());
    }

    @Override
    public Boolean existeNombre(String username) {
        return useR.existsByUsername(username);
    }
}
