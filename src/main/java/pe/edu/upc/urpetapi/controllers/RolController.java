package pe.edu.upc.urpetapi.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.urpetapi.dtos.RolDto;
import pe.edu.upc.urpetapi.dtos.UsuarioDto;
import pe.edu.upc.urpetapi.entities.Rol;
import pe.edu.upc.urpetapi.entities.Usuario;
import pe.edu.upc.urpetapi.servicesinterfaces.iRolService;

@RestController
@RequestMapping("/rol")
public class RolController {
    @Autowired
    private iRolService rolS;

    @PostMapping("/registrar")//---------------------------HU30: Asignar Roles
    public void Registrar(@RequestBody RolDto rolDto) {
        ModelMapper m = new ModelMapper();
        Rol rrr = m.map(rolDto, Rol.class);
        rolS.asignar(rrr);
    }
}
