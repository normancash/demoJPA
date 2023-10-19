package model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue(value="EST")
public class VisitaEstudiante extends Visita{

    private String cif;

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public VisitaEstudiante(Integer id, String primerNombre, String cif) {
        super(id, primerNombre);
        this.cif = cif;
    }

    public VisitaEstudiante(String cif) {
        this.cif = cif;
    }
}
