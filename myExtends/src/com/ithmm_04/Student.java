package com.ithmm_04;

public class Student {
    private String name;
    private int age;
    //无参构造
    public Student() {
    }

    public Student(String name, int age) {
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
    public void learn() {
        System.out.println("好好学习，天天向上");
    }
}
