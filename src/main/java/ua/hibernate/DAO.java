package ua.hibernate;

public interface DAO<T> {

    void showAll();

    T findById(int id);

    void save(T t);

    void update(T t);

    void deleteById(int id);
}
