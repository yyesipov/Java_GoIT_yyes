package moduleEE2.main.factory;


import moduleEE2.main.dao.SkillDAO;

import java.sql.SQLException;

public class SkillFactory {
    public void createSkill(int skillID, String name) throws SQLException {
        SkillDAO projectDao = new SkillDAO();
        projectDao.createElement(skillID, name);
    }
}

