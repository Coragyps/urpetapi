package pe.edu.upc.urpetapi.dtos;

import pe.edu.upc.urpetapi.entities.Mascota;
import pe.edu.upc.urpetapi.entities.Paseador;
import pe.edu.upc.urpetapi.entities.Usuario;

import java.time.LocalDate;
import java.time.LocalTime;

public class ReservaDto {
    private int ReservaId;
    private String ReservaEstado;
    private LocalDate ReservaFecha;
    private LocalTime ReservaHoraInicio;
    private LocalTime ReservaHoraFin;
    private Paseador paseador;
    private Mascota mascota;

    public int getReservaId() {
        return ReservaId;
    }

    public void setReservaId(int reservaId) {
        ReservaId = reservaId;
    }

    public String getReservaEstado() {
        return ReservaEstado;
    }

    public void setReservaEstado(String reservaEstado) {
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

    public Paseador getPaseador() {
        return paseador;
    }

    public void setPaseador(Paseador paseador) {
        this.paseador = paseador;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }
}