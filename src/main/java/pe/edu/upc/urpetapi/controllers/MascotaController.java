package pe.edu.upc.urpetapi.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.urpetapi.dtos.BilleteraDto;
import pe.edu.upc.urpetapi.dtos.MascotaDto;
import pe.edu.upc.urpetapi.entities.Mascota;
import pe.edu.upc.urpetapi.servicesinterfaces.iMascotaService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/mascota")
public class MascotaController {
    private iMascotaService masS;
    @PostMapping("/usuario/registrar")
    public void RegistrarMascota(@RequestBody MascotaDto mascotaDto)
    {
        ModelMapper m=new ModelMapper();
        Mascota mT=m.map(mascotaDto ,Mascota.class);
        masS.RegistrarMascota(mT);
    }
    @PutMapping("/usuario/modificar")
    public void ModificarMascota(@RequestBody MascotaDto mascotaDto)
    {
        ModelMapper m=new ModelMapper();
        Mascota mT=m.map(mascotaDto ,Mascota.class);
        masS.RegistrarMascota(mT);
    }
    @GetMapping("/usuario/listar")
    public List<MascotaDto> ListarMascota(@RequestParam String username)
    {
        return masS.MascotaPorUsuario(username).stream().map(y -> {
            ModelMapper m = new ModelMapper();
            return m.map(y, MascotaDto.class);
        }).collect(Collectors.toList());
    }
}