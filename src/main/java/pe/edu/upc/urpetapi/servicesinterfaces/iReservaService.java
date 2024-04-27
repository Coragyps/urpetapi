package pe.edu.upc.urpetapi.servicesinterfaces;

import pe.edu.upc.urpetapi.entities.Reserva;

import java.util.List;

public interface iReservaService {
    public List<Reserva> ReservaPorCliente(String username);//---------------------------HU14: Revisar Historial de Paseos Adquiridos

    public List<Reserva> ReservaPorPaseador(String username);//---------------------------HU04: Revisar Historial de Paseos Completados

    public List<String[]> PaseosporCliente(String username);//---------------------------HU17: Cantidad de Paseos por Cliente

    public void SolicitarPaseo(Reserva reserva);//---------------------------HU11: Solicitar Paseo

    public List<Reserva> PaseosPendientes(String username);//---------------------------HU02: Revisar Paseos Pendientes
    public List<Reserva> PaseosAceptados(String username);//---------------------------HU35: Revisar Paseos Aceptados
    public List<Reserva> PaseosRechazados(String username);//---------------------------HU36: Revisar Paseos Rechazados
    public void Rechazar(int idreserva);//---------------------------HU03: Confirmar Paseo
    public void Aceptar(int idreserva);//---------------------------HU03: Confirmar Paseo
    public void Finalizar(int idreserva);//---------------------------HU28: Terminar Paseo
}
