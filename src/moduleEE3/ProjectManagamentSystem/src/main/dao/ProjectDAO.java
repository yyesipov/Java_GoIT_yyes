package moduleEE3.ProjectManagamentSystem.src.main.dao;


import main.model.Project;
import main.view.ConsoleHelper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProjectDAO {
    private List<Project> listProjects = null;
      private ResultSet resultSetProjects;

    public List<Project> readingAllElements() throws SQLException {
        String sql = "SELECT * FROM projects";
        resultProcessing(sql);
        return listProjects;
    }

    public List<Project> readingProjectsElements(int projectID) throws SQLException {
        String sql = "SELECT * FROM projects WHERE id = " + projectID;
        resultProcessing(sql);
        return listProjects;
    }

    public void updateElement(String name, int customerID, int companyID, Date finish, int cost, int projectID) throws SQLException {
        String sql = "UPDATE projects SET name = ? customer_id = ? company_id = ? finish = ? cost = ? WHERE id = ?";
        ConnectDAO.changeProject(sql, name, customerID, companyID, finish, cost, projectID);
}

    public void deleteElement(int projectID) throws SQLException {
        String sql = "DELETE FROM projects WHERE id = ?";
        ConnectDAO.deleteRecord(sql, projectID);
    }

    public void createElement(int projectID, String name, int customerID, int companyID, Date start, Date finish, int cost) throws SQLException {
        String sql = "INSERT INTO projects VALUES(?, ?, ?, ?, ?, ?, ?)";
        ConnectDAO.addProject(sql, projectID, name, customerID, companyID, start, finish, cost);
    }

    public void showAllProjects() throws SQLException {
        readingAllElements();
        for (Project project : listProjects){
            ConsoleHelper.writeMessage(project.toString());
        }
    }

    public void showProject(int projectID) throws SQLException {
        readingProjectsElements(projectID);
        for (Project project : listProjects){
            ConsoleHelper.writeMessage(project.toString());
        }
    }

    private void resultProcessing(String sql) throws SQLException {
        resultSetProjects = ConnectDAO.selectRecord(sql);
        listProjects = new ArrayList<>();

        while (resultSetProjects.next()){
            int id = resultSetProjects.getInt("id");
            String name = resultSetProjects.getString("name");
            int customerID = resultSetProjects.getInt("customer_id");
            int companyID = resultSetProjects.getInt("company_id");
            Date start = resultSetProjects.getDate("start");
            Date finish = resultSetProjects.getDate("finish");
            int cost = resultSetProjects.getInt("cost");
            Project project = new Project(id, name, customerID, companyID, start, finish, cost);
            listProjects.add(project);
        }
        resultSetProjects.close();


    }
}
