package module6;


import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        User[] users = new User[7];

        User user1 = new User(1010101, "Jack", "Daniels", 3000, 5000);
        users[0] = user1;
        User user2 = null;
        users[1] = user2;
        User user3 = new User(3030303, "Johh", "Walker", 5500, 7500);
        users[2] = user3;
        User user4 = new User(4040404, "John", "Jameson", 6000, 10000);
        users[3] = user4;
        User user5 = new User(5050505, "Katty", "Sark", 4000, 8000);
        users[4] = user5;
        User user6 = null;
        users[5] = user6;
        User user7 = new User(4040404, "John", "Jameson", 6000, 10000);
        users[6] = user7;

        System.out.println("Unuque users: " + Arrays.toString(UserUtils.uniqueUsrers(users)));
        System.out.println("User whith contitional balance: " + Arrays.toString(UserUtils.usersWithContitionalBalance(users, 8000)));
        System.out.println("Pay salary to users: " + Arrays.toString(UserUtils.paySalaryToUsers(users)));
        System.out.println("Get users ID: " + Arrays.toString(UserUtils.getUsersId(users)));
        System.out.println("Delete empty user: " + Arrays.toString(UserUtils.deleteEmptyUser(users)));
    }

}
