package GamingShop.core.abstracts;

import java.util.List;

public interface BaseDaoI<T> {
    void add(T entity);
    void update(T entity);
    void delete(T entity);
    void deleteById(int id);
    T getById(int id);
    List<T> getAll();
}
