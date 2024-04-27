package pe.edu.upc.urpetapi.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "Reserva")
public class Reserva {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ReservaId;
    @Column(name = "ReservaEstado",nullable = false)
    private String ReservaEstado;
    @Column(name = "ReservaFecha", nullable = false)
    private LocalDate ReservaFecha;
    @Column(name = "ReservaHoraInicio", nullable = false)
    private LocalTime ReservaHoraInicio;
    @Column(name = "ReservaHoraFin", nullable = false)
    private LocalTime ReservaHoraFin;
    @ManyToOne
    @JoinColumn(name ="PaseadorId")
    private Paseador paseador;
    @ManyToOne
    @JoinColumn(name = "MascotaId")
    private Mascota mascota;

    public Reserva() {
    }

    public Reserva(int reservaId, String reservaEstado, LocalDate reservaFecha, LocalTime reservaHoraInicio, LocalTime reservaHoraFin, Paseador paseador, Mascota mascota) {
        ReservaId = reservaId;
        ReservaEstado = reservaEstado;
        ReservaFecha = reservaFecha;
        ReservaHoraInicio = reservaHoraInicio;
        ReservaHoraFin = reservaHoraFin;
        this.paseador = paseador;
        this.mascota = mascota;
    }

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
