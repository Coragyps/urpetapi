package pe.edu.upc.urpetapi.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.urpetapi.entities.Membresia;
import pe.edu.upc.urpetapi.repositories.iMembresiaRepository;
import pe.edu.upc.urpetapi.servicesinterfaces.iMembresiaService;

import java.util.List;

@Service
public class MembresiaServiceImplement implements iMembresiaService {
    @Autowired
    private iMembresiaRepository memR;

    @Override//---------------------------HU23: Revisar Historial de Membresías
    public List<Membresia> MembresiaPorUsuario(String username) {
        return memR.MembresiaPorUsuario(username);
    }

    @Override//---------------------------HU24: Comprar Membresía
    public void ComprarMembresia(Membresia membresia) {
        memR.save(membresia);
    }

    @Override//---------------------------HU12: Revisar Membresias Activas
    public List<Membresia> MembresiasActivas() {
        return memR.MembresiasActivas();
    }

    @Override//---------------------------HU25: Cancelar Membresia
    public void Cancelar(int id) {
        memR.Cancelar(id);
    }

}
