package pe.edu.upc.urpetapi.servicesinterfaces;

import org.springframework.data.repository.query.Param;
import pe.edu.upc.urpetapi.entities.Billetera;

import java.util.List;

public interface iBilleteraService {
    public List<Billetera> BilleteraPorUsuario(String username);//---------------------------HU21: Revisar Monto de la Billetera Virtual

    public void RegistrarBilletera(Billetera billetera);//---------------------------HU32: Registar Billetera Virtual

    public void RecargarBilleter(Integer id, double cantidad);//---------------------------HU22: Recargar Billetera Virtual

    public void UsarBilleter(Integer id, double cantidad);//---------------------------HU13: Pagar con Billetera Virtual
}
