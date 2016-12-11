package moduleEE2.src.main.controller;

import moduleEE2.src.main.dao.ConnectDAO;
import moduleEE2.src.main.dao.DeveloperDAO;
import moduleEE2.src.main.factory.DeveloperFactory;
import moduleEE2.src.main.view.ConsoleHelper;

import java.io.IOException;
import java.sql.SQLException;
import java.sql.Date;

public class DeveloperCommand implements Command {
    @Override
    public void execute() throws IOException, ClassNotFoundException, SQLException {
        DeveloperFactory developerFactory = new DeveloperFactory();
        DeveloperDAO developerDao = new DeveloperDAO();

        int id;
        String name;
        int age;
        String address;
        int projectId;
        int companyId;
        Date joinDate = null;
        int salary;


        ConsoleHelper.writeMessage("* * * РАЗРАБОТЧИКИ * * *" + "\n" +
                "1 - Добавить | 2 - Удалить | 3 - Изменить | 4 - Показать всех | 5 - Найти по ID\n");
        int commandNumber = ConsoleHelper.readInt();

        switch (commandNumber) {
            case 1:
                ConsoleHelper.writeMessage("Укажите инициалы(Имя и Фамилию) разработчика:\n");
                name = ConsoleHelper.readString();
                ConsoleHelper.writeMessage("\nУкажите возраст разработчика:\n");
                age = ConsoleHelper.readInt();
                ConsoleHelper.writeMessage("\nУкажите ID разработчика:\n");
                id = ConsoleHelper.readInt();
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
                ConsoleHelper.writeMessage("\nРазработчик создан!\n");
                developerFactory.createDeveloper(id, name, age, address, projectId, companyId, joinDate, salary);
                developerDao.showDeveloper(id);
                ConnectDAO.statement.close();
                break;
            case 2:
                ConsoleHelper.writeMessage("Укажите ID разработчика:\n");
                id = ConsoleHelper.readInt();
                developerDao.deleteElement(id);
                ConsoleHelper.writeMessage("\nРазработчик удален!\n");
                break;
            case 3:
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
                developerDao.updateElement(name, age, address, projectId, companyId, joinDate, salary, id);
                ConsoleHelper.writeMessage("\nИзменения выполнены!\n");
                break;
            case 4:
                developerDao.showAllDevelopers();
                break;
            case 5:
                ConsoleHelper.writeMessage("Укажите ID разработчика:\n");
                id = ConsoleHelper.readInt();
                developerDao.showDeveloper(id);
                break;
            default:
                break;
        }
    }
}
