package pe.edu.upc.urpetapi.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.urpetapi.dtos.ListarPaseadoresDto;
import pe.edu.upc.urpetapi.dtos.PaseadorDto;
import pe.edu.upc.urpetapi.entities.Paseador;
import pe.edu.upc.urpetapi.servicesinterfaces.iPaseadorService;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/paseador")
public class PaseadorController {
    @Autowired
    private iPaseadorService pasS;

    @GetMapping("/listar")//---------------------------HU09: Revisar Paseadores Disponibles
    @PreAuthorize("hasAuthority('ADMIN') || hasAuthority('CLIENTE')")
    public List<ListarPaseadoresDto> ListarPaseadores(){
        List<String[]> filaLista = pasS.ListarPaseadores();
        List<ListarPaseadoresDto> dtoLista = new ArrayList<>();

        for (String[] columna : filaLista) {
            ListarPaseadoresDto dto = new ListarPaseadoresDto();
            dto.setUsuarioNombre(columna[0]);
            dto.setUsuarioTelefono(columna[1]);
            dto.setUsuarioCorreo(columna[2]);
            dto.setUsuarioFoto(columna[3]);

            dto.setPaseadorId(Integer.parseInt(columna[4]));
            dto.setPaseadorDescripcion(columna[5]);
            dto.setPaseadorEdad(LocalDate.parse(columna[6]));
            dto.setPaseadorEstado(columna[7]);

            dto.setPaseadorFacebook(columna[8]);
            dto.setPaseadorHoraFin(LocalTime.parse(columna[9]));
            dto.setPaseadorHoraInicio(LocalTime.parse(columna[10]));
            dto.setPaseadorInstagram(columna[11]);

            dto.setPaseadorLatitud(Double.parseDouble(columna[12]));
            dto.setPaseadorLongitud(Double.parseDouble(columna[13]));
            dto.setPaseadorPrecio(Double.parseDouble(columna[14]));
            dto.setPaseadorSlogan(columna[15]);

            dto.setPaseadorValidado(Boolean.parseBoolean(columna[16]));
            dtoLista.add(dto);
        }
        return dtoLista;
    };

    @GetMapping("/tarifa")//---------------------------HU10: Tarifa mas Accesible
    @PreAuthorize("hasAuthority('ADMIN') || hasAuthority('CLIENTE')")
    public List<ListarPaseadoresDto> MenorPrecio(){
        List<String[]> filaLista = pasS.PaseadorMasBarato();
        List<ListarPaseadoresDto> dtoLista = new ArrayList<>();

        for (String[] columna : filaLista) {
            ListarPaseadoresDto dto = new ListarPaseadoresDto();
            dto.setUsuarioNombre(columna[0]);
            dto.setUsuarioTelefono(columna[1]);
            dto.setUsuarioCorreo(columna[2]);
            dto.setUsuarioFoto(columna[3]);

            dto.setPaseadorId(Integer.parseInt(columna[4]));
            dto.setPaseadorDescripcion(columna[5]);
            dto.setPaseadorEdad(LocalDate.parse(columna[6]));
            dto.setPaseadorEstado(columna[7]);

            dto.setPaseadorFacebook(columna[8]);
            dto.setPaseadorHoraFin(LocalTime.parse(columna[9]));
            dto.setPaseadorHoraInicio(LocalTime.parse(columna[10]));
            dto.setPaseadorInstagram(columna[11]);

            dto.setPaseadorLatitud(Double.parseDouble(columna[12]));
            dto.setPaseadorLongitud(Double.parseDouble(columna[13]));
            dto.setPaseadorPrecio(Double.parseDouble(columna[14]));
            dto.setPaseadorSlogan(columna[15]);

            dto.setPaseadorValidado(Boolean.parseBoolean(columna[16]));
            dtoLista.add(dto);
        }
        return dtoLista;
    };

    @GetMapping("/info")//---------------------------HU27: Revisar Perfil
    @PreAuthorize("hasAuthority('ADMIN') || hasAuthority('PASEADOR')")
    public List<ListarPaseadoresDto> InfoPaseador(@RequestParam int id){
        List<String[]> filaLista = pasS.InfoPaseador(id);
        List<ListarPaseadoresDto> dtoLista = new ArrayList<>();

        for (String[] columna : filaLista) {
            ListarPaseadoresDto dto = new ListarPaseadoresDto();
            dto.setUsuarioNombre(columna[0]);
            dto.setUsuarioTelefono(columna[1]);
            dto.setUsuarioCorreo(columna[2]);
            dto.setUsuarioFoto(columna[3]);

            dto.setPaseadorId(Integer.parseInt(columna[4]));
            dto.setPaseadorDescripcion(columna[5]);
            dto.setPaseadorEdad(LocalDate.parse(columna[6]));
            dto.setPaseadorEstado(columna[7]);

            dto.setPaseadorFacebook(columna[8]);
            dto.setPaseadorHoraFin(LocalTime.parse(columna[9]));
            dto.setPaseadorHoraInicio(LocalTime.parse(columna[10]));
            dto.setPaseadorInstagram(columna[11]);

            dto.setPaseadorLatitud(Double.parseDouble(columna[12]));
            dto.setPaseadorLongitud(Double.parseDouble(columna[13]));
            dto.setPaseadorPrecio(Double.parseDouble(columna[14]));
            dto.setPaseadorSlogan(columna[15]);

            dto.setPaseadorValidado(Boolean.parseBoolean(columna[16]));
            dtoLista.add(dto);
        }
        return dtoLista;
    };

    @PostMapping("/registrar")//---------------------------HU18: Registrarse en la Aplicacion
    public void Registrar(@RequestBody PaseadorDto paseadorDto) {
        ModelMapper m = new ModelMapper();
        Paseador u = m.map(paseadorDto, Paseador.class);
        pasS.Registrar(u);
    }

    @PutMapping("/modificar")//---------------------------HU01: Modificar Cuenta
    public void Modificar(@RequestBody PaseadorDto paseadorDto) {
        ModelMapper m = new ModelMapper();
        Paseador u = m.map(paseadorDto, Paseador.class);
        pasS.Registrar(u);
    }

}
