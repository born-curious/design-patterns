package com.practice.designpatterns.behavioral.observer;

import com.practice.designpatterns.behavioral.observer.impl.EventListener;
import com.practice.designpatterns.behavioral.observer.impl.EventManager;
import com.practice.designpatterns.behavioral.observer.impl.concrete.EmailEventListener;
import com.practice.designpatterns.behavioral.observer.impl.concrete.SmsEventListener;

public class Main {

    public static void main(String[] args) {
        EventListener emailEventListener = new EmailEventListener();
        EventListener smsEventListener = new SmsEventListener();

        EventManager eventManager = new EventManager();
        eventManager.subscribe(emailEventListener);
        eventManager.subscribe(smsEventListener);
        eventManager.notify("First Log");

        eventManager.unsubscribe(smsEventListener);
        eventManager.notify("Second Log");

        eventManager.unsubscribe(emailEventListener);
        eventManager.notify("Third Log");
    }
}
