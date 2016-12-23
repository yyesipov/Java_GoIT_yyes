package moduleEE3.ProjectManagamentSystem.src.main.dao;

import main.model.Customer;
import main.view.ConsoleHelper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerDAO {

    private List<Customer> listCustomers = null;
    private ResultSet resultSetCustomers;

    public List<Customer> readingAllElements() throws SQLException {
        String sql = "SELECT * FROM customers";
        resultProcessing(sql);
        return listCustomers;
    }

    public List<Customer> readingCompaniesElements(int customerID) throws SQLException {
        String sql = "SELECT * FROM customers WHERE id = " + customerID;
        resultProcessing(sql);
        return listCustomers;
    }

    public void updateCustomer(int customerID, String name, String address) throws SQLException {
        String sql = "UPDATE customers SET name = ?, address = ? WHERE id = ?";
        ConnectDAO.changeElement(sql, customerID, name, address);
    }

    public void deleteCustomer(int customerID) throws SQLException {
        String sql = "DELETE FROM customers WHERE id = ?";
        ConnectDAO.deleteRecord(sql, customerID);
    }

    public void createCustomer(int id, String name, String address) throws SQLException {
        String sql = "INSERT INTO customers VALUES(id = ?, name = ?, address = ?)";
        ConnectDAO.addElement(sql, id, name, address);
    }

    public void showAllCustomers() throws SQLException {
        readingAllElements();
        for (Customer customer : listCustomers) {
            ConsoleHelper.writeMessage(customer.toString());
        }
    }

    public void showCustomer(int companyID) throws SQLException {
        readingCompaniesElements(companyID);
        for (Customer customer : listCustomers) {
            ConsoleHelper.writeMessage(customer.toString());
        }
    }

    private void resultProcessing(String sql) throws SQLException {
        resultSetCustomers = ConnectDAO.selectRecord(sql);
        listCustomers = new ArrayList<>();

        while (resultSetCustomers.next()) {
            int id = resultSetCustomers.getInt("id");
            String name = resultSetCustomers.getString("name");
            String address = resultSetCustomers.getString("address");
            Customer company = new Customer(id, name, address);
            listCustomers.add(company);
        }
        resultSetCustomers.close();
    }



}
