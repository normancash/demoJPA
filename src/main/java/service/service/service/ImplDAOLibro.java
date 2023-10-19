package service.service.service;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import service.EntityManagerAdmin;
import service.service.IDAOLibro;

import java.util.List;

public class ImplDAOLibro implements IDAOLibro {

    @Override
    public <T> List<T> getAll(String nameQuery, Class clazz) {
        EntityManager em = EntityManagerAdmin.getInstance();
        TypedQuery<T> query = em.createNamedQuery(nameQuery,clazz);
        return query.getResultList();
    }

    @Override
    public <T> void insert(T entity) {
        EntityManager em = EntityManagerAdmin.getInstance();
        em.getTransaction().begin();
        em.persist(entity);
        em.flush();
        em.getTransaction().commit();
    }
}
