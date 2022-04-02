package com.springtest.dao;

import org.springframework.beans.factory.FactoryBean;

/**
 * @Description: 工厂bean需要实现FactoryBean接口 getObject方法返回的就是工厂生厂的bean对象
 * @Author: YX-WJ
 * @Date: 2022/3/31 17:54
 * @return: null
 **/
public class User implements FactoryBean {

    @Override
    public Object getObject() throws Exception {
        return Class.forName("com.springtest.dao.Student").newInstance();
        //return new Student();
    }

    @Override
    public Class<?> getObjectType() {
        return Student.class;
    }
}
