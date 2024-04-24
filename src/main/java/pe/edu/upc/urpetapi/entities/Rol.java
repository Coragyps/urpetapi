package pe.edu.upc.urpetapi.entities;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "Rol", uniqueConstraints = {@UniqueConstraint(columnNames = {"user_id", "rol"})})
public class Rol implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int RolId;

    private String RolTipo;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private Usuario user;

    public Rol() {
    }

    public Rol(int rolId, String rolTipo, Usuario user) {
        RolId = rolId;
        RolTipo = rolTipo;
        this.user = user;
    }

    public Usuario getUser() {
        return user;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }

    public int getId() {
        return RolId;
    }

    public void setId(int id) {
        this.RolId = id;
    }

    public String getRolTipo() {
        return RolTipo;
    }

    public void setRolTipo(String rol) {
        this.RolTipo = rol;
    }

}