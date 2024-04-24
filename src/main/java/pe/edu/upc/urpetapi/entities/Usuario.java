package pe.edu.upc.urpetapi.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalTime;
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
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private List<Rol> roles;

    //de la clase usuario

    @Column(name = "UsuarioNombre",length = 50,nullable = false)
    private String UsuarioNombre;
    @Column(name = "UsuarioTelefono",length = 20)
    private String UsuarioTelefono;
    @Column(name = "UsuarioCorreo",length = 50)
    private String UsuarioCorreo;
    @Column(name = "UsuarioEstado",length = 20, nullable = false)
    private String UsuarioEstado;
    @Column(name = "UsuarioFoto")
    private String UsuarioFoto;

    //de los paseadores

    @Column (name = "PaseadorHoraInicio")
    private LocalTime PaseadorHoraInicio;
    @Column(name = "PaseadorHoraFin")
    private LocalTime PaseadorHoraFin;
    @Column (name = "PaseadorLatitud")
    private double PaseadorLatitud;
    @Column(name = "PaseadorLongitud")
    private double PaseadorLongitud;
    @Column(name = "PaseadorPrecio")
    private double PaseadorPrecio;
    @Column(name = "PaseadorSlogan", length = 50)
    private String PaseadorSlogan;
    @Column(name = "PaseadorEdad")
    private int PaseadorEdad;
    @Column(name = "PaseadorValidado")
    private boolean PaseadorValidado;
    @Column(name = "PaseadorDescripcion")
    private String PaseadorDescripcion;
    @Column(name = "PaseadorFacebook")
    private String PaseadorFacebook;
    @Column(name = "PaseadorInstagram")
    private String PaseadorInstagram;

    public Usuario() {
    }

    public Usuario(int usuarioId, String username, String password, Boolean enabled, List<Rol> roles, String usuarioNombre, String usuarioTelefono, String usuarioCorreo, String usuarioEstado, String usuarioFoto, LocalTime paseadorHoraInicio, LocalTime paseadorHoraFin, double paseadorLatitud, double paseadorLongitud, double paseadorPrecio, String paseadorSlogan, int paseadorEdad, boolean paseadorValidado, String paseadorDescripcion, String paseadorFacebook, String paseadorInstagram) {
        UsuarioId = usuarioId;
        this.username = username;
        this.password = password;
        this.enabled = enabled;
        this.roles = roles;
        UsuarioNombre = usuarioNombre;
        UsuarioTelefono = usuarioTelefono;
        UsuarioCorreo = usuarioCorreo;
        UsuarioEstado = usuarioEstado;
        UsuarioFoto = usuarioFoto;
        PaseadorHoraInicio = paseadorHoraInicio;
        PaseadorHoraFin = paseadorHoraFin;
        PaseadorLatitud = paseadorLatitud;
        PaseadorLongitud = paseadorLongitud;
        PaseadorPrecio = paseadorPrecio;
        PaseadorSlogan = paseadorSlogan;
        PaseadorEdad = paseadorEdad;
        PaseadorValidado = paseadorValidado;
        PaseadorDescripcion = paseadorDescripcion;
        PaseadorFacebook = paseadorFacebook;
        PaseadorInstagram = paseadorInstagram;
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

    public String getUsuarioEstado() {
        return UsuarioEstado;
    }

    public void setUsuarioEstado(String usuarioEstado) {
        UsuarioEstado = usuarioEstado;
    }

    public String getUsuarioFoto() {
        return UsuarioFoto;
    }

    public void setUsuarioFoto(String usuarioFoto) {
        UsuarioFoto = usuarioFoto;
    }

    public LocalTime getPaseadorHoraInicio() {
        return PaseadorHoraInicio;
    }

    public void setPaseadorHoraInicio(LocalTime paseadorHoraInicio) {
        PaseadorHoraInicio = paseadorHoraInicio;
    }

    public LocalTime getPaseadorHoraFin() {
        return PaseadorHoraFin;
    }

    public void setPaseadorHoraFin(LocalTime paseadorHoraFin) {
        PaseadorHoraFin = paseadorHoraFin;
    }

    public double getPaseadorLatitud() {
        return PaseadorLatitud;
    }

    public void setPaseadorLatitud(double paseadorLatitud) {
        PaseadorLatitud = paseadorLatitud;
    }

    public double getPaseadorLongitud() {
        return PaseadorLongitud;
    }

    public void setPaseadorLongitud(double paseadorLongitud) {
        PaseadorLongitud = paseadorLongitud;
    }

    public double getPaseadorPrecio() {
        return PaseadorPrecio;
    }

    public void setPaseadorPrecio(double paseadorPrecio) {
        PaseadorPrecio = paseadorPrecio;
    }

    public String getPaseadorSlogan() {
        return PaseadorSlogan;
    }

    public void setPaseadorSlogan(String paseadorSlogan) {
        PaseadorSlogan = paseadorSlogan;
    }

    public int getPaseadorEdad() {
        return PaseadorEdad;
    }

    public void setPaseadorEdad(int paseadorEdad) {
        PaseadorEdad = paseadorEdad;
    }

    public boolean isPaseadorValidado() {
        return PaseadorValidado;
    }

    public void setPaseadorValidado(boolean paseadorValidado) {
        PaseadorValidado = paseadorValidado;
    }

    public String getPaseadorDescripcion() {
        return PaseadorDescripcion;
    }

    public void setPaseadorDescripcion(String paseadorDescripcion) {
        PaseadorDescripcion = paseadorDescripcion;
    }

    public String getPaseadorFacebook() {
        return PaseadorFacebook;
    }

    public void setPaseadorFacebook(String paseadorFacebook) {
        PaseadorFacebook = paseadorFacebook;
    }

    public String getPaseadorInstagram() {
        return PaseadorInstagram;
    }

    public void setPaseadorInstagram(String paseadorInstagram) {
        PaseadorInstagram = paseadorInstagram;
    }
}