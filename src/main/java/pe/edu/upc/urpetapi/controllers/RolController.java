package pe.edu.upc.urpetapi.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.urpetapi.dtos.RolDto;
import pe.edu.upc.urpetapi.entities.Rol;
import pe.edu.upc.urpetapi.services.iRolService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/rol")
public class RolController {
    @Autowired
    private iRolService rolS;

    @PostMapping
    public void CREATE(@RequestBody RolDto rolDto) {
        ModelMapper m = new ModelMapper();
        Rol u = m.map(rolDto, Rol.class);
        rolS.insert(u);
    }

    @GetMapping
    public List<RolDto> READ(){
        return rolS.list().stream().map(y->{
            ModelMapper m=new ModelMapper();
            return m.map(y,RolDto.class);
        }).collect(Collectors.toList());
    }

    @PutMapping
    public void UPDATE(@RequestBody RolDto rolDto) {
        ModelMapper m = new ModelMapper();
        Rol u = m.map(rolDto, Rol.class);
        rolS.insert(u);
    }

    @DeleteMapping("/{id}")
    public void DELETE(@PathVariable("id") Integer id) {
        rolS.delete(id);
    }

    @GetMapping("/{id}")
    public RolDto READID(@PathVariable("id") Integer id){
        ModelMapper m = new ModelMapper();
        RolDto dto = m.map(rolS.listId(id),RolDto.class);
        return dto;
    }
}
