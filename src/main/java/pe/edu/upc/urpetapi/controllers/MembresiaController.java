package pe.edu.upc.urpetapi.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.upc.urpetapi.servicesinterfaces.iMembresiaService;

@RestController
@RequestMapping("/Membresia")
public class MembresiaController {
    private iMembresiaService memS;
}
