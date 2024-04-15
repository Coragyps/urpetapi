package pe.edu.upc.urpetapi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.urpetapi.servicesinterfaces.iUsuarioService;

@RestController
@RequestMapping("/Usuario")
public class UsuarioController {
    @Autowired
    private iUsuarioService useS;
    @Autowired
    private PasswordEncoder passwordEncoder;
}
