package ua.factory;


import ua.hibernate.HSkillDAO;
import ua.model.Skill;

import java.sql.SQLException;


public class SkillFactory {

    HSkillDAO hSkillDAO = new HSkillDAO();

    public void createSkill(String name) throws SQLException {
        Skill skill = new Skill();
        skill.setName(name);
        hSkillDAO.save(skill);
    }

    public void updateSkill(int skillID, String name) throws SQLException {
        Skill skill = hSkillDAO.findById(skillID);
        skill.setName(name);
        hSkillDAO.update(skill);
    }
}

