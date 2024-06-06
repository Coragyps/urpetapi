package pe.edu.upc.urpetapi.services;

import pe.edu.upc.urpetapi.entities.Mascota;

import java.util.List;

public interface iMascotaService {
    public void insert(Mascota mascota);
    public void delete(int id);
    public List<Mascota> list();
    public Mascota listId(int id);
}
