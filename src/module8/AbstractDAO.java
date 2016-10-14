package module8;

import java.util.List;

public interface AbstractDAO<T> {

    T save(T t);

    void delete(T t);

    void deleteAll(List<T> list);

    void saveAll(List<T> list);

    List<T> getList();
}
