package module5.homework;

import java.util.Date;

public class BookingComAPI implements API {
    private Room[] rooms = new Room[5];

    public BookingComAPI() {
        Room room1 = new Room(100, 250, 1, new Date(20160912), "BCHotel1", "Rimini");
        rooms[0] = room1;
        Room room2 = new Room(200, 640, 2, new Date(20160914), "BCHotel2", "Dubai");
        rooms[1] = room2;
        Room room3 = new Room(300, 400, 2, new Date(20160915), "BCHotel3", "Dubrovnik");
        rooms[2] = room3;
        Room room4 = new Room(400, 180, 1, new Date(20160913), "BCHotel4", "Warsaw");
        rooms[3] = room4;
        Room room5 = new Room(500, 480, 2, new Date(201609111), "BCHotel5", "Amsterdam");
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

    public BookingComAPI(Room[] rooms) {
        this.rooms = rooms;
    }
}
