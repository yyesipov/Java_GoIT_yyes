package moduleEE3.ProjectManagamentSystem.src.main.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "company", schema = "public", catalog = "initDB")
public class Company implements Model{

    @Id
    @Column(name = "id", unique = true, nullable = false)
    private int ID;

    @Column(name = "name")
    private String name;

    @Column(name = "address")
    private String address;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "company")
    private Set<Developer> developers;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "company")
    private Set<Project> projects;

    public Company() {
    }

    public Company(int ID, String name, String address, Set<Developer> developers, Set<Project> projects) {
        this.ID = ID;
        this.name = name;
        this.address = address;
        this.developers = developers;
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

    public Set<Developer> getDevelopers() {
        return developers;
    }

    public void setDevelopers(Set<Developer> developers) {
        this.developers = developers;
    }

    public Set<Project> getProjects() {
        return projects;
    }

    public void setProjects(Set<Project> projects) {
        this.projects = projects;
    }

    @Override
    public String toString() {
        return "Company{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", developers=" + developers +
                ", projects=" + projects +
                '}';
    }
}
