package ua.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Entity
@Table(name = "projects", schema = "public", catalog = "initDB")
public class Project implements Model {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "id", unique = true)
    private int projectID;

    @Column(name = "name")
    private String name;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.REFRESH})
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.REFRESH})
    @JoinColumn(name = "company_id")
    private Company company;

    @Column(name = "start")
    private Date start;

    @Column(name = "finish")
    private Date finish;

    @Column(name = "cost")
    private int cost;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "project")
    private List<Developer> developers;


    public Project() {
    }

    public Project(String name, Customer customer, Company company, Date start, Date finish, int cost) {
        this.name = name;
        this.customer = customer;
        this.company = company;
        this.start = start;
        this.finish = finish;
        this.cost = cost;
    }

    public int getProjectID() {
        return projectID;
    }

    public void setProjectID(int projectID) {
        this.projectID = projectID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getFinish() {
        return finish;
    }

    public void setFinish(Date finish) {
        this.finish = finish;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public List<Developer> getDevelopers() {
        return developers;
    }

    public void setDevelopers(List<Developer> developers) {
        this.developers = developers;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "\nПроект: " +
                "projectID = " + projectID +
                ", Нзвание: '" + name + '\'' +
                ", start: " + start +
                ", finish: " + finish +
                ", Стоимость: $" + cost +
               /* ", developers=" + developers +*/
                "\nКомпания-разработчик: " + company/* +
                ", Заказчик: " + customer*/;
    }
}
