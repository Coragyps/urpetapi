package pe.edu.upc.urpetapi.services;

import org.springframework.data.repository.query.Param;
import pe.edu.upc.urpetapi.entities.Usuario;

import java.util.List;

public interface iUsuarioService {
    public void insert(Usuario usuario);
    public void delete(int id);
    public List<Usuario> list();
    public Usuario listId(int id);
    public Boolean existeNombre(String username);
    public Usuario infoUsuario(String username);
    public void insRol (String rol, int user_id);
    public int insertAndGetId(Usuario usuario);
    public void insPas(int user_id);
}
