package com.ithmm_01;
/*
     测试类
 */
public class InnerDemo {
    public static void main(String[] args) {
        //创建内部类对象，并调用方法
        //格式：外部类名.内部类名  对象名 = 外部类对象.内部类对象;
        //Outer.Innter oi = new Outer().new Innter();
        //oi.show();
        Outer o = new Outer();//创建外部类对象，调用method方法，间接访问成员内部类私有属性
        o.method();

    }
}
