package com.ithmm_01;

public class Test_Student {
    public static void main(String[] args) {
        Student s = new Student("hmm",20,"山西",2102);
        System.out.println("姓名："+s.name+" " + "年龄: " + s.age +" "+ "地址：" +s.address+" "+"学号： "+s.stuId);

        s.sayHi();
    }
}
class Student{
    String name;
    int age;
    String address;
    int stuId;


    public Student(){

        System.out.println("无参构造");
    }
    public Student(String name, int age, String address,int stuId) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.stuId  = stuId;
    }
    public void sayHi(){
        System.out.println("我是学生hmm");
    }
}
