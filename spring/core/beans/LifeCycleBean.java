package spring.core.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class LifeCycleBean implements InitializingBean, DisposableBean, BeanPostProcessor {

    private Student student;
    private int id;
    public void setStudent(Student student) {
        System.out.println("Setter injection "+student.getName());
        this.student = student;
    }

    /*Is called when bean instantiated without any constructor-arg*/
    LifeCycleBean() {
        System.out.println("LifeCycleBean no-arg constructor");
    }

    LifeCycleBean(int id) {
        System.out.println("LifeCycleBean int Arg constructor");
        this.id = id;
    }

    LifeCycleBean(Student student) {
        System.out.println("LifeCycleBean studnet Arg constructor");
        this.student = student;
    }

    LifeCycleBean(int id,Student student) {
        System.out.println("LifeCycleBean int arg, studnet Arg constructor");
        this.id = id;
        this.student = student;
    }

    public void init(){
        System.out.println("Init method with init-method attribute");
    }

    public void myDestroy(){
        System.out.println("Init method with destroy-method attribute");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("LifeCycleBean destroy annotation method");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("LifeCycleBean after properties set annotation method");
    }

    public void showDetails() {
        System.out.println("ID "+id);
        this.student.displayInfo();
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("BeforeInitialization : " + beanName);
        return null;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("AfterInitialization : " + beanName);
        return null;
    }
}
