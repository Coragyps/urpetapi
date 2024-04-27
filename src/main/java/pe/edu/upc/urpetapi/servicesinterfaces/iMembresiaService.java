package pe.edu.upc.urpetapi.servicesinterfaces;

import pe.edu.upc.urpetapi.entities.Membresia;

import java.util.List;

public interface iMembresiaService {
    public List<Membresia> MembresiaPorUsuario(String username);//---------------------------HU23: Revisar Historial de Membresías

    public void ComprarMembresia(Membresia membresia);//---------------------------HU24: Comprar Membresía

    public List<Membresia> MembresiasActivas();//---------------------------HU12: Revisar Membresias Activas

    public void Cancelar(int id);//---------------------------HU25: Cancelar Membresia
}
