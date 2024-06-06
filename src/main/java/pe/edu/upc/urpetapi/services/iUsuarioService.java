package pe.edu.upc.urpetapi.services;

import pe.edu.upc.urpetapi.entities.Usuario;

import java.util.List;

public interface iUsuarioService {
    public void insert(Usuario usuario);
    public void delete(int id);
    public List<Usuario> list();
    public Usuario listId(int id);
    public Boolean existeNombre(String username);
}
