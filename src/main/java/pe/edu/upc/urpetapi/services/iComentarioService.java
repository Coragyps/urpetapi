package pe.edu.upc.urpetapi.services;

import pe.edu.upc.urpetapi.entities.Comentario;

import java.util.List;

public interface iComentarioService {
    public void insert(Comentario comentario);
    public void delete(int id);
    public List<Comentario> list();
    public Comentario listId(int id);

}
