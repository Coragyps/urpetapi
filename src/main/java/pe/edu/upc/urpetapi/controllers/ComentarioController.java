package pe.edu.upc.urpetapi.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.urpetapi.dtos.ComentarioDto;
import pe.edu.upc.urpetapi.dtos.MascotaDto;
import pe.edu.upc.urpetapi.entities.Comentario;
import pe.edu.upc.urpetapi.entities.Mascota;
import pe.edu.upc.urpetapi.servicesinterfaces.iComentarioService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/comentario")
public class ComentarioController {
    @Autowired
    private iComentarioService comS;

    @PostMapping("/registrar")//---------------------------HU15: Dejar Comentario
    @PreAuthorize("hasAuthority('ADMIN') || hasAuthority('CLIENTE')")
    public void DejarComentario(@RequestBody ComentarioDto comentarioDto) {
        ModelMapper m = new ModelMapper();
        Comentario mT = m.map(comentarioDto, Comentario.class);
        comS.DejarComentario(mT);
    }

    @GetMapping("/listar")//---------------------------HU05: Revisar Comentarios
    @PreAuthorize("hasAuthority('ADMIN') || hasAuthority('PASEADOR')")
    public List<ComentarioDto> ComentarioPorPaseador(@RequestParam String username) {
        return comS.ComentarioPorPaseador(username).stream().map(y -> {
            ModelMapper m = new ModelMapper();
            return m.map(y, ComentarioDto.class);
        }).collect(Collectors.toList());
    }

    @GetMapping("/peor")//---------------------------HU16: Comentario con Menor Puntuacion
    @PreAuthorize("hasAuthority('ADMIN') || hasAuthority('PASEADOR')")
    public List<ComentarioDto> PeorComentario(@RequestParam String username) {
        return comS.PeorComentario(username).stream().map(y -> {
            ModelMapper m = new ModelMapper();
            return m.map(y, ComentarioDto.class);
        }).collect(Collectors.toList());
    }

    @GetMapping("/puntuacion")//---------------------------HU26: Paseador con mejor Puntuación
    @PreAuthorize("hasAuthority('ADMIN') || hasAuthority('CLIENTE')")
    public List<ComentarioDto> MayorPuntuacion() {
        return comS.MayorPuntuacionPaseador().stream().map(y -> {
            ModelMapper m = new ModelMapper();
            return m.map(y, ComentarioDto.class);
        }).collect(Collectors.toList());
    }

    @PutMapping("/modificar")//---------------------------HU31: Modificar Comentario
    @PreAuthorize("hasAuthority('ADMIN') || hasAuthority('CLIENTE')")
    public void ModificarComentario(@RequestBody ComentarioDto comentarioDto) {
        ModelMapper m = new ModelMapper();
        Comentario mT = m.map(comentarioDto, Comentario.class);
        comS.DejarComentario(mT);
    }
}
