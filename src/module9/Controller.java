package module9;

import java.util.*;
import java.util.function.Function;

public class Controller {

    protected static void sortPriceDecrease(List<Order> listOfOrders) {
        listOfOrders.stream()
                .sorted((a, b) -> b.compareTo(a))
                .forEach(System.out::println);
    }

    protected static void sortPriceIncreaseAndUserCity(List<Order> listOfOrders) {
        listOfOrders.stream()
                .sorted((a, b) -> {
                    int res = a.compareTo(b);
                    if (res != 0) {
                        return res;
                    } else
                        return a.getUser().getCity().compareTo(b.getUser().getCity());
                })
                .forEach(System.out::println);
    }

    protected static void sortItemNameAndShopAndCity(List<Order> listOfOrders) {
        listOfOrders.stream()
                .sorted((a, b) -> {
                    int res = a.compareTo(b);
                    if (res != 0) {
                        return res;
                    } else {
                        res = a.getShopIdentificator().compareTo(b.getShopIdentificator());
                        if (res != 0) {
                            return res;
                        } else {
                            return a.getUser().getCity().compareTo(b.getUser().getCity());
                        }
                    }
                })
                .forEach(System.out::println);
    }

    protected static void deleteDuplicates(List<Order> listOfOrders) {
        Set<Order> listWithoutDupl = new HashSet<>(listOfOrders);
        listWithoutDupl.stream().forEach(System.out::println);
    }

    protected static void listWithoutSomePrice(List<Order> listOfOrders) {
        List<Order> resList = new ArrayList<>();
        listOfOrders.stream().forEach(s -> {
            if (s.getPrice() > 1500) {
                resList.add(s);
            }
        });
        resList.stream().forEach(System.out::println);
    }

    protected static void separateListByCurrency(List<Order> listOfOrders) {
        List<Order> listUAH = new ArrayList<>();
        List<Order> listUSD = new ArrayList<>();
        listOfOrders.stream().forEach(s -> {
            if (s.getCurrency() == Currency.UAH) {
                listUAH.add(s);
            } else {
                listUSD.add(s);
            }
        });
        listUAH.stream().forEach(System.out::println);
        listUSD.stream().forEach(System.out::println);
    }

    protected static void  separateByCities(List<Order> listOfOrders) {
        Map<String, List<Order>> res = new HashMap<>();
        Function<Order, String> getCity = s -> s.getUser().getCity();
        listOfOrders.stream().forEach(s -> {
            if (!res.containsKey(getCity.apply(s))) {
                res.put(getCity.apply(s), new ArrayList<Order>());
            }
            res.get(getCity.apply(s)).add(s);
        });
        System.out.println(res);
    }

    protected static void checkListContainUser (List<Order> listOfOrders, String lastName){
        System.out.println(listOfOrders.stream()
                .anyMatch(s -> s.getUser().getLastName().equals(lastName)));

    }

    protected static void deleteUSDorders(List<Order> listOfOrders){
        List<Order> result = new ArrayList<>();
        listOfOrders.stream().forEach(s -> {
            if (s.getCurrency() != Currency.USD) {
                result.add(s);
            }
        });
        result.stream().forEach(System.out::println);
    }
}



