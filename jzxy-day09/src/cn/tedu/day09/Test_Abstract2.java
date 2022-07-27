package cn.tedu.day09;

/**
 * 抽象类中的构造方法
 */
public class Test_Abstract2 {
    public static void main(String[] args) {
        //抽象类不可以实例化


        //多态方式创建对象
        Animal2 a = new Pig2();


    }
}

/*
抽象类中可以有构造方法
 */
abstract class Animal2{
    public Animal2(){
        System.out.println("我是Animal2的构造方法");
    }

}
class Pig2 extends Animal2{
    public Pig2(){
        //super();   默认有个super()  先会执行父类构造方法
        System.out.println("我是Pig2的构造方法");
    }

}