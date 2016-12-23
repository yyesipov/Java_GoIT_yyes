package moduleEE3.ProjectManagamentSystem.src.main.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.Set;

@Entity
@Table(name = "developers", schema = "public", catalog = "initDB")
public class Developer implements Model {

    @Id
    @Column(name = "id", unique = true, nullable = false)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private int age;

    @Column(name = "address")
    private String address;

    @Column(name = "project_id")
    private int projectId;

    @Column(name = "company_id")
    private int companyId;

    @Column(name = "join_date")
    private Date joinDate;

    @Column(name = "salary")
    private int salary;

    @ManyToMany
    @JoinTable(name = "developers_skills", joinColumns = @JoinColumn(name = "developer_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "skill_id", referencedColumnName = "id"))
    private Set<Skill> skills;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "project_id")
    private Project project;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "company_id")
    private Company company;

    public Developer() {
    }

    public Developer(int id, String name, int age, String address, int projectId, int companyId,
                     Date joinDate, int salary, Set<Skill> skills, Project project, Company company) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.projectId = projectId;
        this.companyId = companyId;
        this.joinDate = joinDate;
        this.salary = salary;
        this.skills = skills;
        this.project = project;
        this.company = company;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public Date getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(Date joinDate) {
        this.joinDate = joinDate;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Set<Skill> getSkills() {
        return skills;
    }

    public void setSkills(Set<Skill> skills) {
        this.skills = skills;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", projectId=" + projectId +
                ", companyId=" + companyId +
                ", joinDate=" + joinDate +
                ", salary=" + salary +
                ", skills=" + skills +
                ", project=" + project +
                ", company=" + company +
                '}';
    }
}
