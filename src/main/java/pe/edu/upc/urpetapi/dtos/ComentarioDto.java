package pe.edu.upc.urpetapi.dtos;

public class ComentarioDto {
    private int ComentarioId;
    private String ComentarioTexto;
    private double ComentarioPuntuacion;

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
}
