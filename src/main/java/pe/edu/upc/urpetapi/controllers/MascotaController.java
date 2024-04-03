package pe.edu.upc.urpetapi.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.upc.urpetapi.servicesinterfaces.iMascotaService;

@RestController
@RequestMapping("/Mascota")
public class MascotaController {
    private iMascotaService iMas;
}
