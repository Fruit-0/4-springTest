package com.springtest;
import com.springtest.dao.Student;
import com.springtest.dao.Woman;
import org.junit.Test;
import com.springtest.dao.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;
import java.util.Map;

public class SpringTest {

    @Test
    public void springBeanTest1() throws Exception {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean1.xml");

        Map<String, User> beansOfType = applicationContext.getBeansOfType(User.class);
    System.out.println(beansOfType.toString());

        // 获取容器中的bean数组
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
    System.out.println(Arrays.toString(beanDefinitionNames));

                Student userBean = applicationContext.getBean("userBean", Student.class);
        System.out.println(userBean);
        Student userBean1 = applicationContext.getBean("userBean", Student.class);
        System.out.println(userBean1);
        Student userBean2 = applicationContext.getBean("userBean", Student.class);
        System.out.println(userBean2);
        Student userBean3 = applicationContext.getBean("userBean", Student.class);
        System.out.println(userBean3);



    }

    @Test
    public void springBeanTest2(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean2.xml");
        Woman bean = applicationContext.getBean(Woman.class);
        bean.initWoman();

    }

}
