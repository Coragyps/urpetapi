package pe.edu.upc.urpetapi.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.urpetapi.dtos.BoletaDto;
import pe.edu.upc.urpetapi.entities.Boleta;
import pe.edu.upc.urpetapi.repositories.iBoletaRepository;
import pe.edu.upc.urpetapi.servicesinterfaces.iBoletaService;

import java.time.LocalDate;
import java.util.List;

@Service
public class BoletaServiceImplement implements iBoletaService {
    @Autowired
    private iBoletaRepository bolR;

    @Override//---------------------------HU34: Registrar Boleta
    public void RegistrarBoleta(Boleta boleta) {
        bolR.save(boleta);
    }

    @Override//---------------------------HU06: Revisar Boletas por Año
    public List<BoletaDto> BoletasFechas(LocalDate fechaA, LocalDate fechaB) {
        return bolR.BoletasFechas(fechaA, fechaB);
    }

    @Override//---------------------------HU19: Revisar Ingreso Total
    public List<BoletaDto> IngresoTotal() {
        return bolR.IngresoTotal();
    }

    @Override//---------------------------HU33: Revisar Boletas
    public List<BoletaDto> BoletasPorUsuario(String usename) {
        return bolR.BoletasPorUsuario(usename);
    }
}
