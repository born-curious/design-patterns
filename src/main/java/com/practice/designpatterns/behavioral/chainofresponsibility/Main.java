package com.practice.designpatterns.behavioral.chainofresponsibility;

import com.practice.designpatterns.behavioral.chainofresponsibility.impl.Handler;
import com.practice.designpatterns.behavioral.chainofresponsibility.impl.chain.Chain;
import com.practice.designpatterns.behavioral.chainofresponsibility.impl.concrete.AuthenticationHandler;
import com.practice.designpatterns.behavioral.chainofresponsibility.impl.concrete.AuthorizationHandler;
import com.practice.designpatterns.behavioral.chainofresponsibility.models.OperationType;
import com.practice.designpatterns.behavioral.chainofresponsibility.models.User;
import com.practice.designpatterns.behavioral.chainofresponsibility.models.UserRequest;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Handler<User, UserRequest> authenticationHandler = new AuthenticationHandler();
        Handler<User, UserRequest> authorizationHandler = new AuthorizationHandler();

        Chain<User, UserRequest> chain = new Chain<>(Arrays.asList(authenticationHandler, authorizationHandler));

        UserRequest r = new UserRequest("user001", "123", OperationType.WRITE);
        UserRequest r1 = new UserRequest("user001", "1234", OperationType.WRITE);
        UserRequest r2 = new UserRequest("user001", "1234", OperationType.READ);

        try {
            chain.handle(r);
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            chain.handle(r1);
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
        chain.handle(r2);
    }
}
