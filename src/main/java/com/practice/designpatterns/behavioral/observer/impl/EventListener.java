package com.practice.designpatterns.behavioral.observer.impl;

import com.practice.designpatterns.behavioral.observer.models.EventType;

public interface EventListener {

    void listen(String log);

    EventType getEventType();
}
