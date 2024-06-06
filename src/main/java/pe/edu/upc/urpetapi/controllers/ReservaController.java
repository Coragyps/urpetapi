package pe.edu.upc.urpetapi.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.urpetapi.dtos.PaseosPorClientesDto;
import pe.edu.upc.urpetapi.dtos.ReservaDto;
import pe.edu.upc.urpetapi.entities.Reserva;
import pe.edu.upc.urpetapi.services.iReservaService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/reserva")
public class ReservaController {
    @Autowired
    private iReservaService resS;

    @PostMapping
    public void CREATE(@RequestBody ReservaDto reservaDto) {
        ModelMapper m = new ModelMapper();
        Reserva rP = m.map(reservaDto, Reserva.class);
        resS.insert(rP);
    }

    @GetMapping
    public List<ReservaDto> READ(){
        return resS.list().stream().map(y->{
            ModelMapper m=new ModelMapper();
            return m.map(y, ReservaDto.class);
        }).collect(Collectors.toList());
    }

    @PutMapping
    public void UPDATE(@RequestBody ReservaDto reservaDto) {
        ModelMapper m = new ModelMapper();
        Reserva rP = m.map(reservaDto, Reserva.class);
        resS.insert(rP);
    }

    @DeleteMapping("/{id}")
    public void DELETE(@PathVariable("id") Integer id) {
        resS.delete(id);
    }

    @GetMapping("/{id}")
    public ReservaDto READID(@PathVariable("id") Integer id){
        ModelMapper m=new ModelMapper();
        ReservaDto dto=m.map(resS.listId(id),ReservaDto.class);
        return dto;
    }

    /*
    
    @PutMapping("/{id}/{estado}")
    public void EstadoPaseo(@PathVariable("id") Integer id, @PathVariable("estado") String estado) {
        resS.cambiarEstado(id,estado);
    }

    @GetMapping("/usuario/{id}")
    public List<ReservaDto> ReservasPorCliente(@PathVariable("id") Integer id) {
        return resS.listUsuario(id).stream().map(y->{
            ModelMapper m = new ModelMapper();
            return m.map(y,ReservaDto.class);
        }).collect(Collectors.toList());
    }

    @GetMapping("/paseador/{id}")
    public List<ReservaDto> ReservasPorPaseador(@PathVariable("id") Integer id) {
        return resS.listPaseador(id).stream().map(y->{
            ModelMapper m = new ModelMapper();
            return m.map(y,ReservaDto.class);
        }).collect(Collectors.toList());
    }

    @GetMapping("/paseador/{id}/clientes")
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

     */



}
