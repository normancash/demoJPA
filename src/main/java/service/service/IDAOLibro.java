package service.service;

import java.util.List;

public interface IDAOLibro {

    <T> List<T> getAll(String nameQuery, Class clazz);

    <T> void insert(T entity);
}
