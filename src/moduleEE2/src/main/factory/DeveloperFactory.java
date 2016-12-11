package moduleEE2.src.main.factory;

import moduleEE2.src.main.dao.DeveloperDAO;

import java.sql.SQLException;
import java.sql.Date;

public class DeveloperFactory {
    public void createDeveloper(int id, String name, int age, String address, int projectId, int companyId, Date joinDate, int salary) throws SQLException {
        DeveloperDAO developerDao = new DeveloperDAO();
        developerDao.createElement(id, name, age,  address, projectId, companyId, joinDate, salary);
    }
}
