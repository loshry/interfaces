package com.company;


public abstract class Animals {
    private String name;
    private int legs;

    public abstract AnimalType getType();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLegs() {
        return legs;
    }

    public Animals setLegs(int legs) {
        this.legs = legs;
        return null;
    }
}
