package pe.edu.upc.urpetapi.dtos;


public class BilleteraDto {
    private int BilleteraId;
    private Double BilleteraMonto;

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
