package pe.edu.upc.urpetapi.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.urpetapi.entities.Comentario;
import pe.edu.upc.urpetapi.repositories.iComentarioRepository;
import pe.edu.upc.urpetapi.services.iComentarioService;

import java.util.List;

@Service
public class ComentarioServiceImplement implements iComentarioService {
    @Autowired
    private iComentarioRepository comR;


    @Override
    public void insert(Comentario comentario) {
        comR.save(comentario);
    }

    @Override
    public void delete(int id) {
        comR.deleteById(id);
    }

    @Override
    public List<Comentario> list() {
        return comR.findAll();
    }

    @Override
    public Comentario listId(int id) {
        return comR.findById(id).orElse(new Comentario());
    }
}
