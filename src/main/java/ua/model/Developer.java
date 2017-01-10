package ua.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Entity
@Table(name = "developers", schema = "public", catalog = "initDB")
public class Developer implements Model {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "id", unique = true)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private int age;

    @Column(name = "address")
    private String address;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.REFRESH})
    @JoinColumn(name = "project_id")
    private Project project;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.REFRESH})
    @JoinColumn(name = "company_id")
    private Company company;

    @Column(name = "join_date")
    private Date joinDate;

    @Column(name = "salary")
    private int salary;

    @ManyToMany
    @JoinTable(name = "developers_skills", joinColumns = @JoinColumn(name = "developer_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "skill_id", referencedColumnName = "id"))
    private List<Skill> skills;

    public Developer() {
    }

    public Developer(String name, int age, String address, Project project, Company company, Date joinDate, int salary) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.project = project;
        this.company = company;
        this.joinDate = joinDate;
        this.salary = salary;
    }


    public int getId() {
        return id;
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

    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }

    @Override
    public String toString() {
        return "\n=======================================================================" +
                "\nРазработчик: " +
                "ID=" + id +
                "\nИмя: '" + name + '\'' +
                "\nВозраст: " + age +
                "\nАдрес: '" + address + '\'' +
                project +'\'' +
                company +'\'' +
                "\nДата поступления на работу: " + joinDate +'\'' +
                "\nЗарплата: " + salary /*+
                ", skills=" + skills +
                '}'*/;
    }
}


