package module6;

public class UserUtils {


    public static User[] uniqueUsrers(User[] users) {
        int counter = 0;
        User[] compareUsers = new User[users.length];
        for (int i = 0; i < users.length; i++) {
            for (int j = i + 1; j < users.length; j++) {
                if (users[i] != null) {
                    if (users[i].equals(users[j])) {
                        users[j] = null;
                    } else {
                        compareUsers[i] = users[i];
                    }
                }
            }
        }
        for (User user : compareUsers) {
            if (user == null) {
                counter++;
            }
        }
        User[] uniqueUsers = new User[users.length - counter];
        int i = 0;
        int j = 0;
        for (User user : compareUsers) {
            if (user != null) {
                uniqueUsers[j] = compareUsers[i];
                j++;
                i++;
            } else i++;
        }
        return uniqueUsers;
    }


    public static User[] usersWithContitionalBalance(User[] users, int balance) {
        int counter = 0;
        for (User user : users) {
            if (user != null) {
                if (user.getBalance() == balance) {
                    counter++;
                }
            }
        }
        User[] userWithConditionalBalance = new User[counter];
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null) {
                if (users[i].getBalance() == balance) {
                    int j = 0;
                    userWithConditionalBalance[j] = users[i];
                    j++;
                }
            }
        }
        return userWithConditionalBalance;
    }

    public static final User[] paySalaryToUsers(User[] users) {
        User[] paySalaryToUsers = new User[users.length];
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null) {
                users[i].setBalance(users[i].getBalance() + users[i].getSalary());
                paySalaryToUsers[i] = users[i];
            }
        }
        return paySalaryToUsers;
    }

    public static final long[] getUsersId(User[] users) {
        long[] getUsersId = new long[users.length];
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null) {
                getUsersId[i] = users[i].getId();
            }
        }
        return getUsersId;
    }

    public static User[] deleteEmptyUser(User[] users) {
        int counter = 0;
        for (User user : users) {
            if (user != null) {
                counter++;
            }
        }
        User[] deleteEmptyUser = new User[counter];
        int i = 0;
        for (int j = 0; j < users.length; j++) {
            if (users[j] != null) {
                deleteEmptyUser[i] = users[j];
                i++;
            }
        }
        return deleteEmptyUser;
    }
}





