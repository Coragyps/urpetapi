package pe.edu.upc.urpetapi.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.urpetapi.dtos.ListarPaseadoresDTO;
import pe.edu.upc.urpetapi.servicesinterfaces.iUsuarioService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    @Autowired
    private iUsuarioService useS;
    @Autowired
    private PasswordEncoder passwordEncoder;

    @GetMapping("/paseadores/listar")
    public List<ListarPaseadoresDTO > ListarPaseadores(){
        return useS.ListarPaseadores().stream().map(y->{
            ModelMapper m = new ModelMapper();
            return m.map(y, ListarPaseadoresDTO.class);
        }).collect(Collectors.toList());
    };
}
