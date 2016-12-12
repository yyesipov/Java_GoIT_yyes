package moduleEE2.main;


import moduleEE2.main.controller.*;
import moduleEE2.main.dao.ConnectDAO;
import moduleEE2.main.view.ConsoleHelper;

import java.io.IOException;
import java.sql.SQLException;

public class ProgramRun {
    public static void main(String[] args) throws IOException, SQLException, ClassNotFoundException {
        ConnectDAO.ConnectDB();
        Command command = null;
        int commandNumber;
        ConsoleHelper.writeMessage("Вас приветствует система CRUD!");

        while (true) {
            ConsoleHelper.writeMessage("\nВыберите раздел: 1 - Разработчики | 2 - Проекты | 3 - Компании " +
            "| 4 - Заказчики | 5 - Навыки | 6 - Добавить/удалить навыки разработчикам | 7 - Выход из системы");
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
                    command = new DeveloperSkillCommand();
                    command.execute();
                    break;
                case 7:
                    ConnectDAO.closeConnect();
                    return;
                default:
                    break;
            }
        }
    }
}
