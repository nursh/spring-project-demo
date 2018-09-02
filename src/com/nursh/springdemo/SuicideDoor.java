package com.nursh.springdemo;

public class SuicideDoor implements CarDoor {

    private String description;

    public SuicideDoor(String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }
}
