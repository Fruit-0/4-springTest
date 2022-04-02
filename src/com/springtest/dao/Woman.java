package com.springtest.dao;

import java.util.Objects;

public class Woman {
    private String name;
    private int age;

    public Woman() {
    }

    public Woman(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Man{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Woman man = (Woman) o;
        return age == man.age && Objects.equals(name, man.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public void initWoman(){
        System.out.println("初始化Woman");
    }
    public void destroyWoman(){
        System.out.println("销毁Woman");
    }
}
