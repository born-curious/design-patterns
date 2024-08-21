package com.practice.designpatterns.creational.singleton.impl;

import java.util.Objects;

public class LazySingleton {

    private static LazySingleton instance = null;

    public static LazySingleton getInstance() {
        if(Objects.isNull(instance)) {
            synchronized (LazySingleton.class) {
                if(Objects.isNull(instance)) {
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }

    private LazySingleton() {
    }
}
