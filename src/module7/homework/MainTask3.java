package module7.homework;

import java.util.*;

public class MainTask3 {
    public static void main(String[] args) {

        User user1 = new User(10001, "Ann", "Clarks", "Boston", 2300);
        User user2 = new User(20002, "Jack", "Danials", "Bostong", 5900);
        User user3 = new User(30003, "John", "Jameson", "Boston", 6400);
        User user4 = new User(40004, "Sergey", "Petrov", "Kiev", 1200);
        User user5 = new User(50005, "Ivan", "Orlov", "Kiev", 4300);
        User user6 = new User(60006, "Cutty", "Sark", "London", 8600);
        User user7 = new User(70007, "John", "Walker", "London", 9000);
        User user8 = new User(80008, "Radostyn", "Klinkov", "London", 10200);
        User user9 = new User(9009, "Olga", "Volkova", "London", 3400);
        User user10 = new User(10010, "Ivan", "Belenko", "Kiev", 7500);

        Order order1 = new Order(111101, 230, Currency.USD, "ItemC", "C-Shop", user1);
        Order order2 = new Order(111101, 230, Currency.USD, "ItemC", "C-Shop", user1);
        Order order3 = new Order(333303, 650, Currency.USD, "ItemE", "E-Shop", user3);
        Order order4 = new Order(444404, 110, Currency.UAH, "ItemD", "D-Shop", user4);
        Order order5 = new Order(555505, 470, Currency.UAH, "ItemA", "A-Shop", user5);
        Order order6 = new Order(666606, 2200, Currency.USD, "ItemF", "F-Shop", user6);
        Order order7 = new Order(777707, 1600, Currency.USD, "Item3", "Shop7", user7);
        Order order8 = new Order(888808, 3300, Currency.USD, "Item8", "Shop8", user8);
        Order order9 = new Order(999909, 50, Currency.UAH, "Item3", "Shop3", user9);
        Order order10 = new Order(101001, 50, Currency.UAH, "Item1", "Shop1", user10);

        Set<Order> ordersSet = new TreeSet<>(new Comparator<Order>() {
            @Override
            public int compare(Order o1, Order o2) {
                return o1.getUser().getBalance() - o2.getUser().getBalance();
            }
        });

        ordersSet.add(order1);
        ordersSet.add(order2);
        ordersSet.add(order3);
        ordersSet.add(order4);
        ordersSet.add(order5);
        ordersSet.add(order6);
        ordersSet.add(order7);
        ordersSet.add(order8);
        ordersSet.add(order9);
        ordersSet.add(order10);

        //System.out.println(ordersSet);

        for (Order order : ordersSet) {
            if (order.getUser().getLastName().equals("Petrov")) {
                System.out.println("Petrov: " + order);
            }
        }

        System.out.println(getHighestPrice(ordersSet));

        Iterator<Order> iterator = ordersSet.iterator();
        while (iterator.hasNext()){
            if (iterator.next().getCurrency() == Currency.USD){
                iterator.remove();
            }
        }
        System.out.println(ordersSet);
    }

    private static Order getHighestPrice(Set<Order> ordersSet) {
        Order order = null;
        Iterator<Order> iterator = ordersSet.iterator();
        while (iterator.hasNext()) {
            order = iterator.next();
        }
        return order;
    }




}
