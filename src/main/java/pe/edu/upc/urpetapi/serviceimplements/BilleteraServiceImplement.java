package pe.edu.upc.urpetapi.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.urpetapi.entities.Billetera;
import pe.edu.upc.urpetapi.repositories.iBilleteraRepository;
import pe.edu.upc.urpetapi.services.iBilleteraService;

import java.util.List;

@Service
public class BilleteraServiceImplement implements iBilleteraService {
    @Autowired
    private iBilleteraRepository bilR;

    @Override
    public void insert(Billetera billetera) {
        bilR.save(billetera);
    }

    @Override
    public void delete(int id) {
        bilR.deleteById(id);
    }

    @Override
    public List<Billetera> list() {
        return bilR.findAll();
    }

    @Override
    public Billetera listId(int id) {
        return bilR.findById(id).orElse(new Billetera());
    }
}
