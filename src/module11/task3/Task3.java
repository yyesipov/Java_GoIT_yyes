package module11.task3;

import module11.task1.Task1;

import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Task3 {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("testword", "Ok!");
        System.out.println(fileContentMerger(map, "src/module11/task3/testTask3.txt"));
    }

    public static File fileContentMerger(Map<String, String> map, String filePath) {

        String newString = Task1.replacer(map, filePath);

        try (FileWriter fw = new FileWriter(filePath, true);
             BufferedWriter bw = new BufferedWriter(fw);
             PrintWriter pw = new PrintWriter(bw)) {

            pw.println(newString);

        } catch (IOException e) {
            System.err.println(Arrays.toString(e.getStackTrace()));
        }

        return new File(filePath);
    }
}
