package com.ithmm_08;

/*
      测试类
 */
public class AnimalDemo {
    public static void main(String[] args) {
        //创建对象采用多态方法
        Animal c = new Cat();
        c.setName("dudu");
        c.setAge(5);
        System.out.println(c.getName() + "," + c.getAge());
        c.eat();

        c = new Cat("yangyang ", 3);
        System.out.println(c.getName() + "," + c.getAge());
        c.eat();

        Animal d = new Dog();
        d.setName("huihui");
        d.setAge(10);
        d.eat();
        System.out.println(d.getName() + "," + d.getAge());
        d = new Dog("huihui",10);
        d.eat();
        System.out.println(d.getName() + "," + d.getAge());

    }
}
