package com.practice.designpatterns.creational.factory;

import com.practice.designpatterns.creational.factory.impl.VehicleFactory;
import com.practice.designpatterns.creational.factory.models.VehicleType;

public class Main {

    public static void main(String[] args) {
        VehicleFactory vehicleFactory = new VehicleFactory();
        vehicleFactory.createVehicle(VehicleType.CAR).manufacture();
        vehicleFactory.createVehicle(VehicleType.MOTORCYCLE).manufacture();
        vehicleFactory.createVehicle(VehicleType.TRUCK).manufacture();
    }
}
