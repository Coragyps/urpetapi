package pe.edu.upc.urpetapi.servicesinterfaces;

import org.springframework.data.repository.query.Param;
import pe.edu.upc.urpetapi.dtos.ListarPaseadoresDto;
import pe.edu.upc.urpetapi.entities.Paseador;

import java.util.List;

public interface iPaseadorService {

    public void Registrar(Paseador paseador);//---------------------------HU18: Registrarse en la Aplicacion

    public List<String[]> InfoPaseador(int id);//---------------------------HU27: Revisar Perfil

    public List<String[]> ListarPaseadores();//---------------------------HU09: Revisar Paseadores Disponibles

    public List<String[]> PaseadorMasBarato();//---------------------------HU10: Tarifa mas Accesible
}
