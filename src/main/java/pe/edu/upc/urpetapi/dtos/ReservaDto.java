package pe.edu.upc.urpetapi.dtos;
import pe.edu.upc.urpetapi.entities.Mascota;
import pe.edu.upc.urpetapi.entities.Usuario;

import java.time.LocalDate;
import java.time.LocalTime;

public class ReservaDto {
    private int ReservaId;
    private double ReservaEstado;
    private LocalDate ReservaFecha;
    private LocalTime ReservaHoraInicio;
    private LocalTime ReservaHoraFin;
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

    public LocalDate getReservaFecha() {
        return ReservaFecha;
    }

    public void setReservaFecha(LocalDate reservaFecha) {
        ReservaFecha = reservaFecha;
    }

    public LocalTime getReservaHoraInicio() {
        return ReservaHoraInicio;
    }

    public void setReservaHoraInicio(LocalTime reservaHoraInicio) {
        ReservaHoraInicio = reservaHoraInicio;
    }

    public LocalTime getReservaHoraFin() {
        return ReservaHoraFin;
    }

    public void setReservaHoraFin(LocalTime reservaHoraFin) {
        ReservaHoraFin = reservaHoraFin;
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