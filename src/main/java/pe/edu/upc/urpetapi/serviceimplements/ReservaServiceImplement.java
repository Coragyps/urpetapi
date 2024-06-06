package pe.edu.upc.urpetapi.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.urpetapi.entities.Reserva;
import pe.edu.upc.urpetapi.repositories.iReservaRepository;
import pe.edu.upc.urpetapi.services.iReservaService;

import java.util.List;

@Service
public class ReservaServiceImplement implements iReservaService {
    @Autowired
    private iReservaRepository resR;

    @Override
    public void insert(Reserva reserva) {
        resR.save(reserva);
    }

    @Override
    public void delete(int id) {
        resR.deleteById(id);
    }

    @Override
    public List<Reserva> list() {
        return resR.findAll();
    }

    @Override
    public void cambiarEstado(int idreserva, String estado) {
        resR.Estado(idreserva,estado);
    }

    @Override
    public Reserva listId(int idreserva) {
        return resR.findById(idreserva).orElse(new Reserva());
    }

    @Override
    public List<Reserva> listUsuario(int idusuario) {
        return resR.TodoUsuario(idusuario);
    }

    @Override
    public List<Reserva> listPaseador(int idpaseador) {
        return resR.TodoPaseador(idpaseador);
    }

    @Override
    public List<String[]> listClientesPaseador(int idpaseador) {
        return resR.PaseosporCliente(idpaseador);
    }
}
