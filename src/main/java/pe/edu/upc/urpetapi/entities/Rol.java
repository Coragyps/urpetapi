package pe.edu.upc.urpetapi.entities;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "Rol")
public class Rol implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String rol;

    @ManyToOne
    @JoinColumn(name = "usuario_id", nullable = false)
    private Usuario user;

    public Rol() {
    }

    public Rol(int id, String rol, Usuario user) {
        this.id = id;
        this.rol = rol;
        this.user = user;
    }


    public Usuario getUser() {
        return user;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

}