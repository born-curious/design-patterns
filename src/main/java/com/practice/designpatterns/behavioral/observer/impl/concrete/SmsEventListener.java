package com.practice.designpatterns.behavioral.observer.impl.concrete;

import com.practice.designpatterns.behavioral.observer.impl.EventListener;
import com.practice.designpatterns.behavioral.observer.models.EventType;

public class SmsEventListener implements EventListener {

    @Override
    public void listen(String log) {
        System.out.println("Event Received for SMS - " + log);
    }

    @Override
    public EventType getEventType() {
        return EventType.SMS;
    }
}
