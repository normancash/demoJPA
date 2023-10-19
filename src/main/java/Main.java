
import model.*;
import service.service.IDAOLibro;
import service.service.service.ImplDAOLibro;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void demoManyToMany(IDAOLibro service) {
        List<Perfil> perfiles = new ArrayList<>();
        Perfil perfil = new Perfil();
        perfil.setId(1);
        perfil.setNombre("Admin");
        service.insert(perfil);
        perfiles.add(perfil);
        Perfil perfil1 = new Perfil();
        perfil1.setId(2);
        perfil1.setNombre("Login");
        service.insert(perfil1);
        perfiles.add(perfil1);
        Usuario u = new Usuario();
        u.setId(1);
        u.setNombre("norman");
        u.setListPerfil(perfiles);
        service.insert(u);
    }

    public static void demoOneToOne(IDAOLibro service) {
        Estudiante estudiante = new Estudiante();
        estudiante.setId(1);
        estudiante.setNombre("Norman");
        Direccion direccion = new Direccion();
        direccion.setId(1);
        direccion.setNombre("Managua");
        estudiante.setDireccion(direccion);
        service.insert(estudiante);
    }

    public static void demoHerencia(IDAOLibro service) {
        Visita visita = new PacienteExterno(1,"Norman","91212230434");
        service.insert(visita);
    }


    public static void main(String[] args) {
        IDAOLibro service = new ImplDAOLibro();
        demoHerencia(service);
    }
}
