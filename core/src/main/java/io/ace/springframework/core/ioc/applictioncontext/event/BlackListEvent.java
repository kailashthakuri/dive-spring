package io.ace.springframework.core.ioc.applictioncontext.event;

import org.springframework.context.ApplicationEvent;

public class BlackListEvent extends ApplicationEvent {
    private final String content;
    private final String address;

    public BlackListEvent(Object source, String address, String content) {
        super(source);
        this.address = address;
        this.content = content;
    }

    @Override
    public String toString() {
        return "You are black listed dude!";
    }

    public String getContent() {
        return content;
    }

    public String getAddress() {
        return address;
    }
}
