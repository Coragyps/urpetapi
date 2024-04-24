package pe.edu.upc.urpetapi.servicesinterfaces;

import org.springframework.data.repository.query.Param;
import pe.edu.upc.urpetapi.dtos.BoletaDto;

import java.time.LocalDate;
import java.util.List;

public interface iBoletaService {

    public List<BoletaDto> BoletasFechas(LocalDate fechaA, LocalDate fechaB);
}
