package pe.edu.upc.urpetapi.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.urpetapi.dtos.BoletaDto;
import pe.edu.upc.urpetapi.repositories.iBoletaRepository;
import pe.edu.upc.urpetapi.servicesinterfaces.iBoletaService;

import java.time.LocalDate;
import java.util.List;

@Service
public class BoletaServiceImplement implements iBoletaService {
    @Autowired
    private iBoletaRepository bolR;

    @Override
    public List<BoletaDto> BoletasFechas(LocalDate fechaA, LocalDate fechaB) {
        return bolR.BoletasFechas(fechaA, fechaB);
    }
}
