package pe.edu.upc.urpetapi.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.urpetapi.dtos.BilleteraDto;
import pe.edu.upc.urpetapi.entities.Billetera;
import pe.edu.upc.urpetapi.servicesinterfaces.iBilleteraService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/billetera")
public class BilleteraController {
    @Autowired
    private iBilleteraService bilS;

    @PostMapping("/usuario/registrar")
    public void RegistrarBilletera(@RequestBody BilleteraDto billeteraDto) {
        ModelMapper m = new ModelMapper();
        Billetera mT = m.map(billeteraDto, Billetera.class);
        bilS.RegistrarBilletera(mT);
    }

    @GetMapping("/usuario/monto")
    public List<BilleteraDto> BilleteraMonto(@RequestParam String username) {
        return bilS.BilleteraPorUsuario(username).stream().map(y -> {
            ModelMapper m = new ModelMapper();
            return m.map(y, BilleteraDto.class);
        }).collect(Collectors.toList());
    }
}


