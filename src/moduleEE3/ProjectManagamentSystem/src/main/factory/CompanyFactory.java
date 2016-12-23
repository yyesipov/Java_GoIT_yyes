package moduleEE3.ProjectManagamentSystem.src.main.factory;

import main.dao.CompanyDAO;

import java.sql.SQLException;

public class CompanyFactory {
    public void createCompany(int id, String name, String address) throws SQLException {
        CompanyDAO companyDAO = new CompanyDAO();
        companyDAO.createElement(id, name, address);
    }
}
