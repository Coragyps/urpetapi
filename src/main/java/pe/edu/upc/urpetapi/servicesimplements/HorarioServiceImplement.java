package pe.edu.upc.urpetapi.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.urpetapi.repositories.iHorarioRepository;
import pe.edu.upc.urpetapi.servicesinterfaces.iHorarioService;
@Service
public class HorarioServiceImplement implements iHorarioService {
    @Autowired
    private iHorarioRepository horR;
}
