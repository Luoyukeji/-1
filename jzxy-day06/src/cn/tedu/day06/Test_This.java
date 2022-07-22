package cn.tedu.day06;

public class Test_This {
    public static void main(String[] args) {

        Animal animal = new Animal();
        Animal a = new Animal("旺财");

        a.name = "旺财";

    }
}
class Animal{
    String name;
    int age;
    String color;

    public Animal(){
        this("hh");
        //this 可以进行构造方法之间的调用
        //但是调用是单向的，不是双向的，双向来回调会陷入死循环
        //规定this关键字必须放在构造方法的第一行
        System.out.println("无参构造");
    }
    public Animal(String name){
        //this();
        this.name = name;
        System.out.println("我是修狗"+name);
    }
}
