package module5.homework;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BookingComAPI implements API {
    private List<Room> rooms = new ArrayList<>();

    public BookingComAPI() {
        Room room1 = new Room(100, 250, 1, new Date(20160912), "BCHotel1", "Rimini");
        Room room2 = new Room(200, 440, 2, new Date(20160914), "PrahaHotel", "Praha");
        Room room3 = new Room(300, 400, 2, new Date(20160915), "BCHotel3", "Dubrovnik");
        Room room4 = new Room(400, 180, 1, new Date(20160913), "BCHotel4", "Warsaw");
        Room room5 = new Room(500, 480, 2, new Date(201609111), "BCHotel5", "Amsterdam");

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

    public BookingComAPI(List<Room> rooms) {
        this.rooms = rooms;
    }

    @Override
    public List<Room> getAllRooms() {
        return rooms;
    }
}
