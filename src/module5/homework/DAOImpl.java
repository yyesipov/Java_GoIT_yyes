package module5.homework;

import java.util.Arrays;

public class DAOImpl implements DAO {
    @Override
    public Room save(Room room) {
        System.out.println("Room " + room.toString() + " saved to DB");
        return room;
    }



    @Override
    public boolean delete(Room room) {
        boolean res = false;
        if (res == true) {
            System.out.println("Room " + room.toString() + " deleted from DB");
        } else {
            res = false;
        }
        return res;
    }

    @Override
    public Room update(Room room) {
        System.out.println("Room " + room.toString() + " updated");
        return room;
    }

    @Override
    public Room findByld(long id) {
        Room room = new Room( id, 0, 0, null, null, null);
        System.out.println("Room " + room.toString() + " found by ID");
        return null;
    }
}
