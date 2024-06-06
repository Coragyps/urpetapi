package pe.edu.upc.urpetapi.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.urpetapi.entities.Rol;
import pe.edu.upc.urpetapi.repositories.iRolRepository;
import pe.edu.upc.urpetapi.services.iRolService;

import java.util.List;

@Service
public class RolServiceImplement implements iRolService {
    @Autowired
    private iRolRepository rolR;

    @Override
    public void insert(Rol rol) {
        rolR.save(rol);
    }

    @Override
    public void delete(int id) {
        rolR.deleteById(id);
    }

    @Override
    public List<Rol> list() {
        return rolR.findAll();
    }

    @Override
    public Rol listId(int id) {
        return rolR.findById(id).orElse(new Rol());
    }
}
