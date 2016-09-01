package module2;

public class Task2 {

    static double withdrawBalance(double balance, double withdrawal, double comission) {
        return balance - withdrawal - comission;
    }

    public static void main(String[] args) {

        double balance = 100;
        double withdrawal = 10;
        double comission = withdrawal * 0.05;

        double afterBalance = withdrawBalance(balance, withdrawal, comission);

        if (afterBalance >= 0) {
            System.out.println("Ok  " + comission + "  " + afterBalance);
        } else {
            System.out.println("No");
        }

    }
}