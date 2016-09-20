package module5.homework;

import java.util.Date;

public class TripAdvisorAPI implements API{

    private Room[] rooms = new Room[5];

    public TripAdvisorAPI(){
        Room room1 = new Room(101, 350, 1, new Date(20160909), "BerlinHotel", "Berlin");
        rooms[0] = room1;
        Room room2 = new Room(202, 440, 2, new Date(20160908), "PrahaHotel", "Praha");
        rooms[1] = room2;
        Room room3 = new Room(303, 200, 2, new Date(20160909), "KyivHotel", "Kyiv");
        rooms[2] = room3;
        Room room4 = new Room(404, 150, 1, new Date(20160911), "TAHotel4", "Plzen");
        rooms[3] = room4;
        Room room5 = new Room(505, 280, 2, new Date(20160910), "TAHotel5", "Minsk");
        rooms[4] = room5;
    }

    @Override
    public Room[] findRoms(int price, int persons, String city, String hotel) {
        int j = 0;
        Room[] findRoomsArr = new Room[1000];

        for (int i = 0; i < rooms.length; i++) {
            if ((rooms[i].getPrice() == price) && (rooms[i].getPersons() == persons) && (rooms[i].getCityName().equals(city)) && (rooms[i].getHotelName().equals(hotel))) {
                findRoomsArr[j] = rooms[i];
                j++;
            }
        }

        Room[] findRooms = new Room[j];
        for (int i = 0; i < j; i++){
            findRooms[i] = findRoomsArr[i];
        }
        return findRooms;
    }

    public TripAdvisorAPI(Room[] rooms) {
        this.rooms = rooms;
    }

    @Override
    public Room[] getAllRooms() {
        return rooms;
    }
}
