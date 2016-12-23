package moduleEE3.ProjectManagamentSystem.src.main.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;


public class ConsoleHelper {
    public static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public static String writeMessage(String message){
        System.out.println(message);
        return message;
    }

    public static String readString() throws IOException {
        return bufferedReader.readLine();
    }

    public static java.sql.Date readDate() throws IOException{
        java.sql.Date join = new java.sql.Date(Calendar.getInstance().getTimeInMillis());
        Boolean lock = true;
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy/MM/dd", Locale.ENGLISH);

        String command = ConsoleHelper.readString();
        if (command.equals("u")){
            while (lock) {
                String dateStr = ConsoleHelper.readString();
        try {
            join = (java.sql.Date) sdf1.parse(dateStr);
            lock = false;
        }catch (ParseException e) {
            ConsoleHelper.writeMessage("Введены некорректные данные. Повторите ввод.");
            readDate();
        }
            }
        }
        return join;
    }

    public static int readInt() throws IOException {
        int number = 0;
        try {
            number = Integer.parseInt(bufferedReader.readLine());
        }catch (NumberFormatException e){
            ConsoleHelper.writeMessage("Введены некорректные данные. Повторите ввод.");
            readInt();
        }
        return number;
    }
}
