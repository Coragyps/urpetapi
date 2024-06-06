package pe.edu.upc.urpetapi.servicesinterfaces;

import pe.edu.upc.urpetapi.entities.Usuario;

import java.util.List;

public interface iUsuarioService {
    public void insert(Usuario usuario);//---------------------------HU18: Registrarse en la Aplicacion
    public void delete(int id);
    public List<Usuario> list();
    public Usuario listId(int id);
}
