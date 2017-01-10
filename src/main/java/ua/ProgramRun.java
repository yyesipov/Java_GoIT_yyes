package ua;

import ua.controller.*;
import ua.hibernate.HibernateUtil;
import ua.view.ConsoleHelper;

import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;

public class ProgramRun {

    public static void main(String[] args) throws IOException, SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException, ParseException {

               Command command;
        int commandNumber;

        ConsoleHelper.writeMessage("\nВас приветствует система CRUD!");

        while (true) {
            ConsoleHelper.writeMessage("\n==============================================================" +
                    "===================================================================================" +
                    "\nВыберите раздел:" + "\n1 - Разработчики | 2 - Проекты | 3 - Компании " +
                    "| 4 - Заказчики | 5 - Навыки | 6 - Выход из системы");
            commandNumber = ConsoleHelper.readInt();
            switch (commandNumber) {
                case 1:
                    command = new DeveloperCommand();
                    command.execute();
                    break;
                case 2:
                    command = new ProjectCommand();
                    command.execute();
                    break;
                case 3:
                    command = new CompanyCommand();
                    command.execute();
                    break;
                case 4:
                    command = new CustomerCommand();
                    command.execute();
                    break;
                case 5:
                    command = new SkillCommand();
                    command.execute();
                    break;
                case 6:
                    HibernateUtil.getSessionFactory().close();
                    return;
                default:
                    break;
            }
        }
    }
}
