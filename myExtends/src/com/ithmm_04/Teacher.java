package com.ithmm_04;

public class Teacher {
    private String name;
    private int age;
    //无参构造
    public Teacher (){
    }
    //带参构造
    public Teacher (String name, int age){
        this.name = name;
        this.age = age;
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
    public void teach(){
        System.out.println("用爱育人，助力学生完成梦想");
    }
}
