package pe.edu.upc.urpetapi.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int UsuarioId;
    @Column(name = "UsuarioNombre",length = 50,nullable = false)
    private String UsuarioNombre;
    @Column(name = "UsuarioCorreo",length = 50,nullable = false)
    private String UsuarioCorreo;
    @Column(name = "UsuarioTelefono",length = 15,nullable = false)
    private String UsuarioTelefono;
    @Column(name = "UsuarioEstado",length = 20,nullable = false)
    private String UsuarioEstado;
    @Column(name = "UsuarioPassword",length = 20,nullable = false)
    private String UsuarioPassword;
    @Column(name = "UsuarioPuntuacion",nullable = false)
    private double UsuarioPuntuacion;

    public Usuario() {
    }

    public Usuario(int usuarioId, String usuarioNombre, String usuarioCorreo, String usuarioTelefono, String usuarioEstado, String usuarioPassword, double usuarioPuntuacion) {
        UsuarioId = usuarioId;
        UsuarioNombre = usuarioNombre;
        UsuarioCorreo = usuarioCorreo;
        UsuarioTelefono = usuarioTelefono;
        UsuarioEstado = usuarioEstado;
        UsuarioPassword = usuarioPassword;
        UsuarioPuntuacion = usuarioPuntuacion;
    }

    public int getUsuarioId() {
        return UsuarioId;
    }

    public void setUsuarioId(int usuarioId) {
        UsuarioId = usuarioId;
    }

    public String getUsuarioNombre() {
        return UsuarioNombre;
    }

    public void setUsuarioNombre(String usuarioNombre) {
        UsuarioNombre = usuarioNombre;
    }

    public String getUsuarioCorreo() {
        return UsuarioCorreo;
    }

    public void setUsuarioCorreo(String usuarioCorreo) {
        UsuarioCorreo = usuarioCorreo;
    }

    public String getUsuarioTelefono() {
        return UsuarioTelefono;
    }

    public void setUsuarioTelefono(String usuarioTelefono) {
        UsuarioTelefono = usuarioTelefono;
    }

    public String getUsuarioEstado() {
        return UsuarioEstado;
    }

    public void setUsuarioEstado(String usuarioEstado) {
        UsuarioEstado = usuarioEstado;
    }

    public String getUsuarioPassword() {
        return UsuarioPassword;
    }

    public void setUsuarioPassword(String usuarioPassword) {
        UsuarioPassword = usuarioPassword;
    }

    public double getUsuarioPuntuacion() {
        return UsuarioPuntuacion;
    }

    public void setUsuarioPuntuacion(double usuarioPuntuacion) {
        UsuarioPuntuacion = usuarioPuntuacion;
    }
}