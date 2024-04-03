package pe.edu.upc.urpetapi.dtos;

import java.time.LocalDate;
import java.time.LocalTime;

public class HorarioDto {
    private int HorarioId;
    private LocalDate HorarioFecha;
    private LocalTime HorarioHoraInicio;
    private LocalTime HorarioHoraFin;

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
}
