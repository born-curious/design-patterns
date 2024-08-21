package com.practice.designpatterns.behavioral.chainofresponsibility.datastore;

import com.practice.designpatterns.behavioral.chainofresponsibility.models.User;

import java.util.Arrays;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;

import static com.practice.designpatterns.behavioral.chainofresponsibility.models.OperationType.*;

public class UserDatastore {

    private static UserDatastore instance = new UserDatastore();
    private ConcurrentHashMap<String, User> userMap;

    public static UserDatastore getInstance() {
        return instance;
    }

    private UserDatastore() {
        userMap = new ConcurrentHashMap<>();
        userMap.put("user001", new User("user001", "1234", new HashSet<>(Arrays.asList(READ))));
        userMap.put("user002", new User("user002", "1235", new HashSet<>(Arrays.asList(APPROVE))));
        userMap.put("user003", new User("user003", "1236", new HashSet<>(Arrays.asList(READ, WRITE))));
        userMap.put("user004", new User("user004", "1237", new HashSet<>(Arrays.asList(ADMIN))));
    }

    public User getUser(String key) {
        return userMap.get(key);
    }
}
