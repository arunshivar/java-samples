package spring.core;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import spring.core.beans.EmailService;
import spring.core.beans.Student;

public class EmailApplication {

    public static void main(String[] args) {
        Resource resource = new ClassPathResource("spring/core/resources/beans.xml");
        BeanFactory beanFactory = new XmlBeanFactory(resource);

        EmailService emailService = (EmailService) beanFactory.getBean("emailService");
        emailService.sendMessage("Account Verified", "arunshiva@gmail.com");

        System.out.println(emailService.getStudent().getName());
    }


}
