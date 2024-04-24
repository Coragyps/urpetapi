package pe.edu.upc.urpetapi.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.upc.urpetapi.dtos.ReservaDto;
import pe.edu.upc.urpetapi.entities.Reserva;
import pe.edu.upc.urpetapi.servicesinterfaces.iReservaService;

@RestController
@RequestMapping("/reserva")
public class ReservaController {
    private iReservaService resS;
    @PostMapping("/solicitar")
    public void SolicitarPaseo(@RequestBody ReservaDto reservaDto){
        ModelMapper m=new ModelMapper();
        Reserva rP=m.map(reservaDto,Reserva.class);
        resS.SolicitarPaseo(rP);
    }
}
