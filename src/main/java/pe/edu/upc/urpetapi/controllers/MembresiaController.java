package pe.edu.upc.urpetapi.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.urpetapi.dtos.MembresiaDto;
import pe.edu.upc.urpetapi.entities.Membresia;
import pe.edu.upc.urpetapi.services.iMembresiaService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/membresia")
public class MembresiaController {
    @Autowired
    private iMembresiaService memS;

    @PostMapping
    public void CREATE(@RequestBody MembresiaDto membresiaDto) {
        ModelMapper m = new ModelMapper();
        Membresia u = m.map(membresiaDto, Membresia.class);
        memS.insert(u);
    }

    @GetMapping
    public List<MembresiaDto> READ(){
        return memS.list().stream().map(y->{
            ModelMapper m=new ModelMapper();
            return m.map(y,MembresiaDto.class);
        }).collect(Collectors.toList());
    }

    @PutMapping
    public void UPDATE(@RequestBody MembresiaDto membresiaDto) {
        ModelMapper m = new ModelMapper();
        Membresia u = m.map(membresiaDto, Membresia.class);
        memS.insert(u);
    }

    @DeleteMapping("/{id}")
    public void DELETE(@PathVariable("id") Integer id) {
        memS.delete(id);
    }

    @GetMapping("/{id}")
    public MembresiaDto READID(@PathVariable("id") Integer id){
        ModelMapper m = new ModelMapper();
        MembresiaDto dto = m.map(memS.listId(id),MembresiaDto.class);
        return dto;
    }
}
