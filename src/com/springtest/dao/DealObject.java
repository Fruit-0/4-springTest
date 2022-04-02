package com.springtest.dao;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.NamedBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @Description: 实现 BeanPostProcessor 接口后，可以创建通用的前置处理器和后置处理器，用于在执行bean的初始化方法的之前和之后执行
 * @Author: YX-WJ
 * @Date: 2022/4/1 14:46
 * @return: null
 **/
public class DealObject implements BeanPostProcessor {


    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println(beanName);
        //定向筛选执行的bean执行逻辑
        if ("manBean".equals(beanName)){
            System.out.println(beanName+"执行了bean的前置初始化处理器11111");
        }else {
            System.out.println(beanName+"执行了bean的前置初始化处理器");
        }

        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        //定向筛选执行的bean执行逻辑
        System.out.println(beanName);
        if ("manBean".equals(beanName)){
            System.out.println(beanName+"执行了bean的后置初始化处理器11111");
        }else {
            System.out.println(beanName+"执行了bean的后置初始化处理器");
        }
        return bean;
    }
}
