package model;

public class Owner {

    private String name;
    private String natID;

    public Owner(String name, String natID) {
        this.name = name;
        this.natID = natID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNatID() {
        return natID;
    }

    public void setNatID(String natID) {
        this.natID = natID;
    }
}
