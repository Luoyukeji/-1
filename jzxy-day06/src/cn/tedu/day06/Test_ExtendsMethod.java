package cn.tedu.day06;

/**
 * 继承中的成员方法的使用
 */

public class Test_ExtendsMethod {
    public static void main(String[] args) {
        Father2 f = new Father2();
        f.eat();

        Son2 s = new Son2();
        s.eat();//儿子吃奶
        s.learn();
    }
}
class Father2{

    public void eat() {
        System.out.println("吃嘛嘛香");
    }
}
class Son2 extends Father2{

    @Override
    public void eat() {
        System.out.println("儿子吃奶");
    }
    public void learn() {
        System.out.println("学习打游戏");
    }
}