package com.springtest;
import com.springtest.dao.Student;
import org.junit.Test;
import com.springtest.dao.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {

    @Test
    public void springBeanTest1(){

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean1.xml");
        Student userBean = applicationContext.getBean("userBean", Student.class);
        System.out.println(userBean);
    }

}
