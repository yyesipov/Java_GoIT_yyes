package moduleEE2.main.controller;



import moduleEE2.main.dao.SkillDAO;
import moduleEE2.main.factory.SkillFactory;
import moduleEE2.main.view.ConsoleHelper;

import java.io.IOException;
import java.sql.SQLException;


public class SkillCommand implements Command {
    @Override
    public void execute() throws IOException, ClassNotFoundException, SQLException {
        SkillFactory skillFactory = new SkillFactory();
        SkillDAO skillDAO = new SkillDAO();

        String name;
        int skillID;


        ConsoleHelper.writeMessage("* * * НАВЫКИ * * *" + "\n" +
                "1 - Добавить | 2 - Удалить | 3 - Изменить | 4 - Показать все | 5 - Найти по ID\n");
        int commandNumber = ConsoleHelper.readInt();

        switch (commandNumber) {
            case 1:
                ConsoleHelper.writeMessage("Укажите название навыка:\n");
                name = ConsoleHelper.readString();
                ConsoleHelper.writeMessage("\nУкажите ID навыка:\n");
                skillID = ConsoleHelper.readInt();
                skillFactory.createSkill(skillID, name);
                skillDAO.showSkill(skillID);
                ConsoleHelper.writeMessage("\nНавык создан!\n");
                break;
            case 2:
                ConsoleHelper.writeMessage("Укажите ID навыка:\n");
                skillID = ConsoleHelper.readInt();
                skillDAO.deleteElement(skillID);
                ConsoleHelper.writeMessage("\nНавык удален!\n");
                break;
            case 3:
                ConsoleHelper.writeMessage("Укажите ID навыка:\n");
                skillID = ConsoleHelper.readInt();
                ConsoleHelper.writeMessage("\nУкажите новое название навыка:\n");
                name = ConsoleHelper.readString();
                skillDAO.updateElement(skillID, name);
                ConsoleHelper.writeMessage("\nИзменения выполнены!\n");
                break;
            case 4:
                skillDAO.showAllSkills();
                break;
            case 5:
                ConsoleHelper.writeMessage("Укажите ID навыка:\n");
                skillID = ConsoleHelper.readInt();
                skillDAO.showSkill(skillID);
                break;
            default:
                break;
        }
    }
}

