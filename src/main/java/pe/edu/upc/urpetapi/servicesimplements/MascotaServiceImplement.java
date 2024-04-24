package pe.edu.upc.urpetapi.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.urpetapi.entities.Mascota;
import pe.edu.upc.urpetapi.repositories.iMascotaRepository;
import pe.edu.upc.urpetapi.servicesinterfaces.iMascotaService;

import java.util.List;

@Service
public class MascotaServiceImplement implements iMascotaService {
    @Autowired
    private iMascotaRepository masR;

    @Override
    public List<Mascota> MascotaPorUsuario(String username) {
        return masR.MascotaPorUsuario(username);
    }

    @Override
    public void RegistrarMascota(Mascota mascota) {
        masR.save(mascota);
    }
}
