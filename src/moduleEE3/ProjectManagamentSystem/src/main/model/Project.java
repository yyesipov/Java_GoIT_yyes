package moduleEE3.ProjectManagamentSystem.src.main.model;


import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "project", schema = "public", catalog = "initDB")
public class Project implements Model {

    @Id
    @Column(name = "id", unique = true, nullable = false)
    private int projectID;

    @Column(name = "name")
    private String name;

    @Column(name = "customer_id")
    private int customerID;

    @Column(name = "company_id")
    private int companyID;

    @Column(name = "start")
    private Date start;

    @Column(name = "finish")
    private Date finish;

    @Column(name = "cost")
    private int cost;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "project")
    private Set<Developer> developers;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "company_id")
    private Company company;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "customer_id")
    private Customer customer;

    public Project() {
    }

    public Project(int projectID, String name, int customerID, int companyID, Date start, Date finish,
                   int cost, Set<Developer> developers, Company company, Customer customer) {
        this.projectID = projectID;
        this.name = name;
        this.customerID = customerID;
        this.companyID = companyID;
        this.start = start;
        this.finish = finish;
        this.cost = cost;
        this.developers = developers;
        this.company = company;
        this.customer = customer;
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

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public int getCompanyID() {
        return companyID;
    }

    public void setCompanyID(int companyID) {
        this.companyID = companyID;
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

    public Set<Developer> getDevelopers() {
        return developers;
    }

    public void setDevelopers(Set<Developer> developers) {
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
        return "Project{" +
                "projectID=" + projectID +
                ", name='" + name + '\'' +
                ", customerID=" + customerID +
                ", companyID=" + companyID +
                ", start=" + start +
                ", finish=" + finish +
                ", cost=" + cost +
                ", developers=" + developers +
                ", company=" + company +
                ", customer=" + customer +
                '}';
    }
}
