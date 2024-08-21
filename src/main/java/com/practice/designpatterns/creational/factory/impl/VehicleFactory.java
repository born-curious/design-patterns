package com.practice.designpatterns.creational.factory.impl;

import com.practice.designpatterns.creational.factory.impl.conrete.Car;
import com.practice.designpatterns.creational.factory.impl.conrete.Motorcycle;
import com.practice.designpatterns.creational.factory.impl.conrete.Truck;
import com.practice.designpatterns.creational.factory.models.VehicleType;

public class VehicleFactory {

    public Vehicle createVehicle(VehicleType vehicleType) {
        Vehicle vehicle = null;
        switch (vehicleType) {
            case CAR -> vehicle = new Car();
            case MOTORCYCLE -> vehicle = new Motorcycle();
            case TRUCK -> vehicle = new Truck();
            default -> throw new RuntimeException("Unsupported VehicleType - " + vehicleType);
        }
        return vehicle;
    }
}
