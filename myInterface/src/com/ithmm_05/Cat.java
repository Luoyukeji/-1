package com.ithmm_05;

public class Cat extends Animal implements Jumpping{
//给出构造方法

    public Cat() {
    }

    public Cat(String name, int age) {
        super(name, age);
    }

    //重写吃饭方法

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
//重写跳高方法
    @Override
    public void jump() {
        System.out.println("猫跳高");
    }
}
