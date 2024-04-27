package pe.edu.upc.urpetapi.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.urpetapi.dtos.ListarPaseadoresDto;
import pe.edu.upc.urpetapi.dtos.UsuarioDto;
import pe.edu.upc.urpetapi.entities.Usuario;
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

    @PostMapping("/registrar")//---------------------------HU18: Registrarse en la Aplicacion
    public void Registrar(@RequestBody UsuarioDto usuarioDto) {
        ModelMapper m = new ModelMapper();
        Usuario u = m.map(usuarioDto, Usuario.class);
        String encodedPassword = passwordEncoder.encode(u.getPassword());
        u.setPassword(encodedPassword);
        useS.Registrar(u);
    }

    @PutMapping("/modificar")//---------------------------HU01: Modificar Cuenta
    public void Modificar(@RequestBody UsuarioDto usuarioDto) {
        ModelMapper m = new ModelMapper();
        Usuario u = m.map(usuarioDto, Usuario.class);
        useS.Registrar(u);
    }
}
