package moduleEE2.src.main.dao;

import moduleEE2.src.main.view.ConsoleHelper;
import moduleEE2.src.main.model.Developer;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Date;
import java.util.List;

public class DeveloperDAO {

    private List<Developer> listDevelopers = null;


    protected List<Developer> readingAllElements() throws SQLException {
        String sql = "SELECT * FROM developers";
        resultProcessing(sql);
        return listDevelopers;
    }

    protected List<Developer> readingTeamsElements(int teamID) throws SQLException {
        String sql = "SELECT * FROM developers WHERE teamID = " + teamID;
        resultProcessing(sql);
        return listDevelopers;
    }

    protected List<Developer> readingElement(int id) throws SQLException {
        String sql = "SELECT * FROM developers WHERE id = " + id;
        resultProcessing(sql);
        return listDevelopers;
    }

    public void updateElement(String name, int age, String address, int projectId, int companyId, Date joinDate, int salary, int developerID) throws SQLException {
        String sql = "UPDATE developers SET name = ? age = ? address = ? project_id = ?  company_id = ? join_date = ? salary = ? WHERE id =?";
        ConnectDAO.changeDeveloper(sql, name, age, address, projectId, companyId, joinDate, salary, developerID);
    }

    public void deleteElement(int developerID) throws SQLException {
        String sql = "DELETE FROM developers WHERE id = ?";
        ConnectDAO.deleteRecord(sql, developerID);
    }

    public void createElement(int id, String name, int age, String address, int projectId, int companyId, Date joinDate, int salary) throws SQLException {
        String sql = "INSERT INTO developers VALUES(?, ?, ?, ?, ?, ?, ?, ?)";
        ConnectDAO.addDeveloper(sql, id, name, age, address, projectId, companyId, joinDate, salary);
    }

    public void showAllDevelopers() throws SQLException {
        readingAllElements();
        for (Developer developer : listDevelopers) {
            ConsoleHelper.writeMessage(developer.toString());
        }
    }

    public void showDeveloper(int id) throws SQLException {
        readingElement(id);
        for (Developer developer : listDevelopers) {
            ConsoleHelper.writeMessage(developer.toString());
        }
    }

    private void resultProcessing(String sql) throws SQLException {
        ResultSet resultSetDevelopers = ConnectDAO.selectRecord(sql);
        listDevelopers = new ArrayList<>();
        while (resultSetDevelopers.next()) {
            int id = resultSetDevelopers.getInt("id");
            String name = resultSetDevelopers.getString("name");
            int age = resultSetDevelopers.getInt("age");
            String address = resultSetDevelopers.getString("address");
            int projectId = resultSetDevelopers.getInt("project_id");
            int companyId = resultSetDevelopers.getInt("company_id");
            Date joinDate = resultSetDevelopers.getDate("join_date");
            int salary = resultSetDevelopers.getInt("salary");
            listDevelopers.add(new Developer(id, name, age, address, projectId, companyId, joinDate, salary));
        }
        resultSetDevelopers.close();
    }


}
