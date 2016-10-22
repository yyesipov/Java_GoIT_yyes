package module8;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        User user1 = new User(111, "UserOne");
        User user2 = new User(222, "UserTwo");
        User user3 = new User(333, "UserThree");
        User user4 = new User(444, "UserFour");
        User user5 = new User(555, "UserFive");
        User user6 = new User(666, "UserSix");
        User user7 = new User(777, "UserSeven");

        List<User> userList = new ArrayList<>();

        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        System.out.println("List of users: " + userList + "\n");

        UserDAO controller = new UserDAO();

        controller.saveUser(user4);
        controller.saveUser(user5);
        controller.saveUser(user6);
        controller.saveUser(user7);
        System.out.println("Users DB: " + controller.getList() + "\n" );

        controller.saveAllUser(userList);
        System.out.println(controller.getList() + "\n");

        controller.deleteAllUser(userList);
        System.out.println(controller.getList() + "\n");

        controller.deleteUser(user7);
        System.out.println(controller.getList() + "\n");

        System.out.println(controller.get(555) + "\n");

        controller.deleteById(666);
        System.out.println(controller.getList());
    }
}
