package pe.edu.upc.urpetapi.entities;

import jakarta.persistence.*;

@Entity
@Table(name="Comentario")
public class Comentario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ComentarioId;
    @Column(name = "ComentarioTexto", nullable = false, length = 200)
    private String ComentarioTexto;
    @Column(name = "ComentarioPuntuacion",nullable = false)
    private double ComentarioPuntuacion;
    @ManyToOne
    @JoinColumn(name = "ReservaId")
    private Reserva reserva;

    public Comentario() {
    }

    public Comentario(int comentarioId, String comentarioTexto, double comentarioPuntuacion, Reserva reserva) {
        ComentarioId = comentarioId;
        ComentarioTexto = comentarioTexto;
        ComentarioPuntuacion = comentarioPuntuacion;
        this.reserva = reserva;
    }

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

    public double getComentarioPuntuacion() {
        return ComentarioPuntuacion;
    }

    public void setComentarioPuntuacion(double comentarioPuntuacion) {
        ComentarioPuntuacion = comentarioPuntuacion;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }
}