package model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue(value="ADM")
public class PersonalAdministrativo extends Visita{

    private String carnet;

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public PersonalAdministrativo(Integer id, String primerNombre, String carnet) {
        super(id, primerNombre);
        this.carnet = carnet;
    }

    public PersonalAdministrativo(String carnet) {
        this.carnet = carnet;
    }
}
