package moduleEE3.ProjectManagamentSystem.src.main.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "skills", schema = "public", catalog = "initDB")
public class Skill implements Model{

    @Id
    @Column(name = "id", unique = true, nullable = false)
    private int ID;

    @Column(name = "name")
    private String name;

    @ManyToMany(fetch = FetchType.EAGER, mappedBy = "skills")
    private Set<Developer> developers;

    public Skill() {
    }

    public Skill(int ID, String name, Set<Developer> developers) {
        this.ID = ID;
        this.name = name;
        this.developers = developers;
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

    public Set<Developer> getDevelopers() {
        return developers;
    }

    public void setDevelopers(Set<Developer> developers) {
        this.developers = developers;
    }

    @Override
    public String toString() {
        return "Skill{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", developers=" + developers +
                '}';
    }
}
