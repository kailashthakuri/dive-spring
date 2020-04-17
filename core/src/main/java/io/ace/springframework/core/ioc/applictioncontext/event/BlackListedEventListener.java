package io.ace.springframework.core.ioc.applictioncontext.event;

import org.springframework.context.ApplicationListener;

public class BlackListedEventListener implements ApplicationListener<BlackListEvent> {
    @Override
    public void onApplicationEvent(BlackListEvent event) {
        System.out.println(event.getAddress() + ", is backlisted.");
    }
}
