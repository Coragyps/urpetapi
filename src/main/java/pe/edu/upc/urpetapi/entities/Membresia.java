package pe.edu.upc.urpetapi.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "Membresia")
public class Membresia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int MembresiaId;
    @Column(name = "MembresiaFechaInicio", nullable = false)
    private LocalDate MembresiaFechaInicio;
    @Column(name = "MembresiaFechaFin", nullable = false)
    private LocalDate MembresiaFechaFin;
    @Column(name = "MembresiaEstado", nullable = false, length = 20)
    private String MembresiaEstado;

    public Membresia() {
    }

    public Membresia(int membresiaId, LocalDate membresiaFechaInicio, LocalDate membresiaFechaFin, String membresiaEstado) {
        MembresiaId = membresiaId;
        MembresiaFechaInicio = membresiaFechaInicio;
        MembresiaFechaFin = membresiaFechaFin;
        MembresiaEstado = membresiaEstado;
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
