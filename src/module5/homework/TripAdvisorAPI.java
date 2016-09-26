package module5.homework;

import java.util.Date;

public class TripAdvisorAPI implements API{

    private Room[] rooms = new Room[5];

    public TripAdvisorAPI(){
        Room room1 = new Room(101, 350, 2, new Date(20160909), "TAHotel1", "Berlin");
        rooms[0] = room1;
        Room room2 = new Room(202, 440, 2, new Date(20160908), "TAHotel2", "Praha");
        rooms[1] = room2;
        Room room3 = new Room(303, 800, 3, new Date(20160909), "TAHotel3", "Kyiv");
        rooms[2] = room3;
        Room room4 = new Room(404, 150, 1, new Date(20160911), "TAHotel4", "Plzen");
        rooms[3] = room4;
        Room room5 = new Room(505, 280, 2, new Date(20160910), "TAHotel5", "Minsk");
        rooms[4] = room5;
    }

    @Override
    public Room[] findRoms(int price, int persons, String city, String hotel) {
        int j = 0;
        Room[] findRooms = new Room[j];

        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i].getPrice() == price && rooms[i].getPersons() == persons
                    && rooms[i].getCityName() == city && rooms[i].getHotelName() == hotel) {
                findRooms[j] = rooms[i];
                j++;
            }
        }
        return findRooms;
    }

    public TripAdvisorAPI(Room[] rooms) {
        this.rooms = rooms;
    }
}
