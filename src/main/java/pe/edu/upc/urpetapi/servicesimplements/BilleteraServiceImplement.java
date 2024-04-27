package pe.edu.upc.urpetapi.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.urpetapi.entities.Billetera;
import pe.edu.upc.urpetapi.repositories.iBilleteraRepository;
import pe.edu.upc.urpetapi.servicesinterfaces.iBilleteraService;

import java.util.List;

@Service
public class BilleteraServiceImplement implements iBilleteraService {
    @Autowired
    private iBilleteraRepository bilR;

    @Override//---------------------------HU21: Revisar Monto de la Billetera Virtual
    public List<Billetera> BilleteraPorUsuario(String username) {
        return bilR.BilleteraPorUsuario(username);
    }

    @Override//---------------------------HU32: Registar Billetera Virtual
    public void RegistrarBilletera(Billetera billetera) {
        bilR.save(billetera);
    }

    @Override//---------------------------HU22: Recargar Billetera Virtual
    public void RecargarBilleter(Integer id, double cantidad) {
        bilR.RecargarBilleter(id, cantidad);
    }

    @Override//---------------------------HU13: Pagar con Billetera Virtual
    public void UsarBilleter(Integer id, double cantidad) {
        bilR.UsarBilleter(id, cantidad);
    }
}
