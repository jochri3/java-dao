package models;

abstract public class ModelDeBase {
    private int id;

    public ModelDeBase(int id) {
        this.id = id;
    }
    public ModelDeBase(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
