package pe.edu.upc.urpetapi.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "Paseador")
public class Paseador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int PaseadorId;
    @Column(name = "PaseadorEstado",length = 20, nullable = false)
    private String PaseadorEstado;
    @JsonFormat(pattern = "HH:mm:ss")
    @Column(name = "PaseadorHoraInicio")
    private LocalTime PaseadorHoraInicio;
    @JsonFormat(pattern = "HH:mm:ss")
    @Column(name = "PaseadorHoraFin")
    private LocalTime PaseadorHoraFin;
    @Column(name = "PaseadorLatitud")
    private double PaseadorLatitud;
    @Column(name = "PaseadorLongitud")
    private double PaseadorLongitud;
    @Column(name = "PaseadorPrecio")
    private double PaseadorPrecio;
    @Column(name = "PaseadorSlogan", length = 50)
    private String PaseadorSlogan;
    @Column(name = "PaseadorEdad")
    private LocalDate PaseadorEdad;
    @Column(name = "PaseadorValidado")
    private boolean PaseadorValidado;
    @Column(name = "PaseadorDescripcion")
    private String PaseadorDescripcion;
    @Column(name = "PaseadorFacebook")
    private String PaseadorFacebook;
    @Column(name = "PaseadorInstagram")
    private String PaseadorInstagram;
    @ManyToOne
    @JoinColumn(name = "UsuarioId")
    private Usuario usuario;

    public Paseador() {
    }

    public Paseador(int paseadorId, String paseadorEstado, LocalTime paseadorHoraInicio, LocalTime paseadorHoraFin, double paseadorLatitud, double paseadorLongitud, double paseadorPrecio, String paseadorSlogan, LocalDate paseadorEdad, boolean paseadorValidado, String paseadorDescripcion, String paseadorFacebook, String paseadorInstagram, Usuario usuario) {
        PaseadorId = paseadorId;
        PaseadorEstado = paseadorEstado;
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
        this.usuario = usuario;
    }

    public int getPaseadorId() {
        return PaseadorId;
    }

    public void setPaseadorId(int paseadorId) {
        PaseadorId = paseadorId;
    }

    public String getPaseadorEstado() {
        return PaseadorEstado;
    }

    public void setPaseadorEstado(String paseadorEstado) {
        PaseadorEstado = paseadorEstado;
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

    public LocalDate getPaseadorEdad() {
        return PaseadorEdad;
    }

    public void setPaseadorEdad(LocalDate paseadorEdad) {
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

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
