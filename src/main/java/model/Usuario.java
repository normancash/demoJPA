package model;


import jakarta.persistence.*;

import java.util.List;

@Entity
public class Usuario {
    @Id
    private Integer id;

    private String nombre;

    public List<Perfil> getListPerfil() {
        return listPerfil;
    }

    public void setListPerfil(List<Perfil> listPerfil) {
        this.listPerfil = listPerfil;
    }

    @ManyToMany
    @JoinTable(name="UsuarioPerfil",
            joinColumns = @JoinColumn(name="usuario_id")
            ,inverseJoinColumns = @JoinColumn(name="perfil_id"))
    private List<Perfil> listPerfil;

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



    public Usuario() {
    }


}
