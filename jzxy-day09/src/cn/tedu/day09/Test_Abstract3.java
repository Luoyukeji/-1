package cn.tedu.day09;

public class Test_Abstract3 {
    public static void main(String[] args) {
        Fruit f = new Apple();
        f.eat();//我是子类的普通方法
        f.eat2();//我是重写之后的方法

    }
}
abstract class Fruit{
    int sum = 10;//抽象类可以有成员变量和常量
    final int sum2 = 20;//常量必须初始化，值不变
    final String name = "香蕉";

    /*

    抽象类不可以创建对象，
    如果不想让外界创建本类对象，可以吧普通类声明为抽象类
     */
    public void eat(){
        System.out.println("我是父类普通方法");
    }

    public abstract void eat2();
}

class Apple extends Fruit{
    public void eat(){
        System.out.println("我是子类的普通方法");
    }

    @Override
    public void eat2() {
        System.out.println("我是重写之后的方法");
    }
}