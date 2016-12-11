package module5.homework;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TripAdvisorAPI implements API {

    private List<Room> rooms = new ArrayList<>();

    public TripAdvisorAPI() {
        Room room1 = new Room(101, 350, 1, new Date(20160909), "BerlinHotel", "Berlin");
        Room room2 = new Room(202, 440, 2, new Date(20160908), "PrahaHotel", "Praha");
        Room room3 = new Room(303, 200, 2, new Date(20160909), "KyivHotel", "Kyiv");
        Room room4 = new Room(404, 150, 1, new Date(20160911), "TAHotel4", "Plzen");
        Room room5 = new Room(505, 280, 2, new Date(20160910), "TAHotel5", "Minsk");

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

    public TripAdvisorAPI(List<Room> rooms) {
        this.rooms = rooms;
    }

    @Override
    public List<Room> getAllRooms() {
        return rooms;
    }
}
