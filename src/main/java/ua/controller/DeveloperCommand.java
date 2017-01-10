package ua.controller;


import ua.factory.DeveloperFactory;
import ua.hibernate.HDeveloperDAO;
import ua.view.ConsoleHelper;

import java.io.IOException;
import java.sql.Date;
import java.sql.SQLException;
import java.text.ParseException;

public class DeveloperCommand implements Command {

    int id;
    String name;
    int age;
    String address;
    int projectId;
    int companyId;
    Date joinDate;
    int salary;

    DeveloperFactory developerFactory = new DeveloperFactory();
    HDeveloperDAO hDeveloperDAO = new HDeveloperDAO();

    @Override
    public void execute() throws IOException, ClassNotFoundException, SQLException, IllegalAccessException, InstantiationException, ParseException {

        ConsoleHelper.writeMessage("* * * РАЗРАБОТЧИКИ * * *" + "\n" +
                "1 - Добавить | 2 - Удалить | 3 - Изменить | 4 - Показать всех | 5 - Найти по ID | 6 - Показать навыки разработчика по ID\n");
        int commandNumber = ConsoleHelper.readInt();

        switch (commandNumber) {
            case 1:
                block_1();
                break;
            case 2:
                block_2();
                break;
            case 3:
                block_3();
                break;
            case 4:
                block_4();
                break;
            case 5:
                block_5();
                break;
            case 6:
                block_6();
                break;
            default:
                break;
        }
    }

    private void block_1() throws IOException, SQLException, InstantiationException, IllegalAccessException, ParseException {
        ConsoleHelper.writeMessage("Укажите инициалы(Имя и Фамилию) разработчика:\n");
        name = ConsoleHelper.readString();
        ConsoleHelper.writeMessage("\nУкажите возраст разработчика:\n");
        age = ConsoleHelper.readInt();
        ConsoleHelper.writeMessage("\nУкажите адрес разработчика:\n");
        address = ConsoleHelper.readString();
        ConsoleHelper.writeMessage("\nУкажите ID проекта в котором задействован разработчик:\n");
        projectId = ConsoleHelper.readInt();
        ConsoleHelper.writeMessage("\nУкажите ID компании, в которой работает разработчик:\n");
        companyId = ConsoleHelper.readInt();
        ConsoleHelper.writeMessage("\nУкажите дату, с которой разработчик работает в компании (гггг/мм/дд):\n");
        joinDate = ConsoleHelper.readDate();
        ConsoleHelper.writeMessage("\nУкажите зарплату разработчика:\n");
        salary = ConsoleHelper.readInt();
        developerFactory.createDeveloper(name, age, address, projectId, companyId, joinDate, salary);
        ConsoleHelper.writeMessage("\nРазработчик создан!\n");


    }

    private void block_2() throws IOException, SQLException {
        ConsoleHelper.writeMessage("Укажите ID разработчика:\n");
        id = ConsoleHelper.readInt();
        hDeveloperDAO.deleteById(id);
        ConsoleHelper.writeMessage("\nРазработчик удален!\n");
    }

    private void block_3() throws IOException, SQLException, InstantiationException, IllegalAccessException, ParseException {
        ConsoleHelper.writeMessage("Укажите ID разработчика:\n");
        id = ConsoleHelper.readInt();
        ConsoleHelper.writeMessage("Укажите инициалы(Имя и Фамилию) разработчика:\n");
        name = ConsoleHelper.readString();
        ConsoleHelper.writeMessage("\nУкажите возраст разработчика:\n");
        age = ConsoleHelper.readInt();
        ConsoleHelper.writeMessage("\nУкажите адрес разработчика:\n");
        address = ConsoleHelper.readString();
        ConsoleHelper.writeMessage("\nУкажите ID проекта в котором задействован разработчик:\n");
        projectId = ConsoleHelper.readInt();
        ConsoleHelper.writeMessage("\nУкажите ID компании, в которой работает разработчик:\n");
        companyId = ConsoleHelper.readInt();
        ConsoleHelper.writeMessage("\nУкажите дату, с которой разработчик работает в компании (гггг/мм/дд):\n");
        joinDate = ConsoleHelper.readDate();
        ConsoleHelper.writeMessage("\nУкажите зарплату разработчика:\n");
        salary = ConsoleHelper.readInt();
        developerFactory.updateDeveloper(id, name, age, address, projectId, companyId, joinDate, salary);
        ConsoleHelper.writeMessage("\nИзменения выполнены!\n");
    }

    private void block_4() throws IOException, SQLException {
        hDeveloperDAO.showAll();
    }

    private void block_5() throws IOException, SQLException {
        ConsoleHelper.writeMessage("Укажите ID разработчика:\n");
        id = ConsoleHelper.readInt();
        ConsoleHelper.writeMessage(hDeveloperDAO.findById(id).toString());
    }

    private void block_6() throws IOException, SQLException {
        ConsoleHelper.writeMessage("Укажите ID разработчика:\n");
        id = ConsoleHelper.readInt();
        ConsoleHelper.writeMessage("Разработчик:");
        hDeveloperDAO.findById(id);
        ConsoleHelper.writeMessage("Имеет навыки:");
    }
}
