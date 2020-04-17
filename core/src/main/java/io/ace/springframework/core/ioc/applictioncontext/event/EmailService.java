package io.ace.springframework.core.ioc.applictioncontext.event;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

import java.util.List;

public class EmailService implements ApplicationEventPublisherAware {

    private List<String> blackListAddress;
    private ApplicationEventPublisher applicationEventPublisher;

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }

    public void setBlackList(List<String> blackListAddress) {
        this.blackListAddress = blackListAddress;
    }

    public void sendEmail(String address, String content) {
        if (this.blackListAddress.contains(address)) {
            this.applicationEventPublisher.publishEvent(new BlackListEvent(this, address, content));
            return;
        }
        // send mail
    }
}
