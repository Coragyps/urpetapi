package pe.edu.upc.urpetapi.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
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
    @Autowired
    private iMascotaService masS;

    @PostMapping("/registrar")//---------------------------HU07: Registrar Mascota
    @PreAuthorize("hasAuthority('ADMIN') || hasAuthority('CLIENTE')")
    public void RegistrarMascota(@RequestBody MascotaDto mascotaDto) {
        ModelMapper m = new ModelMapper();
        Mascota mT = m.map(mascotaDto, Mascota.class);
        masS.RegistrarMascota(mT);
    }

    @PutMapping("/modificar")//---------------------------HU29: Modificar Mascota
    @PreAuthorize("hasAuthority('ADMIN') || hasAuthority('CLIENTE')")
    public void ModificarMascota(@RequestBody MascotaDto mascotaDto) {
        ModelMapper m = new ModelMapper();
        Mascota mT = m.map(mascotaDto, Mascota.class);
        masS.RegistrarMascota(mT);
    }

    @GetMapping("/listar")//---------------------------HU08: Revisar Mascotas Registradas
    @PreAuthorize("hasAuthority('ADMIN') || hasAuthority('CLIENTE')")
    public List<MascotaDto> ListarMascota(@RequestParam String username) {
        return masS.MascotaPorUsuario(username).stream().map(y -> {
            ModelMapper m = new ModelMapper();
            return m.map(y, MascotaDto.class);
        }).collect(Collectors.toList());
    }
}