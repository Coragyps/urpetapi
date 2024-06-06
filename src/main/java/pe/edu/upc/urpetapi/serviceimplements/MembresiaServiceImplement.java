package pe.edu.upc.urpetapi.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.urpetapi.entities.Membresia;
import pe.edu.upc.urpetapi.repositories.iMembresiaRepository;
import pe.edu.upc.urpetapi.services.iMembresiaService;

import java.util.List;

@Service
public class MembresiaServiceImplement implements iMembresiaService {
    @Autowired
    private iMembresiaRepository memR;

    @Override
    public void insert(Membresia membresia) {
        memR.save(membresia);
    }

    @Override
    public void delete(int id) {
        memR.deleteById(id);
    }

    @Override
    public List<Membresia> list() {
        return memR.findAll();
    }

    @Override
    public Membresia listId(int id) {
        return memR.findById(id).orElse(new Membresia());
    }
}
