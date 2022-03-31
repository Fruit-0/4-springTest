package com.springtest.dao;

import org.springframework.beans.factory.FactoryBean;

import java.util.Objects;

public class User implements FactoryBean {

    @Override
    public Object getObject() throws Exception {
        return new Student();
    }

    @Override
    public Class<?> getObjectType() {
        return Student.class;
    }
}
