package moduleEE2.main.model;

public class Skill {
    private int ID;
    private String name;

    public int getID() {return ID;}
    public String getName() {
        return name;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Skill() {
    }

    public Skill(int ID, String name) {
        this.ID = ID;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Skill{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                '}';
    }
}
