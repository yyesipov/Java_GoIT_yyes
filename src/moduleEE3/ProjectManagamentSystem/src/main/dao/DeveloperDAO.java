package moduleEE3.ProjectManagamentSystem.src.main.dao;


import main.model.Developer;
import main.model.Skill;
import main.view.ConsoleHelper;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import static main.dao.ConnectDAO.connection;

public class DeveloperDAO {

    private List<Developer> listDevelopers = null;
    private List<String> result = null;


    protected List<String> getDeveloperSkills(int id, Connection connection) throws SQLException {
        String sql = "SELECT skills.name AS skill FROM developers_skills " +
                "JOIN skills ON developers_skills.skill_id = skills.id " +
                "WHERE developer_id=?";
        result = new ArrayList<>();
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, id);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next())
            result.add(resultSet.getString("skill"));
        return result;
    }

    protected List<Developer> readingAllElements() throws SQLException {
        String sql = "SELECT * FROM developers";
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

    public void showDeveloperSkills(int id, Connection connection) throws SQLException {

        getDeveloperSkills(id, connection);
        for (String skill : result) {
            ConsoleHelper.writeMessage(skill);
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
