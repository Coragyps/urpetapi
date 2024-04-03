package pe.edu.upc.urpetapi.servicesimplements;

import org.springframework.stereotype.Service;
import pe.edu.upc.urpetapi.repositories.iMembresiaRepository;
import pe.edu.upc.urpetapi.servicesinterfaces.iMembresiaService;

@Service
public class MembresiaServiceImplement implements iMembresiaService {
    private iMembresiaRepository memR;
}
