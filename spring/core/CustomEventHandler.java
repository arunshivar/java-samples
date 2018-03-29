package spring.core;

import org.springframework.context.ApplicationListener;

public class CustomEventHandler implements ApplicationListener<CustomEvent> {
    public void onApplicationEvent(CustomEvent event) {
        System.out.println("Event Handler onApplicationEvent");
        System.out.println(event.eventMethod());
    }
}