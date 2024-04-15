package pe.edu.upc.urpetapi.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalTime;
import java.util.List;

@Entity
@Table(name = "users")
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
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private List<Rol> roles;

    @Column(name = "UsuarioNombre",length = 50,nullable = false)
    private String UsuarioNombre;
    @Column(name = "UsuarioCorreo",length = 50)
    private String UsuarioCorreo;
    @Column(name = "UsuarioTelefono",length = 20, nullable = false)
    private String UsuarioTelefono;
    @Column(name = "UsuarioEstado",length = 20)
    private String UsuarioEstado;
    @Column(name = "UsuarioPuntuacion")
    private double UsuarioPuntuacion;
    @Column(name = "UsuarioContadorPaseo")
    private int UsuarioContadorPaseo;
    @Column (name = "UsuarioHoraInicio")
    private LocalTime UsuarioHoraInicio;
    @Column(name = "UsuarioHoraFin")
    private LocalTime UsuarioHoraFin;

    public Usuario() {
    }

    public Usuario(int usuarioId, String username, String password, Boolean enabled, List<Rol> roles, String usuarioNombre, String usuarioCorreo, String usuarioTelefono, String usuarioEstado, double usuarioPuntuacion, int usuarioContadorPaseo, LocalTime usuarioHoraInicio, LocalTime usuarioHoraFin) {
        UsuarioId = usuarioId;
        this.username = username;
        this.password = password;
        this.enabled = enabled;
        this.roles = roles;
        UsuarioNombre = usuarioNombre;
        UsuarioCorreo = usuarioCorreo;
        UsuarioTelefono = usuarioTelefono;
        UsuarioEstado = usuarioEstado;
        UsuarioPuntuacion = usuarioPuntuacion;
        UsuarioContadorPaseo = usuarioContadorPaseo;
        UsuarioHoraInicio = usuarioHoraInicio;
        UsuarioHoraFin = usuarioHoraFin;
    }

    public int getUsuarioId() {
        return UsuarioId;
    }

    public void setUsuarioId(int id) {
        this.UsuarioId = id;
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

    public double getUsuarioPuntuacion() {
        return UsuarioPuntuacion;
    }

    public void setUsuarioPuntuacion(double usuarioPuntuacion) {
        UsuarioPuntuacion = usuarioPuntuacion;
    }

    public int getUsuarioContadorPaseo() {
        return UsuarioContadorPaseo;
    }

    public void setUsuarioContadorPaseo(int usuarioContadorPaseo) {
        UsuarioContadorPaseo = usuarioContadorPaseo;
    }

    public LocalTime getUsuarioHoraInicio() {
        return UsuarioHoraInicio;
    }

    public void setUsuarioHoraInicio(LocalTime usuarioHoraInicio) {
        UsuarioHoraInicio = usuarioHoraInicio;
    }

    public LocalTime getUsuarioHoraFin() {
        return UsuarioHoraFin;
    }

    public void setUsuarioHoraFin(LocalTime usuarioHoraFin) {
        UsuarioHoraFin = usuarioHoraFin;
    }
}