package com.practice.designpatterns.behavioral.chainofresponsibility.impl;

import com.practice.designpatterns.behavioral.chainofresponsibility.models.User;
import com.practice.designpatterns.behavioral.chainofresponsibility.models.UserRequest;

import java.util.Objects;

public abstract class BaseHandler implements Handler<User, UserRequest> {

    Handler<User, UserRequest> next;

    @Override
    public void setNext(Handler<User, UserRequest> handler) {
        next = handler;
    }

    @Override
    public void handle(UserRequest userRequest) {
        execute(userRequest);
        if(Objects.nonNull(next)) {
            next.handle(userRequest);
        }
    }

    protected abstract void execute(UserRequest userRequest);
}
