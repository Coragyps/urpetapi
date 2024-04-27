package pe.edu.upc.urpetapi.servicesinterfaces;

import pe.edu.upc.urpetapi.entities.Comentario;

import java.util.List;

public interface iComentarioService {
    public void DejarComentario(Comentario comentario);//---------------------------HU15: Dejar Comentario

    public List<Comentario> ComentarioPorPaseador(String username);//---------------------------HU05: Revisar Comentarios

    public List<Comentario> MayorPuntuacionPaseador();//---------------------------HU26: Paseador con mejor Puntuación

    public List<Comentario> PeorComentario(String username);//---------------------------HU16: Comentario con Menor Puntuacion

}
