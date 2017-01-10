package ua.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;


public class ConsoleHelper {
    public static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public static String writeMessage(String message) {
        System.out.println(message);
        return message;
    }

    public static String readString() throws IOException {
        return bufferedReader.readLine();
    }

    public static java.sql.Date readDate() throws IOException, ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd", Locale.ROOT);
        String dateStr = ConsoleHelper.readString();
        java.util.Date date = sdf.parse(dateStr);
        java.sql.Date dat_sql = new java.sql.Date(date.getTime());

        return dat_sql;
    }

    public static int readInt() throws IOException {
        int number = 0;
        try {
            number = Integer.parseInt(bufferedReader.readLine());
        } catch (NumberFormatException e) {
            ConsoleHelper.writeMessage("Введены некорректные данные. Повторите ввод.");
            readInt();
        }
        return number;
    }
}
