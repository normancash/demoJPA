package model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

import java.util.List;

@Entity
public class Perfil {
    @Id
    private Integer id;

    private String nombre;

    @ManyToMany(mappedBy = "listPerfil")
    private List<Usuario> listUsuario;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Usuario> getListUsuario() {
        return listUsuario;
    }

    public void setListUsuario(List<Usuario> listUsuario) {
        this.listUsuario = listUsuario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Perfil() {
    }
}
