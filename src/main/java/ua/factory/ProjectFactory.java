package ua.factory;


import ua.hibernate.HProjectDAO;
import ua.model.Company;
import ua.model.Customer;
import ua.model.Project;

import java.sql.SQLException;
import java.sql.Date;

public class ProjectFactory {

    HProjectDAO hProjectDAO = new HProjectDAO();

    public void createProject(String name, int customerID, int companyID,
                              Date start, Date finish, int cost)
            throws SQLException, IllegalAccessException, InstantiationException {

        Customer customer = CustomerFactory.class.newInstance().hCustomerDAO.findById(customerID);
        Company company = CompanyFactory.class.newInstance().hCompanyDAO.findById(companyID);
        Project project = new Project(name, customer, company, start, finish, cost);
        hProjectDAO.save(project);
    }

    public void updateProject(int projectID, String name, int customerID, int companyID,
                              Date start, Date finish, int cost)
            throws SQLException, IllegalAccessException, InstantiationException {

        Project project = hProjectDAO.findById(projectID);
        Customer customer = CustomerFactory.class.newInstance().hCustomerDAO.findById(customerID);
        Company company = CompanyFactory.class.newInstance().hCompanyDAO.findById(companyID);
        project.setName(name);
        project.setCustomer(customer);
        project.setCompany(company);
        project.setStart(start);
        project.setFinish(finish);
        project.setCost(cost);
        hProjectDAO.update(project);
    }
}
