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

    @Override
    public Usuario infoUsuario(String username) { return useR.findByUsername(username); }

    @Override
    public void insRol(String rol, int user_id) {
        useR.insRol(rol,user_id);
    }

    @Override
    public int insertAndGetId(Usuario usuario) {
        Usuario newUser=useR.save(usuario);
        return newUser.getUsuarioId();
    }

    @Override
    public void insPas(int user_id) {
        useR.insPas(user_id);
    }
}
