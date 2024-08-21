package com.practice.designpatterns.behavioral.chainofresponsibility.models;


public class UserRequest {
    private String id;
    private String password;
    private OperationType operationType;

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

    public OperationType getOperationType() {
        return operationType;
    }

    public void setOperationType(OperationType operationType) {
        this.operationType = operationType;
    }

    public UserRequest(String id, String password, OperationType operationType) {
        this.id = id;
        this.password = password;
        this.operationType = operationType;
    }
}
