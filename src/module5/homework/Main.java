package module5.homework;


public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();

        controller.requestRooms(200, 2, "Kyiv", "KyivHotel");
        controller.requestRooms(440, 2, "Praha", "PrahaHotel");
        controller.requestRooms(350, 1, "Berlin", "BerlinHotel");


        controller.check(new GoogleAPI(), new TripAdvisorAPI());
        controller.check(new GoogleAPI(), new BookingComAPI());
        controller.check(new TripAdvisorAPI(), new BookingComAPI());
    }
}
