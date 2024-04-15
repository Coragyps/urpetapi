package pe.edu.upc.urpetapi.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Billetera")
public class Billetera {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int BilleteraId;
    @Column(name = "BilleteraMonto", nullable = false)
    private Double BilleteraMonto;
    @ManyToOne
    @JoinColumn(name = "UsuarioId")
    private Usuario usuario;

    public Billetera() {
    }

    public Billetera(int billeteraId, Double billeteraMonto, Usuario usuario) {
        BilleteraId = billeteraId;
        BilleteraMonto = billeteraMonto;
        this.usuario = usuario;
    }

    public int getBilleteraId() {
        return BilleteraId;
    }

    public void setBilleteraId(int billeteraId) {
        BilleteraId = billeteraId;
    }

    public Double getBilleteraMonto() {
        return BilleteraMonto;
    }

    public void setBilleteraMonto(Double billeteraMonto) {
        BilleteraMonto = billeteraMonto;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
