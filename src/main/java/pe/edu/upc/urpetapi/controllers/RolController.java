package pe.edu.upc.urpetapi.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.upc.urpetapi.servicesinterfaces.iRolService;

@RestController
@RequestMapping("/Rol")
public class RolController {
    private iRolService iRol;
}
