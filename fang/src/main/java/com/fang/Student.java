package com.fang;

/**
 * @Author Fang
 * @create 2021/7/2 2:13
 */
public class Student extends Person{
    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
