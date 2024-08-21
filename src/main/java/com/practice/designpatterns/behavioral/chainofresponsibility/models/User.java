package com.practice.designpatterns.behavioral.chainofresponsibility.models;


import java.util.Set;

public class User {
    private String id;
    private String password;
    private Set<OperationType> operationTypes;

    public User(String id, String password, Set<OperationType> operationTypes) {
        this.id = id;
        this.password = password;
        this.operationTypes = operationTypes;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<OperationType> getOperationTypes() {
        return operationTypes;
    }

    public void setOperationTypes(Set<OperationType> operationTypes) {
        this.operationTypes = operationTypes;
    }
}
