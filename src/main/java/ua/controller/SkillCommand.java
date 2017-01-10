package ua.controller;


import ua.factory.SkillFactory;
import ua.hibernate.HSkillDAO;
import ua.view.ConsoleHelper;

import java.io.IOException;
import java.sql.SQLException;


public class SkillCommand implements Command {

    SkillFactory skillFactory = new SkillFactory();
    HSkillDAO hSkillDAO = new HSkillDAO();

    String name;
    int skillID;

    @Override
    public void execute() throws IOException, ClassNotFoundException, SQLException {

        ConsoleHelper.writeMessage("* * * НАВЫКИ * * *" + "\n" +
                "1 - Добавить | 2 - Удалить | 3 - Изменить | 4 - Показать все | 5 - Найти по ID\n");
        int commandNumber = ConsoleHelper.readInt();

        switch (commandNumber) {
            case 1:
                ConsoleHelper.writeMessage("Укажите название навыка:\n");
                name = ConsoleHelper.readString();
                skillFactory.createSkill(name);
                ConsoleHelper.writeMessage("\nНавык создан!\n");
                break;
            case 2:
                ConsoleHelper.writeMessage("Укажите ID навыка:\n");
                skillID = ConsoleHelper.readInt();
                hSkillDAO.deleteById(skillID);
                ConsoleHelper.writeMessage("\nНавык удален!\n");
                break;
            case 3:
                ConsoleHelper.writeMessage("Укажите ID навыка:\n");
                skillID = ConsoleHelper.readInt();
                ConsoleHelper.writeMessage("\nУкажите новое название навыка:\n");
                name = ConsoleHelper.readString();
                skillFactory.updateSkill(skillID, name);
                ConsoleHelper.writeMessage("\nИзменения выполнены!\n");
                break;
            case 4:
                hSkillDAO.showAll();
                break;
            case 5:
                ConsoleHelper.writeMessage("Укажите ID навыка:\n");
                skillID = ConsoleHelper.readInt();
                ConsoleHelper.writeMessage(hSkillDAO.findById(skillID).toString());
                break;
            default:
                break;
        }
    }
}

