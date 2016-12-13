package moduleEE2.main.factory;



import moduleEE2.main.dao.DeveloperSkillDAO;

import java.sql.SQLException;

public class DevelopersSkillFactory {
    public void createDevSkill(int projectID, int skillID) throws SQLException {
        DeveloperSkillDAO developerSkillDAO = new DeveloperSkillDAO();
        developerSkillDAO.createElement(projectID, skillID);
    }
}
