package pe.edu.upc.urpetapi.servicesinterfaces;

import pe.edu.upc.urpetapi.dtos.ListarPaseadoresDTO;

import java.util.List;

public interface iUsuarioService {
    public List<ListarPaseadoresDTO> ListarPaseadores();
}
