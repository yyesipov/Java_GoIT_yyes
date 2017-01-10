package ua.controller;


import ua.factory.CustomerFactory;
import ua.hibernate.HCustomerDAO;
import ua.view.ConsoleHelper;

import java.io.IOException;
import java.sql.SQLException;

public class CustomerCommand implements Command {

    CustomerFactory customerFactory = new CustomerFactory();
    HCustomerDAO hCustomerDAO = new HCustomerDAO();

    String name;
    int customerID;
    String address;

    @Override
    public void execute() throws IOException, ClassNotFoundException, SQLException {

        ConsoleHelper.writeMessage("* * * ЗАКАЗЧИКИ * * *" + "\n" +
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
        ConsoleHelper.writeMessage("Укажите название заказчика:\n");
        name = ConsoleHelper.readString();
        ConsoleHelper.writeMessage("\nУкажите ID заказчика:\n");
        customerID = ConsoleHelper.readInt();
        ConsoleHelper.writeMessage("Укажите адрес заказчика:\n");
        address = ConsoleHelper.readString();
        customerFactory.createCustomer(name, address);
        ConsoleHelper.writeMessage("\nЗаказчик создан!\n");
    }

    private void block_2() throws IOException, SQLException {
        ConsoleHelper.writeMessage("Укажите ID заказчика:\n");
        customerID = ConsoleHelper.readInt();
        hCustomerDAO.deleteById(customerID);
        ConsoleHelper.writeMessage("\nЗаказчик удален!\n");
    }

    private void block_3() throws IOException, SQLException {
        ConsoleHelper.writeMessage("Укажите ID заказчика:\n");
        customerID = ConsoleHelper.readInt();
        ConsoleHelper.writeMessage("\nУкажите название заказчика:\n");
        name = ConsoleHelper.readString();
        ConsoleHelper.writeMessage("Укажите адрес заказчика:\n");
        address = ConsoleHelper.readString();
        customerFactory.updateCustomer(customerID, name, address);
        ConsoleHelper.writeMessage("\nИзменения выполнены!\n");
    }

    private void block_4() throws IOException, SQLException {
        hCustomerDAO.showAll();
    }

    private void block_5() throws IOException, SQLException {
        ConsoleHelper.writeMessage("Укажите ID заказчика:\n");
        customerID = ConsoleHelper.readInt();
        ConsoleHelper.writeMessage(hCustomerDAO.findById(customerID).toString());
    }
}
