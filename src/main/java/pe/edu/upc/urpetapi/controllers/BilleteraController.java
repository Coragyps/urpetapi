package pe.edu.upc.urpetapi.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.urpetapi.dtos.BilleteraDto;
import pe.edu.upc.urpetapi.entities.Billetera;
import pe.edu.upc.urpetapi.services.iBilleteraService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/billetera")
public class BilleteraController {
    @Autowired
    private iBilleteraService bilS;

    @PostMapping
    public void CREATE(@RequestBody BilleteraDto billeteraDto) {
        ModelMapper m = new ModelMapper();
        Billetera u = m.map(billeteraDto, Billetera.class);
        bilS.insert(u);
    }

    @GetMapping
    public List<BilleteraDto> READ(){
        return bilS.list().stream().map(y->{
            ModelMapper m=new ModelMapper();
            return m.map(y,BilleteraDto.class);
        }).collect(Collectors.toList());
    }

    @PutMapping
    public void UPDATE(@RequestBody BilleteraDto billeteraDto) {
        ModelMapper m = new ModelMapper();
        Billetera u = m.map(billeteraDto, Billetera.class);
        bilS.insert(u);
    }

    @DeleteMapping("/{id}")
    public void DELETE(@PathVariable("id") Integer id) {
        bilS.delete(id);
    }

    @GetMapping("/{id}")
    public BilleteraDto READID(@PathVariable("id") Integer id){
        ModelMapper m = new ModelMapper();
        BilleteraDto dto = m.map(bilS.listId(id),BilleteraDto.class);
        return dto;
    }
}


