package pe.edu.upc.urpetapi.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.urpetapi.entities.Billetera;
import pe.edu.upc.urpetapi.repositories.iBilleteraRepository;
import pe.edu.upc.urpetapi.servicesinterfaces.iBilleteraService;

import java.util.List;

@Service
public class BilleteraServiceImplement implements iBilleteraService {
    @Autowired
    private iBilleteraRepository bilR;

    @Override
    public List<Billetera> BilleteraPorUsuario(String username) {
        return bilR.BilleteraPorUsuario(username);
    }

    @Override
    public void RegistrarBilletera(Billetera billetera) {
        bilR.save(billetera);
    }
}
