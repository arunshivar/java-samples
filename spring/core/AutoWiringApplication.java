package spring.core;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import spring.core.beans.Customer;

public class AutoWiringApplication {

    public static void main(String[] args) {
        Resource resource = new ClassPathResource("spring/core/resources/MultipleConfiguration.xml");
        BeanFactory beanFactory = new XmlBeanFactory(resource);

        Customer customer = (Customer) beanFactory.getBean("customer");
        customer.showDetails();

        // Customer customer1 = (Customer) beanFactory.getBean("customer1");
        // customer1.showDetails();
    }
}
