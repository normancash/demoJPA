package model;

import jakarta.persistence.*;

@Entity
@DiscriminatorColumn(name="tipo")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Visita {
    @Id
    private Integer id;

    public Visita(Integer id, String primerNombre) {
        this.id = id;
        this.primerNombre = primerNombre;
    }

    private String primerNombre;

    public Visita() {

    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }


}
