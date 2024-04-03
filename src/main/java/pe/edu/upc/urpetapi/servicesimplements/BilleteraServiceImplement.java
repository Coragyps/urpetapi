package pe.edu.upc.urpetapi.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.urpetapi.repositories.iBilleteraRepository;
import pe.edu.upc.urpetapi.servicesinterfaces.iBilleteraService;

@Service
public class BilleteraServiceImplement implements iBilleteraService {
    @Autowired
    private iBilleteraRepository bilR;
}
