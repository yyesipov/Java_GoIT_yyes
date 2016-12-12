package moduleEE2.main.model;

import java.sql.Date;

public class Developer implements Model {

    private int id;
    private String name;
    private int age;
    private String address;
    private int projectId;
    private int companyId;
    private Date joinDate;
    private int salary;

    public int getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public int getProjectId() {
        return projectId;
    }

    public int getCompanyId() {
        return companyId;
    }

    public Date getJoinDate() {
        return joinDate;
    }

    public int getSalary() {
        return salary;
    }

    public void setID(int developerID) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public void setJoinDate(Date joinDate) {
        this.joinDate = joinDate;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Developer() {
    }

    public Developer(int id, String name, int age, String address, int projectId, int companyId, Date joinDate, int salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.projectId = projectId;
        this.companyId = companyId;
        this.joinDate = joinDate;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "ID=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", projectId=" + projectId +
                ", companyId=" + companyId +
                ", joinDate=" + joinDate +
                ", salary=" + salary +
                '}';
    }

}
