package pe.edu.upc.urpetapi.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.urpetapi.entities.Mascota;
import pe.edu.upc.urpetapi.repositories.iMascotaRepository;
import pe.edu.upc.urpetapi.services.iMascotaService;

import java.util.List;

@Service
public class MascotaServiceImplement implements iMascotaService {
    @Autowired
    private iMascotaRepository masR;

    @Override
    public void insert(Mascota mascota) {
        masR.save(mascota);
    }

    @Override
    public void delete(int id) {
        masR.deleteById(id);
    }

    @Override
    public List<Mascota> list() {
        return masR.findAll();
    }

    @Override
    public Mascota listId(int id) {
        return masR.findById(id).orElse(new Mascota());
    }
}
