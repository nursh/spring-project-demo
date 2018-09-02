package com.nursh.springdemo;

public class RacingCar implements Car {

    private CarDoor door;

    public RacingCar(CarDoor door) {
        this.door = door;
    }

    @Override
    public String getDoorStyles() {
        return door.getDescription();
    }
}
