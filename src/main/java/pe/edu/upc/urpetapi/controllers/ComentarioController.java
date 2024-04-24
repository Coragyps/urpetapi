package pe.edu.upc.urpetapi.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.upc.urpetapi.dtos.ComentarioDto;
import pe.edu.upc.urpetapi.entities.Comentario;
import pe.edu.upc.urpetapi.servicesinterfaces.iComentarioService;

@RestController
@RequestMapping("/comentario")
public class ComentarioController {
    private iComentarioService comS;
    @PostMapping("/registrar")
    public void DejarComentario(@RequestBody ComentarioDto comentarioDto){
        ModelMapper m= new ModelMapper();
        Comentario mT=m.map(comentarioDto,Comentario.class);
        comS.DejarComentario(mT);
    }
}
