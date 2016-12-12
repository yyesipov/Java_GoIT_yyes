package moduleEE2.main.controller;

import main.dao.CompanyDAO;
import main.factory.CompanyFactory;
import main.view.ConsoleHelper;

import java.io.IOException;
import java.sql.SQLException;

public class CompanyCommand implements Command {
    @Override
    public void execute() throws IOException, ClassNotFoundException, SQLException {
        CompanyFactory companyFactory = new CompanyFactory();
        CompanyDAO companyDAO = new CompanyDAO();

        String name;
        int companyID;
        String address;


        ConsoleHelper.writeMessage("* * * КОМПАНИИ * * *" + "\n" +
                "1 - Добавить | 2 - Удалить | 3 - Изменить | 4 - Показать все | 5 - Найти по ID\n");
        int commandNumber = ConsoleHelper.readInt();

        switch (commandNumber) {
            case 1:
                ConsoleHelper.writeMessage("Укажите название компании:\n");
                name = ConsoleHelper.readString();
                ConsoleHelper.writeMessage("\nУкажите ID компании:\n");
                companyID = ConsoleHelper.readInt();
                ConsoleHelper.writeMessage("Укажите адрес компании:\n");
                address = ConsoleHelper.readString();
                companyFactory.createCompany(companyID, name, address);
                companyDAO.showCompany(companyID);
                ConsoleHelper.writeMessage("\nКомпания создана!\n");
                break;
            case 2:
                ConsoleHelper.writeMessage("Укажите ID компании:\n");
                companyID = ConsoleHelper.readInt();
                companyDAO.deleteElement(companyID);
                ConsoleHelper.writeMessage("\nКомпания удалена!\n");
                break;
            case 3:
                ConsoleHelper.writeMessage("Укажите ID компании:\n");
                companyID = ConsoleHelper.readInt();
                ConsoleHelper.writeMessage("\nУкажите название компании:\n");
                name = ConsoleHelper.readString();
                ConsoleHelper.writeMessage("Укажите адрес компании:\n");
                address = ConsoleHelper.readString();
                companyDAO.updateElement(companyID, name, address);
                ConsoleHelper.writeMessage("\nИзменения выполнены!\n");
                break;
            case 4:
                companyDAO.showAllCompanies();
                break;
            case 5:
                ConsoleHelper.writeMessage("Укажите ID компании:\n");
                companyID = ConsoleHelper.readInt();
                companyDAO.showCompany(companyID);
        }
    }
}
