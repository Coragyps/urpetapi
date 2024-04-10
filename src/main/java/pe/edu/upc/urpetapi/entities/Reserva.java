package pe.edu.upc.urpetapi.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Reserva")
public class Reserva {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ReservaId;
    @Column(name = "ReservaEstado",nullable = false)
    private double ReservaEstado;
    @Column(name = "ReservaPuntuacion",nullable = false)
    private double ReservaPuntuacion;
    @ManyToOne
    @JoinColumn(name ="UsuarioId")
    private Usuario usuario;
    @ManyToOne
    @JoinColumn(name = "MascotaId")
    private Mascota mascota;

    public Reserva() {
    }

    public Reserva(int reservaId, double reservaEstado, double reservaPuntuacion, Usuario usuario, Mascota mascota) {
        ReservaId = reservaId;
        ReservaEstado = reservaEstado;
        ReservaPuntuacion = reservaPuntuacion;
        this.usuario = usuario;
        this.mascota = mascota;
    }

    public int getReservaId() {
        return ReservaId;
    }

    public void setReservaId(int reservaId) {
        ReservaId = reservaId;
    }

    public double getReservaEstado() {
        return ReservaEstado;
    }

    public void setReservaEstado(double reservaEstado) {
        ReservaEstado = reservaEstado;
    }

    public double getReservaPuntuacion() {
        return ReservaPuntuacion;
    }

    public void setReservaPuntuacion(double reservaPuntuacion) {
        ReservaPuntuacion = reservaPuntuacion;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }
}
