package module2.homework;

import module6.ArraysUtils;

import java.util.Arrays;

public class Task1 {

    static double sumDouble(double[] balances1) {
        double sum2 = 0;
        for (double balance : balances1) {
            sum2 += balance;
        }
        return sum2;
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

    static double maxDouble(double[] balances1) {
        double max1 = balances1[0];
        for (int i = 1; i < balances1.length; i++) {
            if (max1 < balances1[i]) {
                max1 = balances1[i];
            }
        }
        return max1;
    }


    static double multiplicDouble(double[] balances1) {
        double multiplication1 = 1;
        for (double balance : balances1) {
            multiplication1 *= balance;
        }
        return multiplication1;
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


    static double modulusDouble(double[] balances1) {
        double mod1;
        mod1 = balances1[0] % balances1[balances1.length - 1];
        return mod1;
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
        int[] balances = {1000, 561, 700, 7603, 40, 350, 31307, 2400, 13, 900};
        double[] balances1 = {85.0, 460.5, 3400.65, 235.0, 4560.7, 1345.4, 564.6, 6900.0, 3350.5, 67.7};
        double sum1 = sumDouble(balances1);
        double min2 = minDouble(balances1);
        double max1 = maxDouble(balances1);
        double multiplication1 = multiplicDouble(balances1);
        double maxPositive1 = maxPositiveDouble(balances1);
        double mod1 = modulusDouble(balances1);
        double secondLargest1 = secondLargestDouble(balances1);

        System.out.println("Сумма int балансов равна: " + ArraysUtils.sum(balances));
        System.out.println("Сумма double балансов равна: " + sum1);
        System.out.println("Минимальный int баланс равен: " + ArraysUtils.min(balances));
        System.out.println("Мнимальный double баланс равен: " + min2);
        System.out.println("Максимальный int баланс равен: " + ArraysUtils.max(balances));
        System.out.println("Максимальный double баланс равен: " + max1);
        System.out.println("Multiplication int балансов равно: " + ArraysUtils.multiplication(balances));
        System.out.println("Multiplication double балансов равно: " + multiplication1);
        System.out.println("Максимальный положительный баланс int равен: " + ArraysUtils.maxPositive(balances));
        System.out.println("Максимальный положительный баланс double равен: " + maxPositive1);
        System.out.println("Модуль первого и последнего балансов int равен: " + ArraysUtils.modulus(balances));
        System.out.println("Модуль первого и последнего балансов double равен: " + mod1);
        System.out.println("Второй наибольший  баланс int равен: " + ArraysUtils.secondLargest(balances));
        System.out.println("Второй наибольший  баланс double равен: " + secondLargest1);
        System.out.println("Реверс:  " + Arrays.toString(ArraysUtils.reverse(balances)));
        System.out.println("Четные элементы массива:  " + Arrays.toString(ArraysUtils.findEvenElements(balances)));

    }
}





