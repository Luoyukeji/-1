package cn.tedu.day06;

/**
 * 测试继承中成员变量的使用
 */
public class Test_ExtendsDemo {
    public static void main(String[] args) {
        Son1 s = new Son1();
        s.eat();

    }
}
class Father1 {
   int sum = 20;
   int count = 2000;
   public void earnMoney(){
       int count  = 1000;
       System.out.println(count);//1000,使用的是就近原则，局部变量的count
       System.out.println(this.count);//2000
   }
}
class Son1 extends Father1{
    int sum = 30;
    public void eat(){
        //定义子类的局部变量
        int sum = 10;

        System.out.println(sum);//10086
        System.out.println(this.sum);//30
        System.out.println(super.sum);//20
        System.out.println("吃嘛嘛香");
    }
}

