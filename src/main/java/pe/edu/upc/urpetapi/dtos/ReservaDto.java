package pe.edu.upc.urpetapi.dtos;


import pe.edu.upc.urpetapi.entities.Mascota;
import pe.edu.upc.urpetapi.entities.Usuario;

public class ReservaDto {

    private int ReservaId;
    private double ReservaEstado;
    private double ReservaPuntuacion;
    private Usuario usuario;
    private Mascota mascota;

    public int getReservaId() {
        return ReservaId;
    }

    public void setReservaId(int reservaId) {
        ReservaId = reservaId;
    }

    public double getReservaEstado() {
        return ReservaEstado;
    }

    public void setReservaEstado(double reservaEstado) {
        ReservaEstado = reservaEstado;
    }

    public double getReservaPuntuacion() {
        return ReservaPuntuacion;
    }

    public void setReservaPuntuacion(double reservaPuntuacion) {
        ReservaPuntuacion = reservaPuntuacion;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }
}
