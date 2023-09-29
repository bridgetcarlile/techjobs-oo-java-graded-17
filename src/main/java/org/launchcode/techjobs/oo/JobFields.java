package org.launchcode.techjobs.oo;

public class JobFields {
    private int id;
    private static int nextId = 1;
    private String value;

    public JobFields() {
        id = nextId;
        nextId++;
    }

    public JobFields(String value) {
        this();
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
