package moduleEE3.ProjectManagamentSystem.src.main.dao;

import main.model.Company;
import main.view.ConsoleHelper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CompanyDAO {
    private List<Company> listCompanies = null;
    private ResultSet resultSetCompanies;

    public List<Company> readingAllElements() throws SQLException {
        String sql = "SELECT * FROM companies";
        resultProcessing(sql);
        return listCompanies;
    }

    public List<Company> readingCompaniesElements(int companyID) throws SQLException {
        String sql = "SELECT * FROM companies WHERE id = " + companyID;
        resultProcessing(sql);
        return listCompanies;
    }

    public void updateElement(int companyID, String name, String address) throws SQLException {
        String sql = "UPDATE companies SET name = ?, address = ? WHERE id = ?";
        ConnectDAO.changeElement(sql, companyID, name, address);
    }

    public void deleteElement(int companyID) throws SQLException {
        String sql = "DELETE FROM companies WHERE id = ?";
        ConnectDAO.deleteRecord(sql, companyID);
    }

    public void createElement(int ID, String name, String address) throws SQLException {
        String sql = "INSERT INTO companies VALUES(name = ?, address = ?, id = ?)";
        ConnectDAO.addElement(sql, ID, name, address);
    }

    public void showAllCompanies() throws SQLException {
        readingAllElements();
        for (Company company : listCompanies) {
            ConsoleHelper.writeMessage(company.toString());
        }
    }

    public void showCompany(int companyID) throws SQLException {
        readingCompaniesElements(companyID);
        for (Company company : listCompanies) {
            ConsoleHelper.writeMessage(company.toString());
        }
    }

    private void resultProcessing(String sql) throws SQLException {
        resultSetCompanies = ConnectDAO.selectRecord(sql);
        listCompanies = new ArrayList<>();

        while (resultSetCompanies.next()) {
            int id = resultSetCompanies.getInt("id");
            String name = resultSetCompanies.getString("name");
            String address = resultSetCompanies.getString("address");
            Company company = new Company(id, name, address);
            listCompanies.add(company);
        }
        resultSetCompanies.close();


    }
}
