package ua.factory;


import ua.hibernate.HCustomerDAO;
import ua.model.Customer;

import java.sql.SQLException;

public class CustomerFactory {

    HCustomerDAO hCustomerDAO = new HCustomerDAO();

    public void createCustomer(String name, String address) throws SQLException {
        Customer customer = new Customer(name, address);
        hCustomerDAO.save(customer);
    }

    public void updateCustomer(int id, String name, String address) throws SQLException {
        Customer customer = hCustomerDAO.findById(id);
        customer.setName(name);
        customer.setAddress(address);
        hCustomerDAO.update(customer);
    }
}
