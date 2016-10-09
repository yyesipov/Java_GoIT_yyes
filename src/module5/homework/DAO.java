package module5.homework;

public interface DAO {

    Room save(Room room);

    boolean delete(Room room);

    Room update(Room room);

    Room findByld(long id);
}
