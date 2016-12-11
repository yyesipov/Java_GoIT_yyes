package module9;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Controller {


    public List<Order> sortPriceDecrease(List<Order> listOfOrders) {
        List<Order> spd = listOfOrders.stream()
                .sorted((a, b) -> b.compareTo(a))
                .collect(Collectors.toList());
        //spd.stream().forEach(System.out::println);
        return spd;
    }


    public List<Order> sortPriceIncreaseAndUserCity(List<Order> listOfOrders) {
        List<Order> spi = listOfOrders.stream()
                .sorted((a, b) -> {
                    int res = a.compareTo(b);
                    if (res != 0) {
                        return res;
                    } else
                        return a.getUser().getCity().compareTo(b.getUser().getCity());
                })
                .collect(Collectors.toList());
        //spi.stream().forEach(System.out::println);
        return spi;
    }


    public List<Order> sortItemNameAndShopAndCity(List<Order> listOfOrders) {
        List<Order> sin = listOfOrders.stream()
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
                .collect(Collectors.toList());
        //sin.stream().forEach(System.out::println);
        return sin;
    }

    public Set<Order> deleteDuplicates(List<Order> listOfOrders) {
        Set<Order> listWithoutDupl = new HashSet<>(listOfOrders);
        //listWithoutDupl.stream().forEach(System.out::println);
        return listWithoutDupl;
    }

    public List<Order> listWithoutSomePrice(List<Order> listOfOrders) {
        List<Order> resList = new ArrayList<>();
        listOfOrders.stream().forEach(s -> {
            if (s.getPrice() > 1500) {
                resList.add(s);
            }
        });
        //resList.stream().forEach(System.out::println);
        return resList;
    }

    public List<Order> separateListByCurrency(List<Order> listOfOrders) {
        List<Order> listUAH = new ArrayList<>();
        List<Order> listUSD = new ArrayList<>();
        listOfOrders.stream().forEach(s -> {
            if (s.getCurrency() == Currency.UAH) {
                listUAH.add(s);
            } else {
                listUSD.add(s);
            }
        });
        List<Order> listRes = new ArrayList<>();
        listRes.addAll(listUAH);
        listRes.addAll(listUSD);
        //listUAH.stream().forEach(System.out::println);
        //listUSD.stream().forEach(System.out::println);
        return listRes;
    }


    public Map<String, List<Order>> separateByCities(List<Order> listOfOrders) {
        Map<String, List<Order>> res = new HashMap<>();
        Function<Order, String> getCity = s -> s.getUser().getCity();
        listOfOrders.stream().forEach(s -> {
            if (!res.containsKey(getCity.apply(s))) {
                res.put(getCity.apply(s), new ArrayList<Order>());
            }
            res.get(getCity.apply(s)).add(s);
        });
        //System.out.println(res);
        return res;
    }

    public void checkListContainUser(List<Order> listOfOrders, String lastName) {
        boolean resOfCheck = listOfOrders.stream()
                .anyMatch(s -> s.getUser().getLastName().equals(lastName));
        if (resOfCheck == true) {
            System.out.println("User " + lastName + " is found");
        } else {
            System.out.println("User " + lastName + " not found");
        }
    }

    public List<Order> deleteUSDorders(List<Order> listOfOrders) {
        List<Order> result = new ArrayList<>();
        listOfOrders.stream().forEach(s -> {
            if (s.getCurrency() != Currency.USD) {
                result.add(s);
            }
        });
        //result.stream().forEach(System.out::println);
        return result;
    }
}



