package ua.factory;


import ua.hibernate.HCompanyDAO;
import ua.model.Company;

import java.sql.SQLException;

public class CompanyFactory {

    HCompanyDAO hCompanyDAO = new HCompanyDAO();

    public void createCompany(String name, String address) throws SQLException {
        Company company = new Company(name, address);
        hCompanyDAO.save(company);
    }

    public void updateCompany(int id, String name, String address) throws SQLException {
        Company company = hCompanyDAO.findById(id);
        company.setName(name);
        company.setAddress(address);
        hCompanyDAO.update(company);
    }
}
