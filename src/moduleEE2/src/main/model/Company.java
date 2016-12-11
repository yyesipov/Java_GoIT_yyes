package moduleEE2.src.main.model;

public class Company {
    private int ID;
    private String name;
    private String address;

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Company() {
    }

    public Company(int ID, String name, String address) {
        this.ID = ID;
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Company{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
