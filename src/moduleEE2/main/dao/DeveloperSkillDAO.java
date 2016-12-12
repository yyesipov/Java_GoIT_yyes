package moduleEE2.main.dao;



import moduleEE2.main.model.DevelopersSkill;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;




public class DeveloperSkillDAO {
    private List<DevelopersSkill> listDevSkills = null;
    private ResultSet resultSetDS;


    public void deleteElement(int developerID, int skillID) throws SQLException {
        String sql = "DELETE FROM developers_skills WHERE developer_id = ? AND skill_id = ?";
        ConnectDAO.addDelDevSkill(sql, developerID, skillID);
    }


    public void createElement(int developerID, int skillID) throws SQLException {
        String sql = "INSERT INTO developers_skills VALUES(?, ?)";
        ConnectDAO.addDelDevSkill(sql, developerID, skillID);
    }

    private void resultProcessing(String sql) throws SQLException {
        resultSetDS = ConnectDAO.selectRecord(sql);
        listDevSkills = new ArrayList<>();
        while (resultSetDS.next()) {
            int skillID = resultSetDS.getInt("skill_id");
            int developerID = resultSetDS.getInt("developer_id");
            DevelopersSkill developersSkill = new DevelopersSkill(developerID, skillID);
            listDevSkills.add(developersSkill);
        }
        resultSetDS.close();


    }
}
