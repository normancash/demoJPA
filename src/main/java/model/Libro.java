package model;


import jakarta.persistence.*;

@Entity
@Table(name="Libro")
@NamedQueries({
        @NamedQuery(name="Libro.All",query="select e from Libro e")
})
public class Libro {
    @Id
    private Integer Id ;
    private String nombre;
    private String descripcion;


    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    @Override
    public String toString() {
        return "Libro{" +
                "Id=" + Id +
                ", nombre='" + nombre + '\'' +
                '}';
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
