package pe.edu.upc.urpetapi.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.urpetapi.entities.Rol;
import pe.edu.upc.urpetapi.repositories.iRolRepository;
import pe.edu.upc.urpetapi.servicesinterfaces.iRolService;

@Service
public class RolServiceImplement implements iRolService {
    @Autowired
    private iRolRepository rolR;

    @Override//---------------------------HU30: Asignar Roles
    public void asignar(Rol rol) {
        rolR.save(rol);
    }
}
