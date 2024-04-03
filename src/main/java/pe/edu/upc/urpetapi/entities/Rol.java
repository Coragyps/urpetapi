package pe.edu.upc.urpetapi.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Rol")
public class Rol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int RolId;
    @Column(name = "RolTipo", nullable = false, length = 20)
    private String RolTipo;

    public Rol() {
    }

    public Rol(int rolId, String rolTipo) {
        RolId = rolId;
        RolTipo = rolTipo;
    }

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
}
