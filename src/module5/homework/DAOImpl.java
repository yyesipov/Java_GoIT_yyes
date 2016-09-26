package module5.homework;

public class DAOImpl implements DAO {
    @Override
    public Room save(Room room) {
        System.out.println(room.toString() + "saved");
        return room;
    }

    @Override
    public boolean delete(Room room) {
        boolean res = false;
        if (res == true) {
            System.out.println(room.toString() + "deleted");
        } else {
            res = false;
        }
        return res;
    }

    @Override
    public Room update(Room room) {
        System.out.println(room.toString() + "updated");
        return room;
    }

    @Override
    public Room findByld(long id) {
        Room room = new Room( id, 0, 0, null, null, null);
        System.out.println(room.toString() + "found");
        return null;
    }
}
