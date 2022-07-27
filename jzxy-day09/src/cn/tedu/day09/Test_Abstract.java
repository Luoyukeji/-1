package cn.tedu.day09;

public class Test_Abstract {
    public static void main(String[] args) {
        Animal a = new Pig();//父类引用指向子类对象
        a.eat();
        a.fly();//调用父类抽象方法，打印子类内容

    }
}
//抽象类
abstract class Animal{
    //创建普通方法
    public void eat(){
        System.out.println("民以食为天");
    }
    public void play(){
        System.out.println("打游戏");
    }

    public abstract void fly();//抽象方法
    public abstract void fly2();

}

//abstract修饰子类   2. 重写父类里面的抽象方法
 class Pig extends Animal{

//    //重写父类方法
//    @Override
//    public void eat() {
//        System.out.println("我爱吃饲料");
//
//    }
//
//    @Override
//    public void play() {
//
//    }

    @Override
    public void fly() {
        System.out.println("猪能飞");
    }

    @Override
    public void fly2() {
        System.out.println("我是父类第二个抽象方法的实现");
    }
}