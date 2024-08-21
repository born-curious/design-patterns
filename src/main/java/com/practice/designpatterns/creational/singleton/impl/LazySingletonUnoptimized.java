package com.practice.designpatterns.creational.singleton.impl;

import java.util.Objects;

public class LazySingletonUnoptimized {

    private static LazySingletonUnoptimized instance = null;

    public synchronized static LazySingletonUnoptimized getInstance() {
        if(Objects.isNull(instance)) {
            instance = new LazySingletonUnoptimized();
        }
        return instance;
    }

    private LazySingletonUnoptimized() {
    }
}
