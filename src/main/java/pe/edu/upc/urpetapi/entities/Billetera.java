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

    public Billetera() {
    }

    public Billetera(int billeteraId, Double billeteraMonto) {
        BilleteraId = billeteraId;
        BilleteraMonto = billeteraMonto;
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
}
