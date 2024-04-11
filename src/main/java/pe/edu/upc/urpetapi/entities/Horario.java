package pe.edu.upc.urpetapi.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "Horario")
public class Horario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int HorarioId;
    @Column(name = "HorarioFecha", nullable = false)
    private LocalDate HorarioFecha;
    @Column(name = "HorarioHoraInicio", nullable = false)
    private LocalTime HorarioHoraInicio;
    @Column(name = "HorarioHoraFin", nullable = false)
    private LocalTime HorarioHoraFin;
    @ManyToOne
    @JoinColumn(name = "ReservaId")
    private Reserva reserva;

    public Horario() {
    }

    public Horario(int horarioId, LocalDate horarioFecha, LocalTime horarioHoraInicio, LocalTime horarioHoraFin, Reserva reserva) {
        HorarioId = horarioId;
        HorarioFecha = horarioFecha;
        HorarioHoraInicio = horarioHoraInicio;
        HorarioHoraFin = horarioHoraFin;
        this.reserva = reserva;
    }

    public int getHorarioId() {
        return HorarioId;
    }

    public void setHorarioId(int horarioId) {
        HorarioId = horarioId;
    }

    public LocalDate getHorarioFecha() {
        return HorarioFecha;
    }

    public void setHorarioFecha(LocalDate horarioFecha) {
        HorarioFecha = horarioFecha;
    }

    public LocalTime getHorarioHoraInicio() {
        return HorarioHoraInicio;
    }

    public void setHorarioHoraInicio(LocalTime horarioHoraInicio) {
        HorarioHoraInicio = horarioHoraInicio;
    }

    public LocalTime getHorarioHoraFin() {
        return HorarioHoraFin;
    }

    public void setHorarioHoraFin(LocalTime horarioHoraFin) {
        HorarioHoraFin = horarioHoraFin;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }
}
