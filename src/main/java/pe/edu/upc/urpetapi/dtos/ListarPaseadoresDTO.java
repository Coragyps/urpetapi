package pe.edu.upc.urpetapi.dtos;


import java.time.LocalTime;

public class ListarPaseadoresDTO {
    private int UsuarioId;
    private String UsuarioNombre;

    private String UsuarioTelefono;

    private String UsuarioCorreo;

    private String UsuarioEstado;

    private String UsuarioFoto;

    //de los paseadores


    private LocalTime PaseadorHoraInicio;

    private LocalTime PaseadorHoraFin;

    private double PaseadorLatitud;

    private double PaseadorLongitud;

    private double PaseadorPrecio;

    private String PaseadorSlogan;

    private int PaseadorEdad;

    private boolean PaseadorValidado;

    private String PaseadorDescripcion;

    private String PaseadorFacebook;

    private String PaseadorInstagram;

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
