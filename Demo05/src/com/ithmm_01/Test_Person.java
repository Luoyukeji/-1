package com.ithmm_01;

public class Test_Person {
    public static void main(String[] args) {

        Person p = new Person("hmm",20,"山西");
        System.out.println("姓名："+p.name+" " + "年龄: " + p.age +" "+ "地址：" +p.address);
    }
}
class Person{
    String name;
    int age;
    String address;

    public Person(){
        System.out.println("这是无参构造");
    }

    public Person(String name, int age, String address){
        this.name = name;
        this.age = age;
        this.address = address;
        System.out.println("这是带三个参数的构造");
    }
    public void sayHi(){
        System.out.println("你好，我叫hmm");
    }
}
