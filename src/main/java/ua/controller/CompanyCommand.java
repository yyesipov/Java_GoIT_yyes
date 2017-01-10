package ua.controller;


import ua.factory.CompanyFactory;
import ua.hibernate.HCompanyDAO;
import ua.view.ConsoleHelper;

import java.io.IOException;
import java.sql.SQLException;

public class CompanyCommand implements Command {

    CompanyFactory companyFactory = new CompanyFactory();
    HCompanyDAO hCompanyDAO = new HCompanyDAO();

    String name;
    int companyID;
    String address;

    @Override
    public void execute() throws IOException, ClassNotFoundException, SQLException {

        ConsoleHelper.writeMessage("* * * КОМПАНИИ * * *" + "\n" +
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

    private void block_1() throws IOException, SQLException {
        ConsoleHelper.writeMessage("Укажите название компании:\n");
        name = ConsoleHelper.readString();
        ConsoleHelper.writeMessage("Укажите адрес компании:\n");
        address = ConsoleHelper.readString();
        companyFactory.createCompany(name, address);
        ConsoleHelper.writeMessage("\nКомпания создана!\n");
    }

    private void block_2() throws IOException, SQLException {
        ConsoleHelper.writeMessage("Укажите ID компании:\n");
        companyID = ConsoleHelper.readInt();
        hCompanyDAO.deleteById(companyID);
        ConsoleHelper.writeMessage("\nКомпания удалена!\n");
    }

    private void block_3() throws IOException, SQLException {
        ConsoleHelper.writeMessage("Укажите ID компании:\n");
        companyID = ConsoleHelper.readInt();
        ConsoleHelper.writeMessage("\nУкажите название компании:\n");
        name = ConsoleHelper.readString();
        ConsoleHelper.writeMessage("Укажите адрес компании:\n");
        address = ConsoleHelper.readString();
        companyFactory.updateCompany(companyID, name, address);
        ConsoleHelper.writeMessage("\nИзменения выполнены!\n");
    }

    private void block_4() throws IOException, SQLException {
        hCompanyDAO.showAll();
    }

    private void block_5() throws IOException, SQLException {
        ConsoleHelper.writeMessage("Укажите ID компании:\n");
        companyID = ConsoleHelper.readInt();
        ConsoleHelper.writeMessage(hCompanyDAO.findById(companyID).toString());
    }
}
