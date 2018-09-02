package com.nursh.springdemo;

public class ScissorDoor implements CarDoor{

    private String description;

    public ScissorDoor(String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }

}
