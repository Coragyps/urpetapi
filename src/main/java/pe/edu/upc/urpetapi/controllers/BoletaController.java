package pe.edu.upc.urpetapi.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.urpetapi.dtos.BoletaDto;
import pe.edu.upc.urpetapi.dtos.MascotaDto;
import pe.edu.upc.urpetapi.entities.Boleta;
import pe.edu.upc.urpetapi.servicesinterfaces.iBoletaService;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/boleta")
public class BoletaController {
    @Autowired
    private iBoletaService bolS;

    @PostMapping("/registrar")//---------------------------HU34: Registrar Boleta
    @PreAuthorize("hasAuthority('ADMIN') || hasAuthority('PASEADOR')")
    public void RegistrarBoleta(@RequestBody BoletaDto boletaDto) {
        ModelMapper m = new ModelMapper();
        Boleta mT = m.map(boletaDto, Boleta.class);
        bolS.RegistrarBoleta(mT);
    }

    @GetMapping("/fecha")//---------------------------HU06: Revisar Boletas por Año
    @PreAuthorize("hasAuthority('ADMIN')")
    public List<BoletaDto> BoletasFecha(@RequestParam LocalDate fechaA, @RequestParam LocalDate fechaB) {
        return bolS.BoletasFechas(fechaA, fechaB).stream().map(y -> {
            ModelMapper m = new ModelMapper();
            return m.map(y, BoletaDto.class);
        }).collect(Collectors.toList());
    }

    @GetMapping("/total")//---------------------------HU19: Revisar Ingreso Total
    @PreAuthorize("hasAuthority('ADMIN')")
    public List<BoletaDto> IngresoTotal() {
        return bolS.IngresoTotal().stream().map(y -> {
            ModelMapper m = new ModelMapper();
            return m.map(y, BoletaDto.class);
        }).collect(Collectors.toList());
    }

    @GetMapping("/listar")//---------------------------HU33: Revisar Boletas
    @PreAuthorize("hasAuthority('ADMIN') || hasAuthority('CLIENTE')")
    public List<BoletaDto> ListaBoletas(@RequestParam String username) {
        return bolS.BoletasPorUsuario(username).stream().map(y -> {
            ModelMapper m = new ModelMapper();
            return m.map(y, BoletaDto.class);
        }).collect(Collectors.toList());
    }
}
