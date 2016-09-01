package module2;

public class Task4 {

    static double fundBalance(int[] balances, String[] names, String ownerName, double fund) {

        double result = 0;
        int j = 0;
        for (int i = 0; i < names.length; i++) {
            if (names[i] == ownerName) {
                j = i;
            }
            int balance = balances[j];
            result = balance + fund;
        }
        return result;
    }

    public static void main(String[] args) {

        int[] balances = {1200, 250, 2000, 500, 3200};
        String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};
        String ownerName = "Oww";
        double fund = 100;


        double afterBalance = fundBalance(balances, ownerNames, ownerName, fund);

        if (afterBalance >= 0) {
            System.out.println(ownerName + "  " + afterBalance);
        }
    }
}
