package pe.edu.upc.urpetapi.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.urpetapi.dtos.MembresiaDto;
import pe.edu.upc.urpetapi.entities.Membresia;
import pe.edu.upc.urpetapi.servicesinterfaces.iMembresiaService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/membresia")
public class MembresiaController {
    @Autowired
    private iMembresiaService memS;

    @PostMapping("/comprar")//---------------------------HU24: Comprar Membresía
    @PreAuthorize("hasAuthority('ADMIN') || hasAuthority('CLIENTE')")
    public void CompraMembresia(@RequestBody MembresiaDto membresiaDto) {
        ModelMapper m = new ModelMapper();
        Membresia mT = m.map(membresiaDto, Membresia.class);
        memS.ComprarMembresia(mT);
    }

    @PutMapping("/cancelar/{id}")//---------------------------HU25: Cancelar Membresia
    @PreAuthorize("hasAuthority('ADMIN') || hasAuthority('CLIENTE')")
    public void CancelarMembresia(@PathVariable("id") Integer id) {
        memS.Cancelar(id);
    }

    @GetMapping("/listar")//---------------------------HU23: Revisar Historial de Membresías
    @PreAuthorize("hasAuthority('ADMIN') || hasAuthority('CLIENTE')")
    public List<MembresiaDto> MembresiaPorUsuario(@RequestParam String username) {
        return memS.MembresiaPorUsuario(username).stream().map(y -> {
            ModelMapper m = new ModelMapper();
            return m.map(y, MembresiaDto.class);
        }).collect(Collectors.toList());
    }

    @GetMapping("/activa")//---------------------------HU12: Revisar Membresias Activas
    @PreAuthorize("hasAuthority('ADMIN')")
    public List<MembresiaDto> MembresiasActivas() {
        return memS.MembresiasActivas().stream().map(y -> {
            ModelMapper m = new ModelMapper();
            return m.map(y, MembresiaDto.class);
        }).collect(Collectors.toList());
    }
}
