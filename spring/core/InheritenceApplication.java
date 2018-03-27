package spring.core;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import spring.core.beans.Person;

public class InheritenceApplication {
    public static void main(String[] args) {

        Resource resource = new ClassPathResource("spring/core/resources/beans.xml");
        BeanFactory beanFactory = new XmlBeanFactory(resource);

        Person person = (Person) beanFactory.getBean("childPersonBean");
        System.out.println(person.toString());
    }
}
