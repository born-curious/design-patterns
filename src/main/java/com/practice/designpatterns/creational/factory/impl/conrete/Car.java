package com.practice.designpatterns.creational.factory.impl.conrete;

import com.practice.designpatterns.creational.factory.impl.Vehicle;

public class Car implements Vehicle {

    public void manufacture() {
        System.out.println("Manufacturing a Car!!!");
    }
}
