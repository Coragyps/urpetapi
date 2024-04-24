package pe.edu.upc.urpetapi.servicesinterfaces;
import pe.edu.upc.urpetapi.entities.Billetera;
import java.util.List;

public interface iBilleteraService {
    public List<Billetera> BilleteraPorUsuario(String username);
    public void RegistrarBilletera(Billetera billetera);
}
