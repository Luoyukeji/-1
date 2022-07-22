package cn.tedu.day06;

public class Test_Extends {
  public static void main(String[] args) {
    Cat c = new Cat();
    c.eat();
    System.out.println("----------");

    DingDang d = new DingDang();
    d.eat();
    d.fyl();
    d.play();
  }
}
class Animal1{
  public void eat(){
    System.out.println("eat");
  }
}
class Cat extends Animal1{
  public void play(){
    System.out.println("cat吃鱼");
  }
}
class DingDang extends Cat{

  public void fyl() {
    System.out.println("叮当猫带大熊飞");
  }
}