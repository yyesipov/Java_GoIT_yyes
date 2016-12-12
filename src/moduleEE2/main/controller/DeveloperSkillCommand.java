package moduleEE2.main.controller;

import main.dao.DeveloperSkillDAO;

import main.factory.DevelopersSkillFactory;
import main.view.ConsoleHelper;

import java.io.IOException;
import java.sql.SQLException;

public class DeveloperSkillCommand implements Command {
    @Override
    public void execute() throws IOException, ClassNotFoundException, SQLException {
        DevelopersSkillFactory developerSkillFactory = new DevelopersSkillFactory();
        DeveloperSkillDAO developerSkillDAO = new DeveloperSkillDAO();

        int developerID;
        int skillID;


        ConsoleHelper.writeMessage("* * * ДОБАВИТЬ/УДАЛИТЬ НАВЫКИ РАЗРАБОТЧИКАМ * * *" + "\n" +
                "1 - Добавить | 2 - Удалить\n");
        int commandNumber = ConsoleHelper.readInt();


        switch (commandNumber) {
            case 1:
                ConsoleHelper.writeMessage("Укажите ID разработчика:\n");
                developerID = ConsoleHelper.readInt();
                ConsoleHelper.writeMessage("\nУкажите ID навыка:\n");
                skillID = ConsoleHelper.readInt();
                developerSkillFactory.createDevSkill(developerID, skillID);
                ConsoleHelper.writeMessage("\nНавык создан!\n");
                break;
            case 2:
                ConsoleHelper.writeMessage("Укажите ID разработчика:\n");
                developerID = ConsoleHelper.readInt();
                ConsoleHelper.writeMessage("\nУкажите ID навыка:\n");
                skillID = ConsoleHelper.readInt();
                developerSkillDAO.deleteElement(developerID, skillID);
                ConsoleHelper.writeMessage("\nНавык удален!\n");
                break;
            default:
                break;
        }
    }
}

