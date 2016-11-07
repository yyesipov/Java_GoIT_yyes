package module11.task4;

import module11.task1.Task1;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class Task4 {

    public static void main(String[] args) {

        System.out.println(checkWord1("testword", "src/module11/task4/testTask4.txt"));
        System.out.println(checkWord2("testword", "src/module11/task4/testTask4.txt"));
        System.out.println(checkWord3("testword", "src/module11/task4/testTask4.txt"));
    }

    public static int checkWord1(String word, String filePath) {

        Map<String, String> map = new HashMap<>();
        map.put("", "");
        String string = Task1.replacer(map, filePath);
        int count = 0;
        for (String str : string.split(" ")) {
            if (str.contains(word)) {
                count++;
            }
        }
        return count;
    }

    public static int checkWord2(String word, String filePath) {

        int count = 0;
        File file = new File(filePath);
        Scanner scanner = null;

        try {
            scanner = new Scanner(file);
            while (scanner.hasNext()) {
                if (scanner.next().equals(word)) {
                    count++;
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading file!");

        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
        return count;
    }

    public static int checkWord3(String word, String filePath) {

        int count = 0;
        File file = new File(filePath);

        try (Scanner scanner = new Scanner(file)){
            while (scanner.hasNext()) {
                if (scanner.next().equals(word)) {
                    count++;
                }
            }
        } catch(IOException e){
            System.err.println("Error reading file!");
        }
        return count;
    }
}

