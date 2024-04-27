package pe.edu.upc.urpetapi.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.urpetapi.dtos.ListarPaseadoresDto;
import pe.edu.upc.urpetapi.entities.Paseador;
import pe.edu.upc.urpetapi.repositories.iPaseadorRepository;
import pe.edu.upc.urpetapi.servicesinterfaces.iPaseadorService;

import java.util.List;

@Service
public class PaseadorServiceImplement implements iPaseadorService {
    @Autowired
    private iPaseadorRepository pasR;

    @Override//---------------------------HU10: Tarifa mas Accesible
    public List<ListarPaseadoresDto> PaseadorMasBarato() {
        return pasR.PaseadorMasBarato();
    }

    @Override//---------------------------HU09: Revisar Paseadores Disponibles
    public List<ListarPaseadoresDto> ListarPaseadores() {
        return pasR.ListarPaseadores();
    }

    @Override//---------------------------HU18: Registrarse en la Aplicacion
    public void Registrar(Paseador paseador) {
        pasR.save(paseador);
    }

    @Override//---------------------------HU27: Revisar Perfil
    public List<ListarPaseadoresDto> InfoPaseador(String username) {
        return pasR.InfoPaseador(username);
    }
}
