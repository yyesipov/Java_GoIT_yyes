package module8;

import java.util.ArrayList;
import java.util.List;

public class AbstractDAOImpl<T> implements AbstractDAO<T> {
    List<T> emulatorDB = new ArrayList<>();

    @Override
    public T save(T t) {
        emulatorDB.add(t);
        return null;
    }

    @Override
    public void delete(T t) {
        emulatorDB.remove(t);
        System.out.println("Element " + t + " is deleted from the DB");
    }

    @Override
    public void deleteAll(List<T> list) {
        emulatorDB.removeAll(list);
        System.out.println("All the elements of the list are deleted from the DB");
    }

    @Override
    public void saveAll(List<T> list) {
        emulatorDB.addAll(list);
        System.out.println("All the elements of the list are added to the DB");
    }

    @Override
    public List<T> getList() {
        return emulatorDB;
    }

    @Override
    public void deleteById(long id) {
    }

    @Override
    public T get(long id) {
        return null;
    }
}
