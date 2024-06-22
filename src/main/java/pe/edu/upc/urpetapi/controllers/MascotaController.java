package pe.edu.upc.urpetapi.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.urpetapi.dtos.MascotaDto;
import pe.edu.upc.urpetapi.entities.Mascota;
import pe.edu.upc.urpetapi.services.iMascotaService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/mascota")
public class MascotaController {
    @Autowired
    private iMascotaService masS;

    @PostMapping
    public void CREATE(@RequestBody MascotaDto mascotaDto) {
        ModelMapper m = new ModelMapper();
        Mascota u = m.map(mascotaDto, Mascota.class);
        masS.insert(u);
    }

    @GetMapping
    public List<MascotaDto> READ(){
        return masS.list().stream().map(y->{
            ModelMapper m=new ModelMapper();
            return m.map(y,MascotaDto.class);
        }).collect(Collectors.toList());
    }

    @PutMapping
    public void UPDATE(@RequestBody MascotaDto mascotaDto) {
        ModelMapper m = new ModelMapper();
        Mascota u = m.map(mascotaDto, Mascota.class);
        masS.insert(u);
    }

    @DeleteMapping("/{id}")
    public void DELETE(@PathVariable("id") Integer id) {
        masS.delete(id);
    }

    @GetMapping("/{id}")
    public MascotaDto READID(@PathVariable("id") Integer id){
        ModelMapper m = new ModelMapper();
        MascotaDto dto = m.map(masS.listId(id),MascotaDto.class);
        return dto;
    }

    @GetMapping("/mias/{id}")
    public List<MascotaDto> MisMascotas(@PathVariable("id") Integer id){
        return masS.MascotaPorUsuario(id).stream().map(y->{
            ModelMapper m=new ModelMapper();
            return m.map(y,MascotaDto.class);
        }).collect(Collectors.toList());
    }
}