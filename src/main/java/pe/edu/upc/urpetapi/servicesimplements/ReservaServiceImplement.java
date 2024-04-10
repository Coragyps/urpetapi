package pe.edu.upc.urpetapi.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.urpetapi.repositories.iReservaRepository;
import pe.edu.upc.urpetapi.servicesinterfaces.iReservaService;

@Service
public class ReservaServiceImplement implements iReservaService {
    @Autowired
    private iReservaRepository resR;
}
