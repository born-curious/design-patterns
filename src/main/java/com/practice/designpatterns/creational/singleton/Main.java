package com.practice.designpatterns.creational.singleton;

import com.practice.designpatterns.creational.singleton.impl.EagerSingleton;
import com.practice.designpatterns.creational.singleton.impl.LazySingleton;
import com.practice.designpatterns.creational.singleton.impl.LazySingletonUnoptimized;

public class Main {

    public static void main(String[] args) {
        System.out.println(EagerSingleton.getInstance());
        System.out.println(EagerSingleton.getInstance());
        System.out.println(EagerSingleton.getInstance());
        System.out.println(LazySingleton.getInstance());
        System.out.println(LazySingleton.getInstance());
        System.out.println(LazySingleton.getInstance());
        System.out.println(LazySingletonUnoptimized.getInstance());
        System.out.println(LazySingletonUnoptimized.getInstance());
        System.out.println(LazySingletonUnoptimized.getInstance());
    }
}
