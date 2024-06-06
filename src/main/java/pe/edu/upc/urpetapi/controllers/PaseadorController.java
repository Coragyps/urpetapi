package pe.edu.upc.urpetapi.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.urpetapi.dtos.PaseadorDto;
import pe.edu.upc.urpetapi.entities.Paseador;
import pe.edu.upc.urpetapi.services.iPaseadorService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/paseador")
public class PaseadorController {
    @Autowired
    private iPaseadorService pasS;

    @PostMapping
    public void CREATE(@RequestBody PaseadorDto paseadorDto) {
        ModelMapper m = new ModelMapper();
        Paseador u = m.map(paseadorDto, Paseador.class);
        pasS.insert(u);
    }

    @GetMapping
    public List<PaseadorDto> READ(){
        return pasS.list().stream().map(y->{
            ModelMapper m=new ModelMapper();
            return m.map(y,PaseadorDto.class);
        }).collect(Collectors.toList());
    }

    @PutMapping
    public void UPDATE(@RequestBody PaseadorDto paseadorDto) {
        ModelMapper m = new ModelMapper();
        Paseador u = m.map(paseadorDto, Paseador.class);
        pasS.insert(u);
    }

    @DeleteMapping("/{id}")
    public void DELETE(@PathVariable("id") Integer id) {
        pasS.delete(id);
    }

    @GetMapping("/{id}")
    public PaseadorDto READID(@PathVariable("id") Integer id){
        ModelMapper m = new ModelMapper();
        PaseadorDto dto = m.map(pasS.listId(id),PaseadorDto.class);
        return dto;
    }

}
