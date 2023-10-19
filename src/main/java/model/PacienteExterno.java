package model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue(value="EXT")
public class PacienteExterno extends Visita{

    private String cedula;

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public PacienteExterno(Integer id, String primerNombre, String cedula) {
        super(id, primerNombre);
        this.cedula = cedula;
    }

    public PacienteExterno(String cedula) {
        this.cedula = cedula;
    }
}
