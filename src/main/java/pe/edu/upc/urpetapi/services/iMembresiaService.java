package pe.edu.upc.urpetapi.services;

import pe.edu.upc.urpetapi.entities.Membresia;

import java.util.List;

public interface iMembresiaService {
    public void insert(Membresia membresia);
    public void delete(int id);
    public List<Membresia> list();
    public Membresia listId(int id);
}
