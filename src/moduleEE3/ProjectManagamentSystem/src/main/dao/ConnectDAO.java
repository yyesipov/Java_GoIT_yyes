package moduleEE3.ProjectManagamentSystem.src.main.dao;

import java.sql.*;
import java.util.Date;

public class ConnectDAO {
    public static final String JDBC_DRIVER = "org.postgresql.Driver";
    public static final String DATABASE_URL = "jdbc:postgresql://localhost:5432/initDB";

    public static final String USER = "postgres";
    public static final String PASSWORD = "PGDolores224";

    public static Connection connection = null;
    public static Statement statement = null;
    public static PreparedStatement preparedStatement = null;

    public static void ConnectDB() throws SQLException, ClassNotFoundException {
        Class.forName(JDBC_DRIVER);
        connection = DriverManager.getConnection(DATABASE_URL, USER, PASSWORD);
    }

    public static ResultSet selectRecord(String sql) throws SQLException {
        statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        return resultSet;
    }

    public static void changeProject(String sql, String name, int customerID, int companyID, Date finish, int cost, int projectID) throws SQLException {
        preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, name);
        preparedStatement.setInt(2, customerID);
        preparedStatement.setInt(3, companyID);
        preparedStatement.setDate(4, (java.sql.Date) finish);
        preparedStatement.setInt(5, cost);
        preparedStatement.setInt(6, projectID);
        preparedStatement.executeUpdate();
        preparedStatement.close();
    }

    public static void deleteRecord(String sql, int id) throws SQLException {
        preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, id);
        preparedStatement.executeUpdate();
        preparedStatement.close();

    }


    public static void changeDeveloper(String sql, String name, int age, String address, int projectId, int companyId, Date joinDate, int salary, int developerID) throws SQLException {
        preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, name);
        preparedStatement.setInt(2, age);
        preparedStatement.setString(3, address);
        preparedStatement.setInt(4, projectId);
        preparedStatement.setInt(5, companyId);
        preparedStatement.setDate(6, (java.sql.Date) joinDate);
        preparedStatement.setInt(7, salary);
        preparedStatement.setInt(8, developerID);
        preparedStatement.executeUpdate();
        preparedStatement.close();
    }

    public static void addDeveloper(String sql, int developerID, String name, int age, String address, int projectId, int companyId, Date joinDate, int salary) throws SQLException {
        preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, developerID);
        preparedStatement.setString(2, name);
        preparedStatement.setInt(3, age);
        preparedStatement.setString(4, address);
        preparedStatement.setInt(5, projectId);
        preparedStatement.setInt(6, companyId);
        preparedStatement.setDate(7, (java.sql.Date) joinDate);
        preparedStatement.setInt(8, salary);
        preparedStatement.executeUpdate();
        preparedStatement.close();
    }

    public static void addProject(String sql, int projectID, String name, int customerID, int companyID, Date start, Date finish, int cost) throws SQLException {
        preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, projectID);
        preparedStatement.setString(2, name);
        preparedStatement.setInt(3, customerID);
        preparedStatement.setInt(4, companyID);
        preparedStatement.setDate(5, (java.sql.Date) start);
        preparedStatement.setDate(6, (java.sql.Date) finish);
        preparedStatement.setInt(7, cost);
        preparedStatement.executeUpdate();
        preparedStatement.close();
    }

    public static void changeSkill(String sql, int skillID, String name) throws SQLException {
        preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(2, skillID);
        preparedStatement.setString(1, name);
        preparedStatement.executeUpdate();
        preparedStatement.close();
    }

    public static void addSkill(String sql, int skillID, String name) throws SQLException{
        preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, skillID);
        preparedStatement.setString(2, name);
        preparedStatement.executeUpdate();
        preparedStatement.close();
    }

    public static void addDelDevSkill(String sql, int developerID, int skillID) throws SQLException{
        preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, developerID);
        preparedStatement.setInt(2, skillID);
        preparedStatement.executeUpdate();
        preparedStatement.close();
    }

    public static void addElement(String sql, int id, String name, String address) throws SQLException{
        preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, id);
        preparedStatement.setString(2, name);
        preparedStatement.setString(3, address);
        preparedStatement.executeUpdate();
        preparedStatement.close();
    }

    public static void changeElement(String sql, int id, String name, String address)throws SQLException {
        preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(3, id);
        preparedStatement.setString(1, name);
        preparedStatement.setString(2, address);
        preparedStatement.executeUpdate();
        preparedStatement.close();
    }

    public static void closeConnect() throws SQLException {
        connection.close();
    }



}
