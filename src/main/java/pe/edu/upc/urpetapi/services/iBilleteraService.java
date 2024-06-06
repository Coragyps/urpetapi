package pe.edu.upc.urpetapi.services;

import pe.edu.upc.urpetapi.entities.Billetera;

import java.util.List;

public interface iBilleteraService {
    public void insert(Billetera billetera);
    public void delete(int id);
    public List<Billetera> list();
    public Billetera listId(int id);
}
