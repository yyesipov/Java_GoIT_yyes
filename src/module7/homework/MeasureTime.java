package module7.homework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MeasureTime {
    public static void main(String[] args) {

        List<Integer> intList = new ArrayList<>();
        List<Integer> intLinkList = new LinkedList<>();

        List<String> strList = new ArrayList<>();
        List<String> strLinkList = new LinkedList<>();

        long start;
        long finish;

        int k = 1000;

        start = System.currentTimeMillis();
        for (int i = 0; i < k; i++){
            intList.add((int)(Math.random())*10000);
        }
        finish = System.currentTimeMillis();
        System.out.println("Time of adding " + k + " Integers to ArrayList is: " + (finish - start) + " ms");

        start = System.currentTimeMillis();
        for (int i = 0; i < k; i++){
            intLinkList.add((int)(Math.random())*10000);
        }
        finish = System.currentTimeMillis();
        System.out.println("Time of adding " + k + " Integers to LinkedList is: " + (finish - start) + " ms");

        start = System.currentTimeMillis();
        for (int i = 0; i < k; i++){
            strList.add("TestTimeTestTimeTestTimeTestTimeTestTimeTestTimeTestTimeTestTime");
        }
        finish = System.currentTimeMillis();
        System.out.println("Time of adding " + k + " Strings to ArrayList is: " + (finish - start) + " ms");

        start = System.currentTimeMillis();
        for (int i = 0; i < k; i++){
            strLinkList.add("TestTimeTestTimeTestTimeTestTimeTestTimeTestTimeTestTimeTestTime");
        }
        finish = System.currentTimeMillis();
        System.out.println("Time of adding " + k + " Strings to LinkedList is: " + (finish - start) + " ms");

        start = System.currentTimeMillis();
        for (int i = 0; i < k; i++){
            intList.set(33, (int)(Math.random())*10000);
        }
        finish = System.currentTimeMillis();
        System.out.println("Time of setting " + k + " Integers to ArrayList is: " + (finish - start) + " ms");

        start = System.currentTimeMillis();
        for (int i = 0; i < k; i++){
            intLinkList.set(33, (int)(Math.random())*10000);
        }
        finish = System.currentTimeMillis();
        System.out.println("Time of setting " + k + " Integers to LinkedList is: " + (finish - start) + " ms");

        start = System.currentTimeMillis();
        for (int i = 0; i < k; i++){
            strList.set(33, "TestTimeTestTimeTestTimeTestTimeTestTimeTestTimeTestTimeTestTime");
        }
        finish = System.currentTimeMillis();
        System.out.println("Time of setting " + k + " Strings to ArrayList is: " + (finish - start) + " ms");

        start = System.currentTimeMillis();
        for (int i = 0; i < k; i++){
            strLinkList.set(33, "TestTimeTestTimeTestTimeTestTimeTestTimeTestTimeTestTimeTestTime");
        }
        finish = System.currentTimeMillis();
        System.out.println("Time of setting " + k + " Strings to LinkedList is: " + (finish - start) + " ms");

        start = System.currentTimeMillis();
        for (int i = 0; i < k; i++){
            intList.get(33);
        }
        finish = System.currentTimeMillis();
        System.out.println("Time of getting " + k + " Integers from ArrayList is: " + (finish - start) + " ms");

        start = System.currentTimeMillis();
        for (int i = 0; i < k; i++){
            intLinkList.get(33);
        }
        finish = System.currentTimeMillis();
        System.out.println("Time of getting " + k + " Integers from LinkedList is: " + (finish - start) + " ms");

        start = System.currentTimeMillis();
        for (int i = 0; i < k; i++){
            strList.get(33);
        }
        finish = System.currentTimeMillis();
        System.out.println("Time of getting " + k + " Strings from ArrayList is: " + (finish - start) + " ms");

        start = System.currentTimeMillis();
        for (int i = 0; i < k; i++){
            strLinkList.get(33);
        }
        finish = System.currentTimeMillis();
        System.out.println("Time of getting " + k + " Strings from LinkedList is: " + (finish - start) + " ms");

        start = System.currentTimeMillis();
        for (int i = 0; i < k; i++){
            intList.remove(0);
        }
        finish = System.currentTimeMillis();
        System.out.println("Time of removing " + k + " Integers from ArrayList is: " + (finish - start) + " ms");

        start = System.currentTimeMillis();
        for (int i = 0; i < k; i++){
            intLinkList.remove(0);
        }
        finish = System.currentTimeMillis();
        System.out.println("Time of removing " + k + " Integers from LinkedList is: " + (finish - start) + " ms");

        start = System.currentTimeMillis();
        for (int i = 0; i < k; i++){
            strList.remove(0);
        }
        finish = System.currentTimeMillis();
        System.out.println("Time of removing " + k + " Strings from ArrayList is: " + (finish - start) + " ms");

        start = System.currentTimeMillis();
        for (int i = 0; i < k; i++){
            strLinkList.remove(0);
        }
        finish = System.currentTimeMillis();
        System.out.println("Time of removing " + k + " Strings from LinkedList is: " + (finish - start) + " ms");



         k = 10000;




        start = System.currentTimeMillis();
        for (int i = 0; i < k; i++){
            intList.add((int)(Math.random())*10000);
        }
        finish = System.currentTimeMillis();
        System.out.println("\n" + "Time of adding " + k + " Integers to ArrayList is: " + (finish - start) + " ms");

        start = System.currentTimeMillis();
        for (int i = 0; i < k; i++){
            intLinkList.add((int)(Math.random())*10000);
        }
        finish = System.currentTimeMillis();
        System.out.println("Time of adding " + k + " Integers to LinkedList is: " + (finish - start) + " ms");

        start = System.currentTimeMillis();
        for (int i = 0; i < k; i++){
            strList.add("TestTimeTestTimeTestTimeTestTimeTestTimeTestTimeTestTimeTestTime");
        }
        finish = System.currentTimeMillis();
        System.out.println("Time of adding " + k + " Strings to ArrayList is: " + (finish - start) + " ms");

        start = System.currentTimeMillis();
        for (int i = 0; i < k; i++){
            strLinkList.add("TestTimeTestTimeTestTimeTestTimeTestTimeTestTimeTestTimeTestTime");
        }
        finish = System.currentTimeMillis();
        System.out.println("Time of adding " + k + " Strings to LinkedList is: " + (finish - start) + " ms");

        start = System.currentTimeMillis();
        for (int i = 0; i < k; i++){
            intList.set(33, (int)(Math.random())*10000);
        }
        finish = System.currentTimeMillis();
        System.out.println("Time of setting " + k + " Integers to ArrayList is: " + (finish - start) + " ms");

        start = System.currentTimeMillis();
        for (int i = 0; i < k; i++){
            intLinkList.set(33, (int)(Math.random())*10000);
        }
        finish = System.currentTimeMillis();
        System.out.println("Time of setting " + k + " Integers to LinkedList is: " + (finish - start) + " ms");

        start = System.currentTimeMillis();
        for (int i = 0; i < k; i++){
            strList.set(33, "TestTimeTestTimeTestTimeTestTimeTestTimeTestTimeTestTimeTestTime");
        }
        finish = System.currentTimeMillis();
        System.out.println("Time of setting " + k + " Strings to ArrayList is: " + (finish - start) + " ms");

        start = System.currentTimeMillis();
        for (int i = 0; i < k; i++){
            strLinkList.set(33, "TestTimeTestTimeTestTimeTestTimeTestTimeTestTimeTestTimeTestTime");
        }
        finish = System.currentTimeMillis();
        System.out.println("Time of setting " + k + " Strings to LinkedList is: " + (finish - start) + " ms");

        start = System.currentTimeMillis();
        for (int i = 0; i < k; i++){
            intList.get(33);
        }
        finish = System.currentTimeMillis();
        System.out.println("Time of getting " + k + " Integers from ArrayList is: " + (finish - start) + " ms");

        start = System.currentTimeMillis();
        for (int i = 0; i < k; i++){
            intLinkList.get(33);
        }
        finish = System.currentTimeMillis();
        System.out.println("Time of getting " + k + " Integers from LinkedList is: " + (finish - start) + " ms");

        start = System.currentTimeMillis();
        for (int i = 0; i < k; i++){
            strList.get(33);
        }
        finish = System.currentTimeMillis();
        System.out.println("Time of getting " + k + " Strings from ArrayList is: " + (finish - start) + " ms");

        start = System.currentTimeMillis();
        for (int i = 0; i < k; i++){
            strLinkList.get(33);
        }
        finish = System.currentTimeMillis();
        System.out.println("Time of getting " + k + " Strings from LinkedList is: " + (finish - start) + " ms");

        start = System.currentTimeMillis();
        for (int i = 0; i < k; i++){
            intList.remove(0);
        }
        finish = System.currentTimeMillis();
        System.out.println("Time of removing " + k + " Integers from ArrayList is: " + (finish - start) + " ms");

        start = System.currentTimeMillis();
        for (int i = 0; i < k; i++){
            intLinkList.remove(0);
        }
        finish = System.currentTimeMillis();
        System.out.println("Time of removing " + k + " Integers from LinkedList is: " + (finish - start) + " ms");

        start = System.currentTimeMillis();
        for (int i = 0; i < k; i++){
            strList.remove(0);
        }
        finish = System.currentTimeMillis();
        System.out.println("Time of removing " + k + " Strings from ArrayList is: " + (finish - start) + " ms");

        start = System.currentTimeMillis();
        for (int i = 0; i < k; i++){
            strLinkList.remove(0);
        }
        finish = System.currentTimeMillis();
        System.out.println("Time of removing " + k + " Strings from LinkedList is: " + (finish - start) + " ms");

    }
}

