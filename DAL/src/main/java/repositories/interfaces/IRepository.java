package repositories.interfaces;

import java.util.List;

public interface IRepository<T> {
    List<T> getAll(Class<T> entityClass);
    T get(Class<T> entityClass, int id);
    void create(T item);
    void update(T item);
    void delete(T item);
}
