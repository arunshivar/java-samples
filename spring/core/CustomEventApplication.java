package spring.core;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomEventApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("spring/core/resources/customevent.xml");

        CustomEventPublisher customEventPublisher = (CustomEventPublisher) context.getBean("customEventPublisher");

        customEventPublisher.publish();
         // customEventPublisher.publish();
    }
}

