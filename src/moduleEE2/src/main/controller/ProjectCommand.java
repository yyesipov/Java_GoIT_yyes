package moduleEE2.src.main.controller;

import moduleEE2.src.main.dao.ProjectDAO;
import moduleEE2.src.main.factory.ProjectFactory;
import moduleEE2.src.main.view.ConsoleHelper;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Date;

public class ProjectCommand implements Command{
    @Override
    public void execute() throws IOException, ClassNotFoundException, SQLException {
        ProjectFactory projectFactory = new ProjectFactory();
        ProjectDAO projectDao = new ProjectDAO();

        String name;
        int projectID;
        int customerID;
        int companyID;
        Date start;
        Date finish;
        int cost;

        ConsoleHelper.writeMessage("* * * ПРОЕКТЫ * * *" + "\n" +
                "1 - Добавить | 2 - Удалить | 3 - Изменить | 4 - Показать все | 5 - Найти по ID\n");
        int commandNumber = ConsoleHelper.readInt();

        switch (commandNumber){
            case 1:
                ConsoleHelper.writeMessage("Укажите название проекта:\n");
                name = ConsoleHelper.readString();
                ConsoleHelper.writeMessage("\nУкажите ID проекта:\n");
                projectID = ConsoleHelper.readInt();
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
                projectFactory.createProject(projectID, name, customerID, companyID, start, finish, cost);
                projectDao.showProject(projectID);
                ConsoleHelper.writeMessage("\nПроект создан!\n");
                break;
            case 2:
                ConsoleHelper.writeMessage("Укажите ID проекта:\n");
                projectID = ConsoleHelper.readInt();
                projectDao.deleteElement(projectID);
                ConsoleHelper.writeMessage("\nПроект удален!\n");
                break;
            case 3:
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
                projectDao.updateElement(name, customerID, companyID, finish, cost, projectID);
                ConsoleHelper.writeMessage("\nИзменения выполнены!\n");
                break;
            case 4:
                projectDao.showAllProjects();
                break;
            case 5:
                ConsoleHelper.writeMessage("Укажите ID проекта:\n");
                projectID = ConsoleHelper.readInt();
                projectDao.showProject(projectID);
        }
    }
}
