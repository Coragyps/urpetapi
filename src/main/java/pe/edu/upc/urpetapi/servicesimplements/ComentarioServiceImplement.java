package pe.edu.upc.urpetapi.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.urpetapi.repositories.iComentarioRepository;
import pe.edu.upc.urpetapi.servicesinterfaces.iComentarioService;

@Service
public class ComentarioServiceImplement implements iComentarioService {
    @Autowired
    private iComentarioRepository comR;
}
