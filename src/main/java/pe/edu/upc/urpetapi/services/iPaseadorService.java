package pe.edu.upc.urpetapi.services;

import pe.edu.upc.urpetapi.entities.Paseador;

import java.util.List;

public interface iPaseadorService {
    public void insert(Paseador paseador);
    public void delete(int id);
    public List<Paseador> list();
    public Paseador listId(int id);
}
