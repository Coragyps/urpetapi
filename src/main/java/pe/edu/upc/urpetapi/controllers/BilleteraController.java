package pe.edu.upc.urpetapi.controllers;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
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

    @PostMapping("/registrar")//---------------------------HU32: Registar Billetera Virtual
    @PreAuthorize("hasAuthority('ADMIN') || hasAuthority('CLIENTE')")
    public void RegistrarBilletera(@RequestBody BilleteraDto billeteraDto) {
        ModelMapper m = new ModelMapper();
        Billetera mT = m.map(billeteraDto, Billetera.class);
        bilS.RegistrarBilletera(mT);
    }

    @GetMapping("/monto")//---------------------------HU21: Revisar Monto de la Billetera Virtual
    @PreAuthorize("hasAuthority('ADMIN') || hasAuthority('CLIENTE')")
    public List<BilleteraDto> BilleteraMonto(@RequestParam String username) {
        return bilS.BilleteraPorUsuario(username).stream().map(y -> {
            ModelMapper m = new ModelMapper();
            return m.map(y, BilleteraDto.class);
        }).collect(Collectors.toList());
    }

    @PutMapping("/usar/{id}/{cantidad}")//---------------------------HU13: Pagar con Billetera Virtual
    @PreAuthorize("hasAuthority('ADMIN') || hasAuthority('CLIENTE')")
    public void Usar(@PathVariable("id") Integer id, @PathVariable("cantidad") double cantidad) {
        bilS.UsarBilleter(id, cantidad);
    }

    @PutMapping("/recargar/{id}/{cantidad}")//---------------------------HU22: Recargar Billetera Virtual
    @PreAuthorize("hasAuthority('ADMIN') || hasAuthority('CLIENTE')")
    public void Recargar(@PathVariable("id") Integer id, @PathVariable("cantidad") double cantidad) {
        bilS.RecargarBilleter(id, cantidad);
    }
}


