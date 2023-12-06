package repositories.interfaces;

import java.util.List;

public interface IRepository<T> {
    List<T> getAll();
    T get(int id);
    void create(T item);
    void update(T item);
    void delete(int id);
}
