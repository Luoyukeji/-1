package com.ithmm_01;

public class JumppingDemo {
    public static void main(String[] args) {
        //接口也是抽象类，不能实例化，这里采用多态方法实例化
           Jumpping j = new Cat();
           j.jump();
    }
}
