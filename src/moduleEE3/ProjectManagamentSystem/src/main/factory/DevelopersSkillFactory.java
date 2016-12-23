package moduleEE3.ProjectManagamentSystem.src.main.factory;

import main.dao.DeveloperSkillDAO;

import java.sql.SQLException;

public class DevelopersSkillFactory {
    public void createDevSkill(int projectID, int skillID) throws SQLException {
        DeveloperSkillDAO developerSkillDAO = new DeveloperSkillDAO();
        developerSkillDAO.createElement(projectID, skillID);
    }
}
