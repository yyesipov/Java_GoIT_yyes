package moduleEE3.ProjectManagamentSystem.src.main.controller;

import main.dao.CustomerDAO;
import main.factory.CustomerFactory;
import main.view.ConsoleHelper;

import java.io.IOException;
import java.sql.SQLException;

public class CustomerCommand implements Command {
    @Override
    public void execute() throws IOException, ClassNotFoundException, SQLException {
        CustomerFactory customerFactory = new CustomerFactory();
        CustomerDAO customerDAO = new CustomerDAO();

        String name;
        int customerID;
        String address;


        ConsoleHelper.writeMessage("* * * ЗАКАЗЧИКИ * * *" + "\n" +
                "1 - Добавить | 2 - Удалить | 3 - Изменить | 4 - Показать все | 5 - Найти по ID\n");
        int commandNumber = ConsoleHelper.readInt();

        switch (commandNumber) {
            case 1:
                ConsoleHelper.writeMessage("Укажите название заказчика:\n");
                name = ConsoleHelper.readString();
                ConsoleHelper.writeMessage("\nУкажите ID заказчика:\n");
                customerID = ConsoleHelper.readInt();
                ConsoleHelper.writeMessage("Укажите адрес заказчика:\n");
                address = ConsoleHelper.readString();
                customerFactory.createCustomer(customerID, name, address);
                customerDAO.showCustomer(customerID);
                ConsoleHelper.writeMessage("\nЗаказчик создан!\n");
                break;
            case 2:
                ConsoleHelper.writeMessage("Укажите ID заказчика:\n");
                customerID = ConsoleHelper.readInt();
                customerDAO.deleteCustomer(customerID);
                ConsoleHelper.writeMessage("\nЗаказчик удален!\n");
                break;
            case 3:
                ConsoleHelper.writeMessage("Укажите ID заказчика:\n");
                customerID = ConsoleHelper.readInt();
                ConsoleHelper.writeMessage("\nУкажите название заказчика:\n");
                name = ConsoleHelper.readString();
                ConsoleHelper.writeMessage("Укажите адрес заказчика:\n");
                address = ConsoleHelper.readString();
                customerDAO.updateCustomer(customerID, name, address);
                ConsoleHelper.writeMessage("\nИзменения выполнены!\n");
                break;
            case 4:
                customerDAO.showAllCustomers();
                break;
            case 5:
                ConsoleHelper.writeMessage("Укажите ID заказчика:\n");
                customerID = ConsoleHelper.readInt();
                customerDAO.showCustomer(customerID);
        }
    }
}
