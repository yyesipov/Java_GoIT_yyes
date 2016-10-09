package module7.homework;

import com.sun.org.apache.xpath.internal.SourceTree;
import com.sun.org.apache.xpath.internal.operations.Or;

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
        Order order2 = new Order(11111, 230, Currency.USD, "ItemC", "C-Shop", user1);
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

        //System.out.println(listOfOrders);

        Comparator<Order> comparePriceDecrease = new Comparator<Order>() {
            @Override
            public int compare(Order o1, Order o2) {
                return o2.getPrice() - o1.getPrice();
            }
        };

        Comparator<User> compareUserCity = new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.getCity().compareTo(o2.getCity());
            }
        };

        Comparator<Order> comparePriceIncrease = new Comparator<Order>() {
            @Override
            public int compare(Order o1, Order o2) {
                if (o1.getPrice() != o2.getPrice()) {
                    return o1.getPrice() - o2.getPrice();
                } else {
                    return compareUserCity.compare(o1.getUser(), o2.getUser());
                }

            }
        };

        Comparator<Order> compareItemName = new Comparator<Order>() {
            @Override
            public int compare(Order o1, Order o2) {
                if (!o1.getItemName().equals(o2.getItemName())) {
                    return o1.getItemName().compareTo(o2.getItemName());
                } else {
                    if (!o1.getShopIdentificator().equals(o2.getShopIdentificator())) {
                        return o1.getShopIdentificator().compareTo(o2.getShopIdentificator());
                    } else {
                        return compareUserCity.compare(o1.getUser(), o2.getUser());
                    }
                }

            }

        };

        listOfOrders.sort(comparePriceDecrease);
        System.out.println(listOfOrders);

        listOfOrders.sort(comparePriceIncrease);
        System.out.println(listOfOrders);

        listOfOrders.sort(compareItemName);
        System.out.println(listOfOrders);

        Set<Order> listWithoutDupl = new HashSet<>();
        for (Order order : listOfOrders) {
            listWithoutDupl.add(order);
        }
        listOfOrders.clear();
        listOfOrders.addAll(listWithoutDupl);
        System.out.println(listOfOrders);

        List<Order> listWithoutSomePrice = new ArrayList<>();
        for (Order order : listOfOrders){
            if (order.getPrice() > 1500) {
                listWithoutSomePrice.add(order);
            }
        }
        System.out.println(listWithoutSomePrice);

        List<Order> listUSD = new ArrayList<>();
        List<Order> listUAH = new ArrayList<>();
        for (Order order : listOfOrders) {
            if (order.getCurrency() == Currency.USD) {
                listUSD.add(order);
            } else {
                listUAH.add(order);
            }
        }
        System.out.println(listUSD);
        System.out.println(listUAH);

        Set<String> uniqCities = new HashSet<>();
        for (Order order : listOfOrders) {
            uniqCities.add(order.getUser().getCity());
        }
        System.out.println(uniqCities);

        List<ArrayList<Order>> listOfLists = new ArrayList<>();
        ArrayList<Order> cityList = new ArrayList<>();

        for (String city : uniqCities) {
            for (Order order : listOfOrders) {
                if ((order.getUser().getCity()).equals(city)) {
                    cityList.add(order);
                }
            }
        }
        listOfLists.add(cityList);
        System.out.println(listOfLists);

    }
}





