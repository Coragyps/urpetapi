package pe.edu.upc.urpetapi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.upc.urpetapi.servicesinterfaces.iUsuarioService;

@RestController
@RequestMapping("/Usuario")
public class UsuarioController {
    private iUsuarioService iUsu;
}
