package module5.homework;

import java.util.Date;

public class GoogleAPI implements API {

    private Room[] rooms = new Room[5];

    public GoogleAPI() {
        Room room1 = new Room(111, 200, 2, new Date(20160909), "GHotel1", "Lviv");
        rooms[0] = room1;
        Room room2 = new Room(222, 240, 2, new Date(20160905), "GHotel2", "Lviv");
        rooms[1] = room2;
        Room room3 = new Room(333, 200, 2, new Date(20160908), "KyivHotel", "Kyiv");
        rooms[2] = room3;
        Room room4 = new Room(444, 350, 1, new Date(20160907), "GHotel4", "Kharkiv");
        rooms[3] = room4;
        Room room5 = new Room(555, 250, 2, new Date(20160913), "GHotel5", "Munich");
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

    public GoogleAPI(Room[] rooms) {
        this.rooms = rooms;
    }

    @Override
    public Room[] getAllRooms() {
        return rooms;
    }
}
