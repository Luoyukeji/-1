package cn.tedu.day08;

public class Demo1 {
    public static void main(String[] args) {
        Dog d = new Dog();
        System.out.println(d.sum);
        d.eat();//子类重写父类方法
        System.out.println("--------------");
        Animal a = new Dog();
        System.out.println(a.sum);//多态中成员变量使用的是父类的
        a.eat();//多态中成员方法使用的是父类的声明，实现的是子类中的内容

        a.play();//玩撒
    }
}
class Animal{

    int sum = 1;
    public void eat(){
        System.out.println("动物可以爬");
    }
    public static void play(){
        System.out.println("玩撒");
    }
}
class Dog extends Animal{
    int sum = 10;
    @Override
    public void eat() {
        System.out.println("狗跑的贼快");
    }
//    public static void play(){//静态代码块属于类，这个不属于重写，只是方法名相同
//
//    }
}
