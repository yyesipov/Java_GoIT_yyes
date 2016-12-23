package moduleEE3.ProjectManagamentSystem.src.main.factory;

import main.dao.SkillDAO;

import java.sql.SQLException;


public class SkillFactory {
    public void createSkill(int skillID, String name) throws SQLException {
        SkillDAO projectDao = new SkillDAO();
        projectDao.createElement(skillID, name);
    }
}

