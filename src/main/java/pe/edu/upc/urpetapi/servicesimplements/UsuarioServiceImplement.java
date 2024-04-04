package pe.edu.upc.urpetapi.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.urpetapi.repositories.iUsuarioRepository;
import pe.edu.upc.urpetapi.servicesinterfaces.iUsuarioService;

@Service
public class UsuarioServiceImplement implements iUsuarioService {
    @Autowired
    private iUsuarioRepository usuR;
}
