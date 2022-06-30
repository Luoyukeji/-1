package com.ithmm_01;
//类和接口之间不能用继承，这里采用implements实现的意思，类实现接口
public class Cat implements Jumpping {
    @Override
    public void jump() {
        System.out.println("猫猫跳的高");
    }
}
