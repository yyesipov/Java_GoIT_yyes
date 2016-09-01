package module2;

public class Task1 {

    static int sumInt(int[] balances) {
        int sum = 0;
        for (int balance : balances) {
            sum += balance;
        }
        return sum;

    }

    static double sumDouble(double[] balances1) {
        double sum2 = 0;
        for (double balance : balances1) {
            sum2 += balance;
        }
        return sum2;
    }

    static int minInt(int[] balances) {
        int min = balances[0];
        for (int i = 0; i < balances.length; i++) {
            if (min > balances[i]) {
                min = balances[i];
            }
        }
        return min;
    }

    static double minDouble(double[] balances1) {
        double min2 = balances1[0];
        for (int i = 0; i < balances1.length; i++) {
            if (min2 > balances1[i]) {
                min2 = balances1[i];
            }
        }
        return min2;
    }

    static int maxInt(int[] balances) {
        int max = balances[0];
        for (int i = 1; i < balances.length; i++) {
            if (max < balances[i]) {
                max = balances[i];
            }
        }
        return max;
    }

    static double maxDouble(double[] balances1) {
        double max1 = balances1[0];
        for (int i = 1; i < balances1.length; i++) {
            if (max1 < balances1[i]) {
                max1 = balances1[i];
            }
        }
        return max1;
    }

    static long multiplicInt(int[] balances) {
        long multiplication = 1;
        for (int balance : balances) {
            multiplication = balance * multiplication;
        }
        return multiplication;
    }

    static double multiplicDouble(double[] balances1) {
        double multiplication1 = 1;
        for (double balance : balances1) {
            multiplication1 *= balance;
        }
        return multiplication1;
    }

    static int maxPositiveInt(int[] balances) {
        int maxPositive = balances[0];
        for (int i = 1; i < balances.length; i++) {
            if (balances[i] > 0 && maxPositive < balances[i]) {
                maxPositive = balances[i];
            }
        }
        return maxPositive;
    }

    static double maxPositiveDouble(double[] balances1) {
        double maxPositive1 = balances1[0];
        for (int i = 1; i < balances1.length; i++) {
            if (balances1[i] > 0 && maxPositive1 < balances1[i]) {
                maxPositive1 = balances1[i];
            }
        }
        return maxPositive1;
    }

    static int modulusInt(int[] balances) {
        int mod;
        mod = balances[0] % balances[balances.length - 1];
        return mod;
    }

    static double modulusDouble(double[] balances1) {
        double mod1;
        mod1 = balances1[0] % balances1[balances1.length - 1];
        return mod1;
    }

    static int secondLargestInt(int[] balances) {
        int firstLargest = balances[0];
        int secondLargest = balances[0];
        for (int i = 1; i < balances.length; i++) {
            if (balances[i] > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = balances[i];
            } else if (balances[i] > secondLargest) {
                secondLargest = balances[i];
            }
        }
        return secondLargest;
    }

    static double secondLargestDouble(double[] balances1) {
        double firstLargest1 = balances1[0];
        double secondLargest1 = balances1[0];
        for (int i = 1; i < balances1.length; i++) {
            if (balances1[i] > firstLargest1) {
                secondLargest1 = firstLargest1;
                firstLargest1 = balances1[i];
            } else if (balances1[i] > secondLargest1) {
                secondLargest1 = balances1[i];
            }
        }
        return secondLargest1;
    }


    public static void main(String[] args) {
        int[] balances = {1000, 560, 700, 7600, 40, 350, 31300, 2400, 10, 900};
        double[] balances1 = {85.0, 460.5, 3400.65, 235.0, 4560.7, 1345.4, 564.6, 6900.0, 3350.5, 67.7};
        int sum = sumInt(balances);
        double sum1 = sumDouble(balances1);
        int min = minInt(balances);
        double min2 = minDouble(balances1);
        int max = maxInt(balances);
        double max1 = maxDouble(balances1);
        long multiplication = multiplicInt(balances);
        double multiplication1 = multiplicDouble(balances1);
        int maxPositive = maxPositiveInt(balances);
        double maxPositive1 = maxPositiveDouble(balances1);
        int mod = modulusInt(balances);
        double mod1 = modulusDouble(balances1);
        int secondLargest = secondLargestInt(balances);
        double secondLargest1 = secondLargestDouble(balances1);
        System.out.println("Сумма int балансов равна " + sum);
        System.out.println("Сумма double балансов равна " + sum1);
        System.out.println("Минимальный int баланс равен " + min);
        System.out.println("Мнимальный double баланс равен " + min2);
        System.out.println("Максимальный int баланс равен " + max);
        System.out.println("Максимальный double баланс равен " + max1);
        System.out.println("Multiplication int балансов равно " + multiplication);
        System.out.println("Multiplication double балансов равно " + multiplication1);
        System.out.println("Максимальный положительный баланс int равен " + maxPositive);
        System.out.println("Максимальный положительный баланс double равен " + maxPositive1);
        System.out.println("Модуль первого и последнего балансов int равен " + mod);
        System.out.println("Модуль первого и последнего балансов double равен " + mod1);
        System.out.println("Второй наибольший  баланс int равен " + secondLargest);
        System.out.println("Второй наибольший  баланс double равен " + secondLargest1);


    }

}



