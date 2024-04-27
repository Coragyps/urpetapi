package pe.edu.upc.urpetapi.dtos;

public class PaseosPorClientesDto {
    private String UsernameCliente;
    private int CantidadPaseos;
    public String getUsernameCliente() {
        return UsernameCliente;
    }

    public void setUsernameCliente(String usernameCliente) {
        UsernameCliente = usernameCliente;
    }

    public int getCantidadPaseos() {
        return CantidadPaseos;
    }

    public void setCantidadPaseos(int cantidadPaseos) {
        CantidadPaseos = cantidadPaseos;
    }
}
