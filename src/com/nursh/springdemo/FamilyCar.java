package com.nursh.springdemo;

public class FamilyCar implements Car {

    private CarDoor door;

    public FamilyCar(CarDoor door) {
        this.door = door;
    }

    @Override
    public String getDoorStyles() {
        return door.getDescription();
    }
}
