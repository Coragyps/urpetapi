package pe.edu.upc.urpetapi.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.upc.urpetapi.servicesinterfaces.iReservaService;

@RestController
@RequestMapping("/Reserva")
public class ReservaController {
    private iReservaService resS;
}
