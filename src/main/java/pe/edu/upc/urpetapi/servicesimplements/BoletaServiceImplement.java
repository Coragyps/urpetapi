package pe.edu.upc.urpetapi.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.urpetapi.repositories.iBoletaRepository;
import pe.edu.upc.urpetapi.servicesinterfaces.iBoletaService;

@Service
public class BoletaServiceImplement implements iBoletaService {
    @Autowired
    private iBoletaRepository bolR;
}
