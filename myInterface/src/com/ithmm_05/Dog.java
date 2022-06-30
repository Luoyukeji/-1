package com.ithmm_05;

public class Dog extends Animal implements Jumpping{
    //构造方法，无参构造，带参构造

    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }


    //重写吃饭方法

    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }
    //重写跳高方法

    @Override
    public void jump() {
        System.out.println("狗跳高");
    }
}
