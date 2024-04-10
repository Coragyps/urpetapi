package pe.edu.upc.urpetapi.dtos;

import pe.edu.upc.urpetapi.entities.Reserva;

public class ComentarioDto {
    private int ComentarioId;
    private String ComentarioTexto;
    private Reserva reserva;

    public int getComentarioId() {
        return ComentarioId;
    }

    public void setComentarioId(int comentarioId) {
        ComentarioId = comentarioId;
    }

    public String getComentarioTexto() {
        return ComentarioTexto;
    }

    public void setComentarioTexto(String comentarioTexto) {
        ComentarioTexto = comentarioTexto;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }
}
