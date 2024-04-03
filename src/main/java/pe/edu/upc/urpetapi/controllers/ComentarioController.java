package pe.edu.upc.urpetapi.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.upc.urpetapi.servicesinterfaces.iComentarioService;

@RestController
@RequestMapping("/Comentario")
public class ComentarioController {
    private iComentarioService iCom;
}
