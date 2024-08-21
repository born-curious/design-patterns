package com.practice.designpatterns.behavioral.observer.impl.concrete;

import com.practice.designpatterns.behavioral.observer.impl.EventListener;
import com.practice.designpatterns.behavioral.observer.models.EventType;

public class EmailEventListener implements EventListener {

    @Override
    public void listen(String log) {
        System.out.println("Event Received for Email - " + log);
    }

    @Override
    public EventType getEventType() {
        return EventType.EMAIL;
    }
}
