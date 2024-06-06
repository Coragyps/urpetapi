package pe.edu.upc.urpetapi.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.urpetapi.dtos.ComentarioDto;
import pe.edu.upc.urpetapi.entities.Comentario;
import pe.edu.upc.urpetapi.services.iComentarioService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/comentario")
public class ComentarioController {
    @Autowired
    private iComentarioService comS;

    @PostMapping
    public void CREATE(@RequestBody ComentarioDto comentarioDto) {
        ModelMapper m = new ModelMapper();
        Comentario u = m.map(comentarioDto, Comentario.class);
        comS.insert(u);
    }

    @GetMapping
    public List<ComentarioDto> READ(){
        return comS.list().stream().map(y->{
            ModelMapper m=new ModelMapper();
            return m.map(y,ComentarioDto.class);
        }).collect(Collectors.toList());
    }

    @PutMapping
    public void UPDATE(@RequestBody ComentarioDto usuarioDto) {
        ModelMapper m = new ModelMapper();
        Comentario u = m.map(usuarioDto, Comentario.class);
        comS.insert(u);
    }

    @DeleteMapping("/{id}")
    public void DELETE(@PathVariable("id") Integer id) {
        comS.delete(id);
    }

    @GetMapping("/{id}")
    public ComentarioDto READID(@PathVariable("id") Integer id){
        ModelMapper m = new ModelMapper();
        ComentarioDto dto = m.map(comS.listId(id),ComentarioDto.class);
        return dto;
    }
}
