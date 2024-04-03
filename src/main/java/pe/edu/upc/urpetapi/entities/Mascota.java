package pe.edu.upc.urpetapi.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Mascota")
public class Mascota {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int MascotaId;
    @Column(name = "MascotaNombre", nullable = false, length = 20)
    private String MacotaNombre;
    @Column(name = "MascotaFoto", nullable = false)
    private String MascotaFoto;
    @Column(name = "MascotaEstado", nullable = false, length = 20)
    private String MascotaEstado;

    public Mascota() {
    }

    public Mascota(int mascotaId, String macotaNombre, String mascotaFoto, String mascotaEstado) {
        MascotaId = mascotaId;
        MacotaNombre = macotaNombre;
        MascotaFoto = mascotaFoto;
        MascotaEstado = mascotaEstado;
    }


}
