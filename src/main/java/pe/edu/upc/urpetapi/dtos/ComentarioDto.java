package pe.edu.upc.urpetapi.dtos;

public class ComentarioDto {
    private int ComentarioId;
    private String ComentarioTexto;

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
