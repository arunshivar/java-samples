package spring.core;

import org.springframework.context.ApplicationEvent;

public class CustomEvent extends ApplicationEvent {
    public CustomEvent(Object source) {
        super(source);
        System.out.println("Custom event constructor");
    }
    public String eventMethod(){
        System.out.println("Custom event event method");
        return "My Custom Event";
    }
}