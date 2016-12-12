package moduleEE2.main.factory;



import main.dao.DeveloperDAO;

import java.sql.Date;
import java.sql.SQLException;

public class DeveloperFactory {
    public void createDeveloper(int id, String name, int age, String address, int projectId, int companyId, Date joinDate, int salary) throws SQLException {
        DeveloperDAO developerDao = new DeveloperDAO();
        developerDao.createElement(id, name, age,  address, projectId, companyId, joinDate, salary);
    }
}
