package moduleEE2.main.factory;


import moduleEE2.main.dao.ProjectDAO;

import java.sql.SQLException;
import java.util.Date;

public class ProjectFactory {
    public void createProject(int projectID, String name, int customerID, int companyID, Date start, Date finish, int cost) throws SQLException {
        ProjectDAO projectDao = new ProjectDAO();
        projectDao.createElement(projectID, name, customerID, companyID, start, finish, cost);
    }
}
