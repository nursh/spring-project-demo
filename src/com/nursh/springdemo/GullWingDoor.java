package com.nursh.springdemo;

public class GullWingDoor implements CarDoor {

    private String description;

    public GullWingDoor(String description) {
        this.description = description;
    }


    public String getDescription() {
        return description;
    }

}
