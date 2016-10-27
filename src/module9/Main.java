package module9;

import java.util.*;


public class Main {

    public static void main(String[] args) {

        User user1 = new User(1001, "Ann", "Clarks", "Boston", 2300);
        User user2 = new User(2002, "Jack", "Danials", "Bostong", 5900);
        User user3 = new User(3003, "John", "Jameson", "Boston", 6400);
        User user4 = new User(4004, "Sergey", "Petrov", "Kiev", 1200);
        User user5 = new User(5005, "Ivan", "Orlov", "Kiev", 4300);
        User user6 = new User(6006, "Cutty", "Sark", "London", 8600);
        User user7 = new User(7007, "John", "Walker", "London", 9000);
        User user8 = new User(8008, "Radostyn", "Klinkov", "London", 10200);
        User user9 = new User(9009, "Olga", "Volkova", "London", 3400);
        User user10 = new User(1010, "Ivan", "Belenko", "Kiev", 7500);

        Order order1 = new Order(11111, 230, Currency.USD, "ItemC", "C-Shop", user1);
        Order order2 = new Order(11111, 230, Currency.USD, "ItemC", "C-Shop", user2);
        Order order3 = new Order(33333, 650, Currency.USD, "ItemE", "E-Shop", user3);
        Order order4 = new Order(44444, 110, Currency.UAH, "ItemD", "D-Shop", user4);
        Order order5 = new Order(55555, 470, Currency.UAH, "ItemA", "A-Shop", user5);
        Order order6 = new Order(66666, 2200, Currency.USD, "ItemF", "F-Shop", user6);
        Order order7 = new Order(77777, 1600, Currency.USD, "Item3", "Shop7", user7);
        Order order8 = new Order(88888, 3300, Currency.USD, "Item8", "Shop8", user8);
        Order order9 = new Order(99999, 50, Currency.UAH, "Item3", "Shop3", user9);
        Order order10 = new Order(10101, 50, Currency.UAH, "Item1", "Shop1", user10);


        List<Order> listOfOrders = new ArrayList<>();

        listOfOrders.add(order1);
        listOfOrders.add(order2);
        listOfOrders.add(order3);
        listOfOrders.add(order4);
        listOfOrders.add(order5);
        listOfOrders.add(order6);
        listOfOrders.add(order7);
        listOfOrders.add(order8);
        listOfOrders.add(order9);
        listOfOrders.add(order10);

        Controller controller = new Controller();

        //listOfOrders.stream().forEach(System.out::println);

        //controller.sortPriceDecrease(listOfOrders);
        System.out.println(controller.sortPriceDecrease(listOfOrders));
        //controller.sortPriceIncreaseAndUserCity(listOfOrders);
        System.out.println(controller.sortItemNameAndShopAndCity(listOfOrders));
        //controller.sortItemNameAndShopAndCity(listOfOrders);
        System.out.println(controller.deleteDuplicates(listOfOrders));
        //controller.deleteDuplicates(listOfOrders);
        System.out.println(controller.listWithoutSomePrice(listOfOrders));
        //controller.listWithoutSomePrice(listOfOrders);
        System.out.println(controller.separateListByCurrency(listOfOrders));
        //controller.separateListByCurrency(listOfOrders);
        System.out.println(controller.separateByCities(listOfOrders));
        //controller.separateByCities(listOfOrders);
        controller.checkListContainUser(listOfOrders, "Petrov");
        System.out.println(controller.deleteUSDorders(listOfOrders));
        //controller.deleteUSDorders(listOfOrders);

    }
}



