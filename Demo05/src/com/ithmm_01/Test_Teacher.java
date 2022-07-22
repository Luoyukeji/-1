package com.ithmm_01;

public class Test_Teacher {
    public static void main(String[] args) {

        Teacher t = new Teacher();
        t.name="hmm";
        t.age=20;
        t.address="上海";
        t.salary =20000;
        System.out.println("姓名："+t.name+" " + "年龄: " + t.age +" "+ "地址:" +t.address+" "+"工资: "+t.salary);
        t.sayHi();
    }
}
class Teacher{
    String name;
    int age;
    String address;
    int salary;//工资


    public Teacher(){
        //无参构造
    }

    public Teacher(String name, int age, String address, int salary){
        this.name = name;
        this.age = age;
        this.address =address;
        this.salary = salary;
    }
    public void sayHi(){
        System.out.println("sayHi");
    }
}