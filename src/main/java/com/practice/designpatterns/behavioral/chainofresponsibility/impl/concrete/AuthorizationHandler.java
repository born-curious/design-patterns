package com.practice.designpatterns.behavioral.chainofresponsibility.impl.concrete;

import com.practice.designpatterns.behavioral.chainofresponsibility.datastore.UserDatastore;
import com.practice.designpatterns.behavioral.chainofresponsibility.impl.BaseHandler;
import com.practice.designpatterns.behavioral.chainofresponsibility.models.User;
import com.practice.designpatterns.behavioral.chainofresponsibility.models.UserRequest;

import java.util.Objects;

public class AuthorizationHandler extends BaseHandler {

    private final UserDatastore userDatastore;

    public AuthorizationHandler() {
        super();
        this.userDatastore = UserDatastore.getInstance();
    }

    @Override
    protected void execute(UserRequest userRequest) {
        User user = userDatastore.getUser(userRequest.getId());
        if(Objects.isNull(user)) {
            throw new RuntimeException("User Doesn't Exist!!");
        }
        if(!user.getOperationTypes().contains(userRequest.getOperationType())) {
            throw new RuntimeException("User Doesn't have permission to execute the operation!!");
        }
    }
}
