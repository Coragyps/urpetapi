package pe.edu.upc.urpetapi.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
@Table(name = "Mascota")
public class Mascota {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int MascotaId;
    @Column(name = "MascotaNombre", nullable = false, length = 20)
    private String MacotaNombre;
    @Column(name = "MascotaFoto")
    private String MascotaFoto;
    @Column(name = "MascotaRaza", length = 20)
    private String MascotaRaza;
    @Column(name = "MascotaEdad")
    private int MascotaEdad;
    @Column(name = "MascotaSexo", nullable = false, length = 20)
    private String MascotaSexo;
    @Column(name = "MascotaTamaño", nullable = false, length = 20)
    private String MascotaTamaño;
    @Column(name = "MascotaHabilitado", nullable = false)
    private Boolean MascotaHabilitado;
    @ManyToOne
    @JoinColumn(name = "UsuarioId")
    private Usuario usuario;

    public Mascota() {
    }

    public Mascota(int mascotaId, String macotaNombre, String mascotaFoto, String mascotaRaza, int mascotaEdad, String mascotaSexo, String mascotaTamaño, Boolean mascotaHabilitado, Usuario usuario) {
        MascotaId = mascotaId;
        MacotaNombre = macotaNombre;
        MascotaFoto = mascotaFoto;
        MascotaRaza = mascotaRaza;
        MascotaEdad = mascotaEdad;
        MascotaSexo = mascotaSexo;
        MascotaTamaño = mascotaTamaño;
        MascotaHabilitado = mascotaHabilitado;
        this.usuario = usuario;
    }

    public int getMascotaId() {
        return MascotaId;
    }

    public void setMascotaId(int mascotaId) {
        MascotaId = mascotaId;
    }

    public String getMacotaNombre() {
        return MacotaNombre;
    }

    public void setMacotaNombre(String macotaNombre) {
        MacotaNombre = macotaNombre;
    }

    public String getMascotaFoto() {
        return MascotaFoto;
    }

    public void setMascotaFoto(String mascotaFoto) {
        MascotaFoto = mascotaFoto;
    }

    public String getMascotaRaza() {
        return MascotaRaza;
    }

    public void setMascotaRaza(String mascotaRaza) {
        MascotaRaza = mascotaRaza;
    }

    public int getMascotaEdad() {
        return MascotaEdad;
    }

    public void setMascotaEdad(int mascotaEdad) {
        MascotaEdad = mascotaEdad;
    }

    public String getMascotaSexo() {
        return MascotaSexo;
    }

    public void setMascotaSexo(String mascotaSexo) {
        MascotaSexo = mascotaSexo;
    }

    public String getMascotaTamaño() {
        return MascotaTamaño;
    }

    public void setMascotaTamaño(String mascotaTamaño) {
        MascotaTamaño = mascotaTamaño;
    }

    public Boolean getMascotaHabilitado() {
        return MascotaHabilitado;
    }

    public void setMascotaHabilitado(Boolean mascotaHabilitado) {
        MascotaHabilitado = mascotaHabilitado;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
