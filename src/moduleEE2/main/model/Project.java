package moduleEE2.main.model;

import java.util.Date;

public class Project implements Model{

    private int projectID;
    private String name;
    private int customerID;
    private int companyID;
    private Date start;
    private Date finish;
    private int cost;

    public int getprojectID() {
        return projectID;
    }

    public String getName() {
        return name;
    }

    public int getCustomerID() {
        return customerID;
    }

    public int getCompanyID() {
        return companyID;
    }

    public Date getStart() {
        return start;
    }

    public Date getFinish() {
        return finish;
    }

    public int getCost() {
        return cost;
    }

    public void setID(int ID) {
        this.projectID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public void setCompanyID(int companyID) {
        this.companyID = companyID;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public void setFinish(Date finish) {
        this.finish = finish;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public Project() {
    }

    public Project(int projectID, String name, int customerID, int companyID, Date start, Date finish, int cost) {
        this.projectID = projectID;
        this.name = name;
        this.customerID = customerID;
        this.companyID = companyID;
        this.start = start;
        this.finish = finish;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Project{" +
                "ID=" + projectID +
                ", name='" + name + '\'' +
                ", customerID='" + customerID + '\'' +
                ", companyID='" + companyID + '\'' +
                ", start=" + start +
                ", finish=" + finish +
                ", cost=" + cost +
                '}';
    }
   /*@Override
    public String toString() {
        String listTeams = "";
        for (Team team : teams) {
            listTeams += "Team ID: " + team.getTeamID() +
                    " Team name: " + team.getName() + "\n";
        }
        return "-----------------------------------------------------------------------------------------------" + "\n" +
                "Project name: " + name + "; " + "\n" +
                "Project ID: " + projectID + "\n" +
                "Production teams: " + "\n" + listTeams;
    }*/
}
