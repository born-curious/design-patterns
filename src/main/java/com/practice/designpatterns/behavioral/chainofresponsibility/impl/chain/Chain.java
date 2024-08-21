package com.practice.designpatterns.behavioral.chainofresponsibility.impl.chain;

import com.practice.designpatterns.behavioral.chainofresponsibility.impl.Handler;

import java.util.List;

public class Chain<T, U> {

    private Handler<T, U> firstHandler;

    public Chain(List<Handler<T, U>> handlers) {
        for(int i=1; i<handlers.size(); i++){
            handlers.get(i-1).setNext(handlers.get(i));
        }
        firstHandler = handlers.get(0);
    }

    public void handle(U request) {
        firstHandler.handle(request);
    }
}
