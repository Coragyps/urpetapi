package pe.edu.upc.urpetapi.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.urpetapi.entities.Paseador;
import pe.edu.upc.urpetapi.repositories.iPaseadorRepository;
import pe.edu.upc.urpetapi.services.iPaseadorService;

import java.util.List;

@Service
public class PaseadorServiceImplement implements iPaseadorService {
    @Autowired
    private iPaseadorRepository pasR;

    @Override
    public void insert(Paseador paseador) {
        pasR.save(paseador);
    }

    @Override
    public void delete(int id) {
        pasR.deleteById(id);
    }

    @Override
    public List<Paseador> list() {
        return pasR.findAll();
    }

    @Override
    public Paseador listId(int id) {
        return pasR.findById(id).orElse(new Paseador());
    }
}
