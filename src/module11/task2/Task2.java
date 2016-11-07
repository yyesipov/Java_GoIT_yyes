package module11.task2;

import module11.task1.Task1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Task2 {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("Strirng replace  test", "___REPLACE____");
        System.out.println(fileContentReplacer(map, "src/module11/task2/testTask2.txt"));
    }

    public static String fileContentReplacer(Map<String, String> map, String filePath){
        String newStr = Task1.replacer(map, filePath);
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(new File(filePath)))){
            bw.write(newStr);

        }catch (IOException e){
            System.err.println("Error writing file!");
        }
        return newString;
    }
}

