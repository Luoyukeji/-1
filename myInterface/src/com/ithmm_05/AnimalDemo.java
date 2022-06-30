package com.ithmm_05;
/*
    测试类
    总结：接口只能掉借口里的方法，抽象类只能掉抽象类里的方法
 */
public class AnimalDemo {
    public static void main(String[] args) {
        //创建对象调用方法
        //接口来做
        Jumpping j = new Cat();
        j.jump();
        System.out.println("-------------------");
        //抽象类
        Animal a= new Cat();

        a.setName("加菲猫");
        a.setAge(6);
        System.out.println(a.getName()+","+a.getAge());
        a.eat();

        a =new Cat("加菲猫",5);
        System.out.println(a.getName()+","+a.getAge());
        a.eat();


        System.out.println("--------------------");
        //常用
        Cat c = new Cat();
        c.setName("加菲猫");
        c.setAge(6);
        System.out.println(c.getName()+","+c.getAge());
        c.eat();
        c.jump();


    }
}
