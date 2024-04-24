package pe.edu.upc.urpetapi.dtos;
import pe.edu.upc.urpetapi.entities.Usuario;

public class MascotaDto {
    private int MascotaId;
    private String MacotaNombre;
    private String MascotaFoto;
    private String MascotaRaza;
    private int MascotaEdad;
    private String MascotaSexo;
    private String MascotaTamaño;
    private Boolean MascotaHabilitado;
    private Usuario usuario;

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
