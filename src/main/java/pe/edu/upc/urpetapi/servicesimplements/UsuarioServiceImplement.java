package pe.edu.upc.urpetapi.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Service;
import pe.edu.upc.urpetapi.dtos.ListarPaseadoresDTO;
import pe.edu.upc.urpetapi.repositories.iUsuarioRepository;
import pe.edu.upc.urpetapi.servicesinterfaces.iUsuarioService;

import java.util.List;

@Service
public class UsuarioServiceImplement implements iUsuarioService {
    @Autowired
    private iUsuarioRepository useR;

    @Override
    public List<ListarPaseadoresDTO> ListarPaseadores() {
        return useR.ListarPaseadores();
    }
}
