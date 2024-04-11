package pe.edu.upc.urpetapi.dtos;



import java.time.LocalTime;

public class UsuarioDto {
    private int UsuarioId;

    private String UsuarioNombre;

    private String UsuarioCorreo;

    private String UsuarioTelefono;

    private String UsuarioEstado;

    private String UsuarioPassword;

    private double UsuarioPuntuacion;
    private LocalTime UsuarioHoraInicio;

    private LocalTime UsuarioHoraFin;

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
