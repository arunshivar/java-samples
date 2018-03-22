package spring.core;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import spring.core.beans.LifeCycleBean;

public class LifeCycleApplication {

    public static void main(String[] args) {

        Resource resource = new ClassPathResource("spring/core/resources/beans.xml");
        BeanFactory beanFactory = new XmlBeanFactory(resource);

        LifeCycleBean lifeCycleBean = (LifeCycleBean) beanFactory.getBean("lifeCycleBean"); // LifeCycleBean no-arg constructor
        System.out.println();
        LifeCycleBean lifeCycleBean1 = (LifeCycleBean) beanFactory.getBean("lifeCycleBean1"); // LifeCycleBean int arg, studnet Arg constructor, // LifeCycleBean after properties set method
        System.out.println();
        LifeCycleBean lifeCycleBean2 = (LifeCycleBean) beanFactory.getBean("lifeCycleBean2"); // LifeCycleBean no-arg constructor//  Setter injection Arun Shiva //  LifeCycleBean after properties set annotation method
        lifeCycleBean2.showDetails();
        System.out.println();
        /*
            Setter injection overrides constructor injection
            init-method = init invokes afterproperties method and init method
            init-method is post init method
            destroy-method is post destroy method

        */
        LifeCycleBean lifeCycleBean3 = (LifeCycleBean) beanFactory.getBean("lifeCycleBean3"); // LifeCycleBean studnet Arg constructor // Setter injection Ram // LifeCycleBean after properties set annotation method
        lifeCycleBean3.showDetails();

    }
}
