package io.ace.springframework.core.ioc.applictioncontext.event.annotation;

import io.ace.springframework.core.ioc.applictioncontext.event.BlackListEvent;
import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;

public class AnnotationBlackListEventListener {

    private String notificationAddress;

    public String getNotificationAddress() {
        return notificationAddress;
    }

    public void setNotificationAddress(String notificationAddress) {
        this.notificationAddress = notificationAddress;
    }

    @EventListener({BlackListEvent.class})
    @Order(13)
    public void listen(BlackListEvent event) {
        System.out.println(event.getAddress() + ", you are black listed.");
    }
}
