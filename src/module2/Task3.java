package module2;

public class Task3 {

    static double getOwnerNames(int[] balances, String[] names, String ownerName, double withdrawal, double comission) {

        double result = 0;
        int j = 0;
        for (int i = 0; i < names.length; i++) {
            if (names[i] == ownerName) {
                j = i;
            }
            int balance = balances[j];
            result = balance - withdrawal - comission;
        }
        return result;
    }

    public static void main(String[] args) {

        int[] balances = {1200, 250, 2000, 500, 3200};
        String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};
        String ownerName = "Ann";
        double withdrawal = 100;
        double comission = withdrawal * 0.05;

        double afterBalance = getOwnerNames(balances, ownerNames, ownerName, withdrawal, comission);

        if (afterBalance >= 0) {
            System.out.println(ownerName + "  " + withdrawal + "  " + afterBalance);
        } else {
            System.out.println("No");
        }


    }
}