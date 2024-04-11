package pe.edu.upc.urpetapi.dtos;
import pe.edu.upc.urpetapi.entities.Usuario;

import java.time.LocalDate;

public class MembresiaDto {
    private int MembresiaId;
    private LocalDate MembresiaFechaInicio;
    private LocalDate MembresiaFechaFin;
    private String MembresiaEstado;
    private Usuario usuario;

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public int getMembresiaId() {
        return MembresiaId;
    }

    public void setMembresiaId(int membresiaId) {
        MembresiaId = membresiaId;
    }

    public LocalDate getMembresiaFechaInicio() {
        return MembresiaFechaInicio;
    }

    public void setMembresiaFechaInicio(LocalDate membresiaFechaInicio) {
        MembresiaFechaInicio = membresiaFechaInicio;
    }

    public LocalDate getMembresiaFechaFin() {
        return MembresiaFechaFin;
    }

    public void setMembresiaFechaFin(LocalDate membresiaFechaFin) {
        MembresiaFechaFin = membresiaFechaFin;
    }

    public String getMembresiaEstado() {
        return MembresiaEstado;
    }

    public void setMembresiaEstado(String membresiaEstado) {
        MembresiaEstado = membresiaEstado;
    }
}
