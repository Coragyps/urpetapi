package pe.edu.upc.urpetapi.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.urpetapi.dtos.ListarPaseadoresDto;
import pe.edu.upc.urpetapi.entities.Usuario;
import pe.edu.upc.urpetapi.repositories.iUsuarioRepository;
import pe.edu.upc.urpetapi.servicesinterfaces.iUsuarioService;

import java.util.List;

@Service
public class UsuarioServiceImplement implements iUsuarioService {
    @Autowired
    private iUsuarioRepository useR;

    @Override//---------------------------HU18: Registrarse en la Aplicacion
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
}
