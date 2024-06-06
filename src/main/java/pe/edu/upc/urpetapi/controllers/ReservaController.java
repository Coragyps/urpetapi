package pe.edu.upc.urpetapi.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.urpetapi.dtos.PaseosPorClientesDto;
import pe.edu.upc.urpetapi.dtos.ReservaDto;
import pe.edu.upc.urpetapi.dtos.UsuarioDto;
import pe.edu.upc.urpetapi.entities.Reserva;
import pe.edu.upc.urpetapi.servicesinterfaces.iReservaService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/reserva")
public class ReservaController {
    @Autowired
    private iReservaService resS;

    @PostMapping//---------------------------HU11: Solicitar Paseo
    @PreAuthorize("hasAuthority('ADMIN') || hasAuthority('CLIENTE')")
    public void CREATE(@RequestBody ReservaDto reservaDto) {
        ModelMapper m = new ModelMapper();
        Reserva rP = m.map(reservaDto, Reserva.class);
        resS.insert(rP);
    }

    @GetMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public List<ReservaDto> READ(){
        return resS.list().stream().map(y->{
            ModelMapper m=new ModelMapper();
            return m.map(y, ReservaDto.class);
        }).collect(Collectors.toList());
    }

    @PutMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public void UPDATE(@RequestBody ReservaDto reservaDto) {
        ModelMapper m = new ModelMapper();
        Reserva rP = m.map(reservaDto, Reserva.class);
        resS.insert(rP);
    }

    @DeleteMapping("/{id}")
    @PreAuthorize("hasAuthority('ADMIN')")
    public void DELETE(@PathVariable("id") Integer id) {
        resS.delete(id);
    }

    @PutMapping("/{id}/{estado}")//---------------------------HU03: Confirmar Paseo
    @PreAuthorize("hasAuthority('ADMIN') || hasAuthority('PASEADOR')")
    public void EstadoPaseo(@PathVariable("id") Integer id, @PathVariable("estado") String estado) {
        resS.cambiarEstado(id,estado);
    }

    @GetMapping("/{id}")
    @PreAuthorize("hasAuthority('ADMIN')")
    public ReservaDto READID(@PathVariable("id") Integer id){
        ModelMapper m=new ModelMapper();
        ReservaDto dto=m.map(resS.listId(id),ReservaDto.class);
        return dto;
    }

    @GetMapping("/usuario/{id}/{estado}")
    @PreAuthorize("hasAuthority('ADMIN') || hasAuthority('CLIENTE')")
    public List<ReservaDto> ReservasPorEstadoPorCliente(@PathVariable("id") Integer id, @PathVariable("estado") String estado) {
        return resS.listEstadoUsuario(id,estado).stream().map(y->{
            ModelMapper m = new ModelMapper();
            return m.map(y,ReservaDto.class);
        }).collect(Collectors.toList());
    }

    @GetMapping("/usuario/{id}")
    @PreAuthorize("hasAuthority('ADMIN') || hasAuthority('CLIENTE')")
    public List<ReservaDto> ReservasPorCliente(@PathVariable("id") Integer id) {
        return resS.listUsuario(id).stream().map(y->{
            ModelMapper m = new ModelMapper();
            return m.map(y,ReservaDto.class);
        }).collect(Collectors.toList());
    }

    @GetMapping("/paseador/{id}/{estado}")
    @PreAuthorize("hasAuthority('ADMIN') || hasAuthority('PASEADOR')")
    public List<ReservaDto> ReservasPorEstadoPorPaseador(@PathVariable("id") Integer id, @PathVariable("estado") String estado) {
        return resS.listEstadoPaseador(id,estado).stream().map(y->{
            ModelMapper m = new ModelMapper();
            return m.map(y,ReservaDto.class);
        }).collect(Collectors.toList());
    }

    @GetMapping("/paseador/{id}")
    @PreAuthorize("hasAuthority('ADMIN') || hasAuthority('PASEADOR')")
    public List<ReservaDto> ReservasPorPaseador(@PathVariable("id") Integer id) {
        return resS.listPaseador(id).stream().map(y->{
            ModelMapper m = new ModelMapper();
            return m.map(y,ReservaDto.class);
        }).collect(Collectors.toList());
    }

    @GetMapping("/paseador/{id}/clientes")
    @PreAuthorize("hasAuthority('ADMIN') || hasAuthority('PASEADOR')")
    public List<PaseosPorClientesDto> CantidadReservasPorClientePorPaseador(@PathVariable("id") Integer id) {
        List<String[]> filaLista = resS.listClientesPaseador(id);
        List<PaseosPorClientesDto> dtoLista = new ArrayList<>();

        for (String[] columna : filaLista) {
            PaseosPorClientesDto dto = new PaseosPorClientesDto();
            dto.setUsernameCliente(columna[0]);
            dto.setCantidadPaseos(Integer.parseInt(columna[1]));
            dtoLista.add(dto);
        }
        return dtoLista;
    }




}
