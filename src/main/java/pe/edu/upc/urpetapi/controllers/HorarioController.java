package pe.edu.upc.urpetapi.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.upc.urpetapi.servicesinterfaces.iHorarioService;

@RestController
@RequestMapping("/Horario")
public class HorarioController {
    private iHorarioService horS;
}
