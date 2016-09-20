package module5.homework;

import java.util.Arrays;

public class Controller {

    private API apis[] = new API[3];

    public Controller(API[] apis) {
        this.apis = apis;
    }

    public Controller() {
        BookingComAPI bookingComAPI = new BookingComAPI();
        apis[0] = bookingComAPI;
        GoogleAPI googleAPI = new GoogleAPI();
        apis[1] = googleAPI;
        TripAdvisorAPI tripAdvisorAPI = new TripAdvisorAPI();
        apis[2] = tripAdvisorAPI;

    }

    public Room[] requestRooms(int price, int persons, String city, String hotel) {

        Room[] roomsArray = new Room[1000];
        int j = 0;
        for (int i = 0; i < apis.length; i++) {
            for (Room room : apis[i].findRoms(price, persons, city, hotel)) {
                roomsArray[j] = room;
                j++;
            }
        }

        Room[] requestRooms = new Room[j];
        for (int i = 0; i < j; i++) {
            requestRooms[i] = roomsArray[i];
        }
        System.out.println("\n" + Arrays.toString(requestRooms));

        DAOImpl daoImpl = new DAOImpl();
        for (Room room : requestRooms) {
            daoImpl.save(room);
        }

        return requestRooms;
    }

    public Room[] check(API api1, API api2) {

        Room[] rooms1 = api1.getAllRooms();
        Room[] rooms2 = api2.getAllRooms();
        Room[] roomsEqual = new Room[300];

        int roomsCount = 0;
        for (int i = 0; i < rooms1.length; i++) {
            for (int j = 0; j < rooms2.length; j++) {
                if (rooms1[i].equals(rooms2[j])) {
                    roomsEqual[roomsCount] = rooms1[i];
                    roomsCount++;
                }
            }
        }

        Room[] checkArray = new Room[roomsCount];

        for (int i = 0; i < roomsCount; i++) {
            checkArray[i] = roomsEqual[i];
        }
        System.out.println("\n" + Arrays.toString(checkArray));
        return checkArray;
    }
}

