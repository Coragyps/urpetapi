package pe.edu.upc.urpetapi.services;

import pe.edu.upc.urpetapi.entities.Rol;

import java.util.List;

public interface iRolService {
    public void insert(Rol rol);
    public void delete(int id);
    public List<Rol> list();
    public Rol listId(int id);
}
