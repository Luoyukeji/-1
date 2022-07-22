package com.ithmm_01;

public class Test_Doctor {
    public static void main(String[] args) {

        Doctor d = new Doctor();
        d.name = "hmm";
        d.age = 10;
        d.address = "地球";
        System.out.println("姓名："+d.name+" " + "年龄: " +d.age +" "+ "地址：" +d.address);

        d.sayHi();
    }
}
class Doctor{
    String name;
    int age;
    String address;
    public Doctor(){
        System.out.println("无参构造");
    }
    public Doctor(String name, int age, String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void sayHi(){
        System.out.println("hehe");
    }
}
