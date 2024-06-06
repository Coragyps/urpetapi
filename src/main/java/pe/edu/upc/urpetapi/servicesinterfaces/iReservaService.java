package pe.edu.upc.urpetapi.servicesinterfaces;

import pe.edu.upc.urpetapi.dtos.ReservaDto;
import pe.edu.upc.urpetapi.entities.Reserva;

import java.util.List;

public interface iReservaService {
    public void insert(Reserva reserva);//---------------------------HU11: Solicitar Paseo
    public void delete(int id);
    public List<Reserva> list();

    public void cambiarEstado(int idreserva, String estado);//---------------------------HU03: Confirmar Paseo, HU03: Confirmar Paseo, HU28: Terminar Paseo
    public Reserva listId(int idreserva);

    public List<Reserva> listEstadoUsuario(int idusuario, String estado);
    public List<Reserva> listUsuario(int idusuario);//---------------------------HU14: Revisar Historial de Paseos Adquiridos

    public List<Reserva> listEstadoPaseador(int idpaseador, String estado);//---------------------------HU04: Revisar Historial de Paseos Completados, HU02: Revisar Paseos Pendientes, HU35: Revisar Paseos Aceptados, HU36: Revisar Paseos Rechazados
    public List<Reserva> listPaseador(int idpaseador);
    public List<String[]> listClientesPaseador(int idpaseador);//---------------------------HU17: Cantidad de Paseos por Cliente

}
