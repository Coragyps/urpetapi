package pe.edu.upc.urpetapi.dtos;
public class MascotaDto {
    private int MascotaId;
    private String MacotaNombre;
    private String MascotaFoto;
    private String MascotaEstado;

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
}
