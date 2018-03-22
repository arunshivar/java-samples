package spring.core;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import spring.core.beans.Question;

public class QuestionApplication {

    public static void main(String[] args) {

        Resource resource = new ClassPathResource("spring/core/resources/beans.xml");
        BeanFactory beanFactory = new XmlBeanFactory(resource);

        Question question = (Question) beanFactory.getBean("question");
        question.showDetails();
    }
}
