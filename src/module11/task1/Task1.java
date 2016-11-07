package module11.task1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Task1 {
    public static void main(String[] args)  {

        Map<String, String> map = new HashMap<>();
        map.put("testword", "_________");

        System.out.println(replacer(map, "src/module11/task1/testTask1.txt"));
    }

    public static String replacer(Map<String, String> map, String filePath) {

        String res = "";

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String currentLine;
            while ((currentLine = br.readLine()) != null) {
                String key = new ArrayList<>(map.keySet()).get(0);
                if (currentLine.contains(key)) {
                    currentLine = currentLine.replaceAll(key, map.get(key));
                }
                res = res + currentLine + System.getProperty("line.separator");
            }

        } catch (IOException e) {
            System.err.println("Error reading file!");
        }

        return res;
    }
}
