package pe.edu.upc.urpetapi.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.upc.urpetapi.dtos.MembresiaDto;
import pe.edu.upc.urpetapi.entities.Membresia;
import pe.edu.upc.urpetapi.servicesinterfaces.iMembresiaService;

@RestController
@RequestMapping("/membresia")
public class MembresiaController {
    private iMembresiaService memS;

    @PostMapping("usuario/comprar")
    public void CompraMembresia(@RequestBody MembresiaDto membresiaDto) {
        ModelMapper m= new ModelMapper();
        Membresia mT = m.map(membresiaDto, Membresia.class);
        memS.ComprarMembresia(mT);
    };
}
