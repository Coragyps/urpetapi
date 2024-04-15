package pe.edu.upc.urpetapi.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.urpetapi.repositories.iMembresiaRepository;
import pe.edu.upc.urpetapi.servicesinterfaces.iMembresiaService;

@Service
public class MembresiaServiceImplement implements iMembresiaService {
    @Autowired
    private iMembresiaRepository memR;
}
