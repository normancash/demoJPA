package model;

import jakarta.persistence.*;

@Entity
public class Estudiante {

    @Id
    private Integer id;
    private String nombre;

    @OneToOne(cascade= CascadeType.ALL,mappedBy = "estudiante")
    @JoinColumn(name="direccion_id",referencedColumnName = "id")
    private Direccion direccion;

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public Estudiante() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
