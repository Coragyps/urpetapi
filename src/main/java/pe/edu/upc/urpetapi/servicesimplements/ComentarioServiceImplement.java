package pe.edu.upc.urpetapi.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.urpetapi.entities.Comentario;
import pe.edu.upc.urpetapi.repositories.iComentarioRepository;
import pe.edu.upc.urpetapi.servicesinterfaces.iComentarioService;

import java.util.List;

@Service
public class ComentarioServiceImplement implements iComentarioService {
    @Autowired
    private iComentarioRepository comR;

    @Override//---------------------------HU15: Dejar Comentario
    public void DejarComentario(Comentario comentario) {
        comR.save(comentario);
    }

    @Override//---------------------------HU05: Revisar Comentarios
    public List<Comentario> ComentarioPorPaseador(String username) {
        return comR.ComentarioPorPaseador(username);
    }

    @Override//---------------------------HU26: Paseador con mejor Puntuación
    public List<Comentario> MayorPuntuacionPaseador() {
        return MayorPuntuacionPaseador();
    }

    @Override//---------------------------HU16: Comentario con Menor Puntuacion
    public List<Comentario> PeorComentario(String username) {
        return comR.PeorComentario(username);
    }

}
