package module2;

public class Test2 {

    static double getOwnerNames(int[] balances, String[] names, String ownerName, double withdrawal, double comission) {

        int j = 0;
        for (int k = 0; k < names.length; k++) {
            if (names[k] == ownerName) {
                j = k + 1;
            }
        }
        return j;

    }

    public static void main(String[] args) {

        int[] balances = {1200, 250, 2000, 500, 3200};
        String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};

        String ownerName = "Oww";
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

