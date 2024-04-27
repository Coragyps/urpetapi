package pe.edu.upc.urpetapi.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.urpetapi.entities.Reserva;
import pe.edu.upc.urpetapi.repositories.iReservaRepository;
import pe.edu.upc.urpetapi.servicesinterfaces.iReservaService;

import java.util.List;

@Service
public class ReservaServiceImplement implements iReservaService {
    @Autowired
    private iReservaRepository resR;

    @Override//---------------------------HU14: Revisar Historial de Paseos Adquiridos
    public List<Reserva> ReservaPorCliente(String username) {
        return resR.ReservaPorCliente(username);
    }

    @Override//---------------------------HU04: Revisar Historial de Paseos Completados
    public List<Reserva> ReservaPorPaseador(String username) {
        return resR.ReservaPorPaseador(username);
    }

    @Override//---------------------------HU17: Cantidad de Paseos por Cliente
    public List<String[]> PaseosporCliente(String username) {
        return resR.PaseosporCliente(username);
    }

    @Override//---------------------------HU11: Solicitar Paseo
    public void SolicitarPaseo(Reserva reserva) {
        resR.save(reserva);
    }

    @Override//---------------------------HU02: Revisar Paseos Pendientes
    public List<Reserva> PaseosPendientes(String username) {
        return resR.PaseosPendientes(username);
    }

    @Override//---------------------------HU35: Revisar Paseos Aceptados
    public List<Reserva> PaseosAceptados(String username) {
        return resR.PaseosAceptados(username);
    }

    @Override//---------------------------HU36: Revisar Paseos Rechazados
    public List<Reserva> PaseosRechazados(String username) {
        return resR.PaseosRechazados(username);
    }

    @Override//---------------------------HU03: Confirmar Paseo
    public void Rechazar(int idreserva) {
        resR.Rechazar(idreserva);
    }

    @Override//---------------------------HU03: Confirmar Paseo
    public void Aceptar(int idreserva) {
        resR.Aceptar(idreserva);
    }

    @Override//---------------------------HU28: Terminar Paseo
    public void Finalizar(int idreserva) {
        resR.Finalizar(idreserva);
    }

}
