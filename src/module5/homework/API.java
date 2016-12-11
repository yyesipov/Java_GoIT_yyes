package module5.homework;

import java.util.List;

public interface API {

    List<Room> findRoms(int price, int persons, String city, String hotel);

    List<Room> getAllRooms();
}
