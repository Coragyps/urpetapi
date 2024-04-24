package pe.edu.upc.urpetapi.servicesinterfaces;
import pe.edu.upc.urpetapi.entities.Mascota;

import java.util.List;

public interface iMascotaService {
    public List<Mascota> MascotaPorUsuario(String username);
    public void RegistrarMascota(Mascota mascota);
}
