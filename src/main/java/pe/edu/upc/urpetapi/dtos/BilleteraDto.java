package pe.edu.upc.urpetapi.dtos;


import pe.edu.upc.urpetapi.entities.Usuario;

public class BilleteraDto {
    private int BilleteraId;
    private Double BilleteraMonto;
    private Usuario usuario;

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
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
}
