package pe.edu.upc.urpetapi.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.urpetapi.repositories.iMascotaRepository;
import pe.edu.upc.urpetapi.servicesinterfaces.iMascotaService;

@Service
public class MascotaServiceImplement implements iMascotaService {
    @Autowired
    private iMascotaRepository masR;
}
