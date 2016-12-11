package moduleEE2.src.main;

import moduleEE2.src.main.controller.Command;
import moduleEE2.src.main.controller.DeveloperCommand;
import moduleEE2.src.main.controller.ProjectCommand;
import moduleEE2.src.main.dao.ConnectDAO;
import moduleEE2.src.main.view.ConsoleHelper;

import java.io.IOException;
import java.sql.SQLException;

public class ProgramRun {
    public static void main(String[] args) throws IOException, SQLException, ClassNotFoundException {
        ConnectDAO.ConnectDB();
        Command command = null;
        int commandNumber;
        ConsoleHelper.writeMessage("Вас приветствует система CRUD!");

        while (true) {
            ConsoleHelper.writeMessage("\nВыберите раздел: 1 - Разработчики | 3 - Проекты | 4 - Выход из системы");
            commandNumber = ConsoleHelper.readInt();
            switch (commandNumber) {
                case 1:
                    command = new DeveloperCommand();
                    command.execute();
                    break;
                /*case 2:
                    command = new TeamCommand();
                    command.execute();
                    break;*/
                case 3:
                    command = new ProjectCommand();
                    command.execute();
                    break;
                case 4:
                    ConnectDAO.closeConnect();
                    return;
                default:
                    break;
            }

        }
    }
}
