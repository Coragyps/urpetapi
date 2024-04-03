package pe.edu.upc.urpetapi.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
@Table(name = "Boleta")
public class Boleta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int BoletaId;
    @Column(name = "BoletaMonto", nullable = false)
    private Double BoletaMonto;
    @Column(name = "BoletaFecha", nullable = false)
    private LocalDate BoletaFecha;
    @Column(name = "BoletaMoneda", nullable = false, length = 20)
    private String BoletaMoneda;

    public Boleta() {
    }

    public Boleta(int boletaId, Double boletaMonto, LocalDate boletaFecha, String boletaMoneda) {
        BoletaId = boletaId;
        BoletaMonto = boletaMonto;
        BoletaFecha = boletaFecha;
        BoletaMoneda = boletaMoneda;
    }

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
}
