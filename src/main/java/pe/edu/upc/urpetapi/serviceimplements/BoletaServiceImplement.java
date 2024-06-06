package pe.edu.upc.urpetapi.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.urpetapi.entities.Boleta;
import pe.edu.upc.urpetapi.repositories.iBoletaRepository;
import pe.edu.upc.urpetapi.services.iBoletaService;

import java.util.List;

@Service
public class BoletaServiceImplement implements iBoletaService {
    @Autowired
    private iBoletaRepository bolR;

    @Override
    public void insert(Boleta boleta) {
        bolR.save(boleta);
    }

    @Override
    public void delete(int id) {
        bolR.deleteById(id);
    }

    @Override
    public List<Boleta> list() {
        return bolR.findAll();
    }

    @Override
    public Boleta listId(int id) {
        return bolR.findById(id).orElse(new Boleta());
    }
}
