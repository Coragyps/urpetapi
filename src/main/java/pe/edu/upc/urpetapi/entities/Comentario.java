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

    public Comentario() {
    }

    public Comentario(int comentarioId, String comentarioTexto) {
        ComentarioId = comentarioId;
        ComentarioTexto = comentarioTexto;
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
}
