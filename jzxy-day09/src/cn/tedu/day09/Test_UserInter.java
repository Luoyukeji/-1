package cn.tedu.day09;

public class Test_UserInter {
    public static void main(String[] args) {
        /**
         * 子类创建对象时，默认会调用父类的构造方法
         * 目前接口实现类的父级是一个接口，但是接口没有构造方法
         * 实现类的构造方法中super()调用谁的？
         * 结论：当一个类没有明确指明父类的时候，那么默认继承顶级服了Object
         * 所以super()调用的是Object的无参构造方法
         *
         */
        Inter2 i = new Inter2Impl();//接口不能实例化，得用他的实现类来new对象
        System.out.println(i.age);
        System.out.println(Inter2.age);//静态常量，可以用类名. 调用
    }
}
interface Inter2{
    void eat(); //默认有abstract 修饰
    //接口中没有构造方法
    //接口中没有成员变量，是静态常量，可以省略不写
    int age = 20;//常量
    //public static final int age = 20;
}
class Inter2Impl implements Inter2{
    public Inter2Impl(){
        System.out.println("我是Inter2 的无参构造");
    }

    @Override
    public void eat() {
        System.out.println("重写接口的抽象吃方法");
    }
}
