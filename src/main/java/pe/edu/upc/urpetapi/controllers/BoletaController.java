package pe.edu.upc.urpetapi.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.upc.urpetapi.dtos.BoletaDto;
import pe.edu.upc.urpetapi.dtos.MascotaDto;
import pe.edu.upc.urpetapi.servicesinterfaces.iBoletaService;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/boleta")
public class BoletaController {
    @Autowired
    private iBoletaService bolS;
    @GetMapping("/fecha")
    public List<BoletaDto> BoletasFecha(@RequestParam LocalDate fechaA, @RequestParam LocalDate fechaB)
    {
        return bolS.BoletasFechas(fechaA, fechaB).stream().map(y -> {
            ModelMapper m = new ModelMapper();
            return m.map(y, BoletaDto.class);
        }).collect(Collectors.toList());
    }
}
