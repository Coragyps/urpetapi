package pe.edu.upc.urpetapi.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.urpetapi.dtos.UsuarioDto;
import pe.edu.upc.urpetapi.entities.Usuario;
import pe.edu.upc.urpetapi.services.iUsuarioService;


import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    @Autowired
    private iUsuarioService useS;
    @Autowired
    private PasswordEncoder passwordEncoder;

    @PostMapping
    public void CREATE(@RequestBody UsuarioDto usuarioDto) {
        ModelMapper m = new ModelMapper();
        Usuario u = m.map(usuarioDto, Usuario.class);
        String encodedPassword = passwordEncoder.encode(u.getPassword());
        u.setPassword(encodedPassword);
        useS.insert(u);
    }

    @GetMapping
    public List<UsuarioDto> READ(){
        return useS.list().stream().map(y->{
            ModelMapper m=new ModelMapper();
            return m.map(y,UsuarioDto.class);
        }).collect(Collectors.toList());
    }

    @PutMapping
    public void UPDATE(@RequestBody UsuarioDto usuarioDto) {
        ModelMapper m = new ModelMapper();
        Usuario u = m.map(usuarioDto, Usuario.class);
        String encodedPassword = passwordEncoder.encode(u.getPassword());
        u.setPassword(encodedPassword);
        useS.insert(u);
    }

    @DeleteMapping("/{id}")
    public void DELETE(@PathVariable("id") Integer id) {
        useS.delete(id);
    }

    @GetMapping("/{id}")
    public UsuarioDto READID(@PathVariable("id") Integer id){
        ModelMapper m = new ModelMapper();
        UsuarioDto dto = m.map(useS.listId(id),UsuarioDto.class);
        return dto;
    }

    @GetMapping("/")
    public ResponseEntity<Boolean> usuarioEnUso(@RequestParam String username){
        boolean exists = useS.existeNombre(username);
        return ResponseEntity.ok(exists);
    }

    @GetMapping("/detalle")
    public UsuarioDto infoUsuario(@RequestParam String username){
        ModelMapper m = new ModelMapper();
        UsuarioDto dto = m.map(useS.infoUsuario(username),UsuarioDto.class);
        return dto;
    }

    @PostMapping("/")
    public void CREATE(@RequestBody UsuarioDto usuarioDto, @RequestParam String rol) {
        ModelMapper m = new ModelMapper();
        Usuario u = m.map(usuarioDto, Usuario.class);
        String encodedPassword = passwordEncoder.encode(u.getPassword());
        u.setPassword(encodedPassword);

        int userId=useS.insertAndGetId(u);
        useS.insRol(rol,userId);
        if ("PASEADOR".equals(rol)) {
            useS.insPas(userId);
        }
    }
}
