package pe.edu.upc.urpetapi.dtos;

import pe.edu.upc.urpetapi.entities.Usuario;

public class RolDto {
    private int RolId;
    private String RolTipo;
    private Usuario usuario;

    public int getRolId() {
        return RolId;
    }

    public void setRolId(int rolId) {
        RolId = rolId;
    }

    public String getRolTipo() {
        return RolTipo;
    }

    public void setRolTipo(String rolTipo) {
        RolTipo = rolTipo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
