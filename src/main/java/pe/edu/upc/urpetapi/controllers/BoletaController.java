package pe.edu.upc.urpetapi.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.urpetapi.dtos.BoletaDto;
import pe.edu.upc.urpetapi.entities.Boleta;
import pe.edu.upc.urpetapi.services.iBoletaService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/boleta")
public class BoletaController {
    @Autowired
    private iBoletaService bolS;

    @PostMapping
    public void CREATE(@RequestBody BoletaDto boletaDto) {
        ModelMapper m = new ModelMapper();
        Boleta u = m.map(boletaDto, Boleta.class);
        bolS.insert(u);
    }

    @GetMapping
    public List<BoletaDto> READ(){
        return bolS.list().stream().map(y->{
            ModelMapper m=new ModelMapper();
            return m.map(y,BoletaDto.class);
        }).collect(Collectors.toList());
    }

    @PutMapping
    public void UPDATE(@RequestBody BoletaDto boletaDto) {
        ModelMapper m = new ModelMapper();
        Boleta u = m.map(boletaDto, Boleta.class);
        bolS.insert(u);
    }

    @DeleteMapping("/{id}")
    public void DELETE(@PathVariable("id") Integer id) {
        bolS.delete(id);
    }

    @GetMapping("/{id}")
    public BoletaDto READID(@PathVariable("id") Integer id){
        ModelMapper m = new ModelMapper();
        BoletaDto dto = m.map(bolS.listId(id),BoletaDto.class);
        return dto;
    }
}
