package pe.edu.upc.urpetapi.dtos;
import pe.edu.upc.urpetapi.entities.Reserva;

import java.time.LocalDate;

public class BoletaDto {
    private int BoletaId;
    private Double BoletaMonto;
    private LocalDate BoletaFecha;
    private String BoletaMoneda;
    private Reserva reserva;

    public int getBoletaId() {
        return BoletaId;
    }

    public void setBoletaId(int boletaId) {
        BoletaId = boletaId;
    }

    public Double getBoletaMonto() {
        return BoletaMonto;
    }

    public void setBoletaMonto(Double boletaMonto) {
        BoletaMonto = boletaMonto;
    }

    public LocalDate getBoletaFecha() {
        return BoletaFecha;
    }

    public void setBoletaFecha(LocalDate boletaFecha) {
        BoletaFecha = boletaFecha;
    }

    public String getBoletaMoneda() {
        return BoletaMoneda;
    }

    public void setBoletaMoneda(String boletaMoneda) {
        BoletaMoneda = boletaMoneda;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }
}
