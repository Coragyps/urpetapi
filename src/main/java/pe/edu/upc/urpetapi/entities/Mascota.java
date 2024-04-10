package pe.edu.upc.urpetapi.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Mascota")
public class Mascota {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int MascotaId;
    @Column(name = "MascotaNombre", nullable = false, length = 20)
    private String MacotaNombre;
    @Column(name = "MascotaFoto", nullable = false)
    private String MascotaFoto;
    @Column(name = "MascotaEstado", nullable = false, length = 20)
    private String MascotaEstado;
    @ManyToOne
    @JoinColumn(name = "UsuarioId")
    private Usuario usuario;

    public Mascota() {
    }

    public Mascota(int mascotaId, String macotaNombre, String mascotaFoto, String mascotaEstado, Usuario usuario) {
        MascotaId = mascotaId;
        MacotaNombre = macotaNombre;
        MascotaFoto = mascotaFoto;
        MascotaEstado = mascotaEstado;
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

    public String getMascotaEstado() {
        return MascotaEstado;
    }

    public void setMascotaEstado(String mascotaEstado) {
        MascotaEstado = mascotaEstado;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
