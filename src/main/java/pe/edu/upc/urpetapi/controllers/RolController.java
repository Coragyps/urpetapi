package pe.edu.upc.urpetapi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.urpetapi.servicesinterfaces.iRolService;

@RestController
@RequestMapping("/rol")
public class RolController {
    @Autowired
    private iRolService rolS;
}
