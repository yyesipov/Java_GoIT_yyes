package moduleEE3.ProjectManagamentSystem.src.main.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "customer",schema = "public", catalog = "initDB")
public class Customer implements Model {

    @Id
    @Column(name = "id")
    private int ID;

    @Column(name = "name")
    private String name;

    @Column(name = "address")
    private String address;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "customer")
    private Set<Project> projects;

    public Customer() {
    }

    public Customer(int ID, String name, String address, Set<Project> projects) {
        this.ID = ID;
        this.name = name;
        this.address = address;
        this.projects = projects;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Set<Project> getProjects() {
        return projects;
    }

    public void setProjects(Set<Project> projects) {
        this.projects = projects;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", projects=" + projects +
                '}';
    }
}

