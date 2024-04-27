package pe.edu.upc.urpetapi.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.urpetapi.dtos.PaseosPorClientesDto;
import pe.edu.upc.urpetapi.dtos.ReservaDto;
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

    @PostMapping("/solicitar")//---------------------------HU11: Solicitar Paseo
    @PreAuthorize("hasAuthority('ADMIN') || hasAuthority('CLIENTE')")
    public void SolicitarPaseo(@RequestBody ReservaDto reservaDto) {
        ModelMapper m = new ModelMapper();
        Reserva rP = m.map(reservaDto, Reserva.class);
        resS.SolicitarPaseo(rP);
    }

    @PutMapping("/rechazar/{id}")//---------------------------HU03: Confirmar Paseo
    @PreAuthorize("hasAuthority('ADMIN') || hasAuthority('PASEADOR')")
    public void RechazarPaseo(@PathVariable("id") Integer id) {
        resS.Rechazar(id);
    }

    @PutMapping("/aceptar/{id}")//---------------------------HU03: Confirmar Paseo
    @PreAuthorize("hasAuthority('ADMIN') || hasAuthority('PASEADOR')")
    public void AceptarPaseo(@PathVariable("id") Integer id) {
        resS.Aceptar(id);
    }

    @PutMapping("/finalizar/{id}")//---------------------------HU28: Terminar Paseo
    @PreAuthorize("hasAuthority('ADMIN') || hasAuthority('PASEADOR')")
    public void FinalizarPaseo(@PathVariable("id") Integer id) {
        resS.Finalizar(id);
    }

    @GetMapping("/historial/solicitados")//---------------------------HU14: Revisar Historial de Paseos Adquiridos
    @PreAuthorize("hasAuthority('ADMIN') || hasAuthority('CLIENTE')")
    public List<ReservaDto> ReservaPorCliente(@RequestParam String username) {
        return resS.ReservaPorCliente(username).stream().map(y -> {
            ModelMapper m = new ModelMapper();
            return m.map(y, ReservaDto.class);
        }).collect(Collectors.toList());
    }

    @GetMapping("/historial/finalizados")//---------------------------HU04: Revisar Historial de Paseos Completados
    @PreAuthorize("hasAuthority('ADMIN') || hasAuthority('PASEADOR')")
    public List<ReservaDto> ReservaPorPaseador(@RequestParam String username) {
        return resS.ReservaPorPaseador(username).stream().map(y -> {
            ModelMapper m = new ModelMapper();
            return m.map(y, ReservaDto.class);
        }).collect(Collectors.toList());
    }

    @GetMapping("/historial/pendientes")//---------------------------HU02: Revisar Paseos Pendientes
    @PreAuthorize("hasAuthority('ADMIN') || hasAuthority('PASEADOR')")
    public List<ReservaDto> PaseosPendientes(@RequestParam String username) {
        return resS.PaseosPendientes(username).stream().map(y -> {
            ModelMapper m = new ModelMapper();
            return m.map(y, ReservaDto.class);
        }).collect(Collectors.toList());
    }

    @GetMapping("/historial/rechazados")//---------------------------HU36: Revisar Paseos Rechazados
    @PreAuthorize("hasAuthority('ADMIN') || hasAuthority('PASEADOR')")
    public List<ReservaDto> PaseosRechazados(@RequestParam String username) {
        return resS.PaseosRechazados(username).stream().map(y -> {
            ModelMapper m = new ModelMapper();
            return m.map(y, ReservaDto.class);
        }).collect(Collectors.toList());
    }

    @GetMapping("/historial/aceptados")//---------------------------HU35: Revisar Paseos Aceptados
    @PreAuthorize("hasAuthority('ADMIN') || hasAuthority('PASEADOR')")
    public List<ReservaDto> PaseosAceptados(@RequestParam String username) {
        return resS.PaseosAceptados(username).stream().map(y -> {
            ModelMapper m = new ModelMapper();
            return m.map(y, ReservaDto.class);
        }).collect(Collectors.toList());
    }

    @GetMapping("/cliente")//---------------------------HU17: Cantidad de Paseos por Cliente
    @PreAuthorize("hasAuthority('ADMIN') || hasAuthority('PASEADOR')")
    public List<PaseosPorClientesDto> PaseosPorCliente(@RequestParam String username) {
        List<String[]> filaLista = resS.PaseosporCliente(username);
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
