package moduleEE2.main.factory;

import moduleEE2.main.dao.CustomerDAO;

import java.sql.SQLException;

public class CustomerFactory {
    public void createCustomer(int id, String name, String address) throws SQLException {
        CustomerDAO customerDAO = new CustomerDAO();
        customerDAO.createCustomer(id, name, address);
    }

}
