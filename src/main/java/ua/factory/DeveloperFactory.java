package ua.factory;


import ua.hibernate.HDeveloperDAO;
import ua.model.Company;
import ua.model.Developer;
import ua.model.Project;

import java.sql.Date;
import java.sql.SQLException;

public class DeveloperFactory {

    private HDeveloperDAO hDeveloperDAO = new HDeveloperDAO();

    public void createDeveloper(String name, int age, String address, int projectId,
                                int companyId, Date joinDate, int salary)
            throws SQLException, IllegalAccessException, InstantiationException {

        Project project = ProjectFactory.class.newInstance().hProjectDAO.findById(projectId);
        Company company = CompanyFactory.class.newInstance().hCompanyDAO.findById(companyId);
        Developer developer = new Developer(name, age, address, project, company, joinDate, salary);
        hDeveloperDAO.save(developer);
    }

    public void updateDeveloper(int id, String name, int age, String address, int projectId,
                                int companyId, Date joinDate, int salary)
            throws SQLException, IllegalAccessException, InstantiationException {

        Developer developer = hDeveloperDAO.findById(id);
        Project project = ProjectFactory.class.newInstance().hProjectDAO.findById(projectId);
        Company company = CompanyFactory.class.newInstance().hCompanyDAO.findById(companyId);
        developer.setName(name);
        developer.setAge(age);
        developer.setAddress(address);
        developer.setProject(project);
        developer.setCompany(company);
        developer.setJoinDate(joinDate);
        developer.setSalary(salary);
        hDeveloperDAO.update(developer);
    }
}
