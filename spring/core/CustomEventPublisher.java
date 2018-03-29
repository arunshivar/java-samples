package spring.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

public class CustomEventPublisher implements ApplicationEventPublisherAware { /*implements ApplicationEventPublisherAware*/
    @Autowired
    private ApplicationEventPublisher publisher;

    public void setApplicationEventPublisher (ApplicationEventPublisher publisher) {
        this.publisher = publisher;
    }
    public void publish() {
        CustomEvent ce = new CustomEvent(this);
        System.out.println("Publish method");
        publisher.publishEvent(ce);
    }
}
