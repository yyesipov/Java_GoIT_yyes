package ua.controller;


import ua.factory.ProjectFactory;
import ua.hibernate.HProjectDAO;
import ua.view.ConsoleHelper;

import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.sql.Date;

public class ProjectCommand implements Command {

    ProjectFactory projectFactory = new ProjectFactory();
    HProjectDAO hProjectDAO = new HProjectDAO();

    String name;
    int projectID;
    int customerID;
    int companyID;
    Date start;
    Date finish;
    int cost;

    @Override
    public void execute() throws IOException, ClassNotFoundException, SQLException, IllegalAccessException,
            InstantiationException, ParseException {

        ConsoleHelper.writeMessage("* * * ПРОЕКТЫ * * *" + "\n" +
                "1 - Добавить | 2 - Удалить | 3 - Изменить | 4 - Показать все | 5 - Найти по ID\n");
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
        }
    }

    private void block_1() throws IOException, SQLException, InstantiationException, IllegalAccessException, ParseException {
        ConsoleHelper.writeMessage("Укажите название проекта:\n");
        name = ConsoleHelper.readString();
        ConsoleHelper.writeMessage("\nУкажите ID заказчика проекта:\n");
        customerID = ConsoleHelper.readInt();
        ConsoleHelper.writeMessage("\nУкажите ID компании, разрабатывающей проект:\n");
        companyID = ConsoleHelper.readInt();
        ConsoleHelper.writeMessage("\nУкажите дату начала проекта (гггг/мм/дд):\n");
        start = ConsoleHelper.readDate();
        ConsoleHelper.writeMessage("\nУкажите планируемую дату окончания проекта (гггг/мм/дд):\n");
        finish = ConsoleHelper.readDate();
        ConsoleHelper.writeMessage("\nУкажите стоимость проекта:\n");
        cost = ConsoleHelper.readInt();
        projectFactory.createProject(name, customerID, companyID, start, finish, cost);
        ConsoleHelper.writeMessage("\nПроект создан!\n");
    }

    private void block_2() throws IOException, SQLException {
        ConsoleHelper.writeMessage("Укажите ID проекта:\n");
        projectID = ConsoleHelper.readInt();
        hProjectDAO.deleteById(projectID);
        ConsoleHelper.writeMessage("\nПроект удален!\n");
    }

    private void block_3() throws IOException, SQLException, InstantiationException, IllegalAccessException, ParseException {
        ConsoleHelper.writeMessage("Укажите ID проекта:\n");
        projectID = ConsoleHelper.readInt();
        ConsoleHelper.writeMessage("\nУкажите название нового проекта:\n");
        name = ConsoleHelper.readString();
        ConsoleHelper.writeMessage("Укажите новый ID заказчика проекта:\n");
        customerID = ConsoleHelper.readInt();
        ConsoleHelper.writeMessage("Укажите новый ID компании, разрабатывающей проект:\n");
        companyID = ConsoleHelper.readInt();
        ConsoleHelper.writeMessage("\nУкажите новую дату окончания проекта (гггг/мм/дд):\n");
        finish = ConsoleHelper.readDate();
        ConsoleHelper.writeMessage("\nУкажите стоимость проекта:\n");
        cost = ConsoleHelper.readInt();
        projectFactory.updateProject(projectID, name, customerID, companyID, start, finish, cost);
        ConsoleHelper.writeMessage("\nИзменения выполнены!\n");
    }

    private void block_4() throws IOException, SQLException {
        hProjectDAO.showAll();
    }

    private void block_5() throws IOException, SQLException {
        ConsoleHelper.writeMessage("Укажите ID проекта:\n");
        projectID = ConsoleHelper.readInt();
        ConsoleHelper.writeMessage(hProjectDAO.findById(projectID).toString());
    }
}
