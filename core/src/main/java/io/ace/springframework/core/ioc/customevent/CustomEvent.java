package io.ace.springframework.core.ioc.customevent;

import org.springframework.context.ApplicationEvent;

public class CustomEvent extends ApplicationEvent {
        public CustomEvent(Object source) {
        super(source);
    }

    @Override
    public String toString() {
        return "This is Custom Event";
    }
}
