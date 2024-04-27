package pe.edu.upc.urpetapi.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.urpetapi.dtos.ListarPaseadoresDto;
import pe.edu.upc.urpetapi.dtos.PaseadorDto;
import pe.edu.upc.urpetapi.entities.Paseador;
import pe.edu.upc.urpetapi.servicesinterfaces.iPaseadorService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/paseador")
public class PaseadorController {
    @Autowired
    private iPaseadorService pasS;

    @GetMapping("/listar")//---------------------------HU09: Revisar Paseadores Disponibles
    @PreAuthorize("hasAuthority('ADMIN') || hasAuthority('CLIENTE')")
    public List<ListarPaseadoresDto> ListarPaseadores(){
        return pasS.ListarPaseadores().stream().map(y->{
            ModelMapper m = new ModelMapper();
            return m.map(y, ListarPaseadoresDto.class);
        }).collect(Collectors.toList());
    };

    @GetMapping("/tarifa")//---------------------------HU10: Tarifa mas Accesible
    @PreAuthorize("hasAuthority('ADMIN') || hasAuthority('CLIENTE')")
    public List<ListarPaseadoresDto> MenorPrecio(){
        return pasS.PaseadorMasBarato().stream().map(y->{
            ModelMapper m = new ModelMapper();
            return m.map(y, ListarPaseadoresDto.class);
        }).collect(Collectors.toList());
    };

    @GetMapping("/info")//---------------------------HU27: Revisar Perfil
    @PreAuthorize("hasAuthority('ADMIN') || hasAuthority('PASEADOR')")
    public List<ListarPaseadoresDto> InfoPaseador(@RequestParam String username){
        return pasS.InfoPaseador(username).stream().map(y->{
            ModelMapper m = new ModelMapper();
            return m.map(y, ListarPaseadoresDto.class);
        }).collect(Collectors.toList());
    };

    @PostMapping("/registrar")//---------------------------HU18: Registrarse en la Aplicacion
    public void Registrar(@RequestBody PaseadorDto paseadorDto) {
        ModelMapper m = new ModelMapper();
        Paseador u = m.map(paseadorDto, Paseador.class);
        pasS.Registrar(u);
    }

    @PutMapping("/modificar")//---------------------------HU01: Modificar Cuenta
    public void Modificar(@RequestBody PaseadorDto paseadorDto) {
        ModelMapper m = new ModelMapper();
        Paseador u = m.map(paseadorDto, Paseador.class);
        pasS.Registrar(u);
    }

}
