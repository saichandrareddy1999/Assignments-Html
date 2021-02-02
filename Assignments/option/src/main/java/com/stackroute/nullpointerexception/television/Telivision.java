package com.stackroute.nullpointerexception.television;

public class Telivision {
    private long id;
    private String brand;
    private String name;
    private DisplayFeatures displayFeatures;

    public Telivision(long id, String brand, String name, DisplayFeatures displayFeatures) {
        this.id = id;
        this.brand = brand;
        this.name = name;
        this.displayFeatures = displayFeatures;
    }

    public long getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public String getName() {
        return name;
    }

    public DisplayFeatures getDisplayFeatures() {
        return displayFeatures;
    }
}
