package moduleEE3.ProjectManagamentSystem.src.main.dao;


import moduleEE3.ProjectManagamentSystem.src.main.model.Skill;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SkillDAO {
    private List<Skill> listSkills = null;
    private ResultSet resultSetSkills;

    public List<Skill> readingAllElements() throws SQLException {
        String sql = "SELECT * FROM skills";
        resultProcessing(sql);
        return listSkills;
    }

    public List<Skill> readingProjectsElements(int skillID) throws SQLException {
        String sql = "SELECT * FROM skills WHERE id = " + skillID;
        resultProcessing(sql);
        return listSkills;
    }

    public void updateElement(int skillID, String name) throws SQLException {
        String sql = "UPDATE skills SET name = ? WHERE id = ?";
        ConnectDAO.changeSkill(sql, skillID, name);
    }

    public void deleteElement(int skillID) throws SQLException {
        String sql = "DELETE FROM skills WHERE id = ?";
        ConnectDAO.deleteRecord(sql, skillID);
    }

    public void createElement(int skillID, String name) throws SQLException {
        String sql = "INSERT INTO skills VALUES(?, ?)";
        ConnectDAO.addSkill(sql, skillID, name);
    }

    public void showAllSkills() throws SQLException {
        readingAllElements();
        for (Skill skill : listSkills) {
            ConsoleHelper.writeMessage(skill.toString());
        }
    }

    public void showSkill(int skillID) throws SQLException {
        readingProjectsElements(skillID);
        for (Skill skill : listSkills) {
            ConsoleHelper.writeMessage(skill.toString());
        }
    }

    private void resultProcessing(String sql) throws SQLException {
        resultSetSkills = ConnectDAO.selectRecord(sql);
        listSkills = new ArrayList<>();

        while (resultSetSkills.next()) {
            int id = resultSetSkills.getInt("id");
            String name = resultSetSkills.getString("name");
            Skill project = new Skill(id, name);
            listSkills.add(project);
        }
        resultSetSkills.close();


    }
}

