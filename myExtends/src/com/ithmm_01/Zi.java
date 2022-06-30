package com.ithmm_01;

public class Zi extends Fu{
    public int age =25;

  public void show(){
      int age = 30;
      System.out.println(age);

      //访问本类的成员变量age(this 方法)
      System.out.println(this.age);

      //访问父类的成员变量age(super方法)
      System.out.println(super.age);
  }
}
