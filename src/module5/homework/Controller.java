package module5.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Controller {

    private List<API> apis = new ArrayList<>();

    public Controller(List<API> apis) {
        this.apis = apis;
    }

    public Controller() {
        BookingComAPI bookingComAPI = new BookingComAPI();
        GoogleAPI googleAPI = new GoogleAPI();
        TripAdvisorAPI tripAdvisorAPI = new TripAdvisorAPI();

        apis.add(bookingComAPI);
        apis.add(googleAPI);
        apis.add(tripAdvisorAPI);

    }

    public List<Room> requestRooms(int price, int persons, String city, String hotel) {

        List<Room> requestRooms = new ArrayList<>();


        for (API api : apis) {
            requestRooms.addAll(api.findRoms(price, persons, city, hotel));

        }
        System.out.println("\n" + requestRooms);

        DAOImpl daoImpl = new DAOImpl();
        for (Room room : requestRooms) {
            daoImpl.save(room);
        }

        return requestRooms;
    }

    public List<Room> check(API api1, API api2) {

        List<Room> checkArray = new ArrayList<>();
        for (Room roomOfAPI1 : api1.getAllRooms()) {
            for (Room roomOfAPI2 : api2.getAllRooms()) {
                if (roomOfAPI1.equals(roomOfAPI2)) {
                    checkArray.add(roomOfAPI1);
                }
            }
        }
        System.out.println("\n" + checkArray);
        return checkArray;
    }
}

