package pe.edu.upc.urpetapi.servicesinterfaces;

import org.springframework.data.repository.query.Param;
import pe.edu.upc.urpetapi.dtos.BoletaDto;
import pe.edu.upc.urpetapi.entities.Boleta;

import java.time.LocalDate;
import java.util.List;

public interface iBoletaService {
    public void RegistrarBoleta(Boleta boleta);//---------------------------HU34: Registrar Boleta

    public List<BoletaDto> BoletasFechas(LocalDate fechaA, LocalDate fechaB);//---------------------------HU06: Revisar Boletas por Año

    public List<BoletaDto> IngresoTotal();//---------------------------HU19: Revisar Ingreso Total

    public List<BoletaDto> BoletasPorUsuario(String usename);//---------------------------HU33: Revisar Boletas
}
