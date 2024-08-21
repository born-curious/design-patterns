package com.practice.designpatterns.behavioral.observer.impl;

import com.practice.designpatterns.behavioral.observer.models.EventType;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EventManager {

    private Map<EventType, EventListener> eventListeners;

    public EventManager() {
        eventListeners = new HashMap<>();
    }

    public void subscribe(EventListener eventListener) {
        eventListeners.put(eventListener.getEventType(), eventListener);
    }

    public void unsubscribe(EventListener eventListener) {
        eventListeners.remove(eventListener.getEventType());
    }

    public void notify(String log) {
        notify(log, eventListeners.keySet());
    }

    public void notify(String log, Set<EventType> eventTypeList) {
        for(EventType eventType: eventTypeList) {
            if(eventListeners.containsKey(eventType)) {
                eventListeners.get(eventType).listen(log);
            }
        }
    }
}
