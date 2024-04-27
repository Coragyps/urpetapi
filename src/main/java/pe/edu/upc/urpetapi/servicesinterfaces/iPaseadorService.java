package pe.edu.upc.urpetapi.servicesinterfaces;

import org.springframework.data.repository.query.Param;
import pe.edu.upc.urpetapi.dtos.ListarPaseadoresDto;
import pe.edu.upc.urpetapi.entities.Paseador;

import java.util.List;

public interface iPaseadorService {

    public void Registrar(Paseador paseador);//---------------------------HU18: Registrarse en la Aplicacion

    public List<ListarPaseadoresDto> InfoPaseador(@Param("username") String username);//---------------------------HU27: Revisar Perfil

    public List<ListarPaseadoresDto> ListarPaseadores();//---------------------------HU09: Revisar Paseadores Disponibles

    public List<ListarPaseadoresDto> PaseadorMasBarato();//---------------------------HU10: Tarifa mas Accesible
}
