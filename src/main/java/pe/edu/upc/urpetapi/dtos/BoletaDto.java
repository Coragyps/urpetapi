package pe.edu.upc.urpetapi.dtos;

import pe.edu.upc.urpetapi.entities.Usuario;

import java.time.LocalDate;

public class BoletaDto {
    private int BoletaId;
    private Double BoletaMonto;
    private LocalDate BoletaFecha;
    private String BoletaMoneda;
    private Usuario usuario;

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

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
