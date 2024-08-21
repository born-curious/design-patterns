package com.practice.designpatterns.behavioral.chainofresponsibility.impl;
public interface Handler<T, U> {

    void setNext(Handler<T, U> handler);

    void handle(U request);
}
