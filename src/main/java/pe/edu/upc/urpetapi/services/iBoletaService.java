package pe.edu.upc.urpetapi.services;

import pe.edu.upc.urpetapi.entities.Boleta;

import java.util.List;

public interface iBoletaService {
    public void insert(Boleta boleta);
    public void delete(int id);
    public List<Boleta> list();
    public Boleta listId(int id);
}
