package com.ithmm_02;
/*
   测试类
 */
public class InterfaceDemo {
    public static void main(String[] args) {
        Interface i = new InterImpl();//多态方法
        //接口中的成员变量默认被final修饰，接口里面没有成员变量，默认为常量，且被静态修饰
        System.out.println(i.num);
        System.out.println(i.num2);
        System.out.println(Interface.num);//可以通过接口名直接访问
    }
}
