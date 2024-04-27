package pe.edu.upc.urpetapi.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "Usuario")
public class Usuario implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int UsuarioId;
    @Column(length = 50, unique = true)
    private String username;
    @Column(length = 200)
    private String password;
    @Column(name = "enabled")
    private Boolean enabled;
    @JsonIgnore
    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "usuario_id")
    private List<Rol> roles;
    @Column(name = "UsuarioNombre", length = 50, nullable = false)
    private String UsuarioNombre;
    @Column(name = "UsuarioTelefono", length = 20)
    private String UsuarioTelefono;
    @Column(name = "UsuarioCorreo", length = 50)
    private String UsuarioCorreo;
    @Column(name = "UsuarioFoto")
    private String UsuarioFoto;

    public Usuario() {
    }

    public Usuario(int usuarioId, String username, String password, Boolean enabled, List<Rol> roles, String usuarioNombre, String usuarioTelefono, String usuarioCorreo, String usuarioFoto) {
        UsuarioId = usuarioId;
        this.username = username;
        this.password = password;
        this.enabled = enabled;
        this.roles = roles;
        UsuarioNombre = usuarioNombre;
        UsuarioTelefono = usuarioTelefono;
        UsuarioCorreo = usuarioCorreo;
        UsuarioFoto = usuarioFoto;
    }

    public int getUsuarioId() {
        return UsuarioId;
    }

    public void setUsuarioId(int usuarioId) {
        UsuarioId = usuarioId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public List<Rol> getRoles() {
        return roles;
    }

    public void setRoles(List<Rol> roles) {
        this.roles = roles;
    }

    public String getUsuarioNombre() {
        return UsuarioNombre;
    }

    public void setUsuarioNombre(String usuarioNombre) {
        UsuarioNombre = usuarioNombre;
    }

    public String getUsuarioTelefono() {
        return UsuarioTelefono;
    }

    public void setUsuarioTelefono(String usuarioTelefono) {
        UsuarioTelefono = usuarioTelefono;
    }

    public String getUsuarioCorreo() {
        return UsuarioCorreo;
    }

    public void setUsuarioCorreo(String usuarioCorreo) {
        UsuarioCorreo = usuarioCorreo;
    }

    public String getUsuarioFoto() {
        return UsuarioFoto;
    }

    public void setUsuarioFoto(String usuarioFoto) {
        UsuarioFoto = usuarioFoto;
    }
}