package module5.homework;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GoogleAPI implements API {

    private List<Room> rooms = new ArrayList<>();

    public GoogleAPI() {
        Room room1 = new Room(111, 200, 2, new Date(20160909), "GHotel1", "Lviv");
        Room room2 = new Room(222, 240, 2, new Date(20160905), "GHotel2", "Lviv");
        Room room3 = new Room(333, 200, 2, new Date(20160908), "KyivHotel", "Kyiv");
        Room room4 = new Room(444, 350, 1, new Date(20160907), "GHotel4", "Kharkiv");
        Room room5 = new Room(555, 250, 2, new Date(20160913), "GHotel5", "Munich");

        rooms.add(room1);
        rooms.add(room2);
        rooms.add(room3);
        rooms.add(room4);
        rooms.add(room5);
    }

    @Override
    public List<Room> findRoms(int price, int persons, String city, String hotel) {
        List<Room> findRooms = new ArrayList<>();
        for (Room room : rooms) {
            if ((room.getPrice() == price) && (room.getPersons() == persons) && (room.getCityName().equals(city)) && (room.getHotelName().equals(hotel))) {
                findRooms.add(room);
            }
        }
        return findRooms;
    }

    public GoogleAPI(List<Room> rooms) {
        this.rooms = rooms;
    }

    @Override
    public List<Room> getAllRooms() {
        return rooms;
    }
}
