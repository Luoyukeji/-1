package cn.tedu.day08;

/**
 * 测试代码块之间的关系
 * 执行顺序:  静态代码块--》构造代码块--》构造方法--》局部代码块--》普通方法
 */
public class Test_Block {
    public static void main(String[] args) {
        /*
        z在创建对象之前，会自动执行静态代码块，静态代码块优先于对象进行加载
        在创建对象时，会调用构造代码块和构造方法,构造代码块优先执行
        当通过对象调用方法时，若方法里有局部代码块，局部代码块才会被执行
         */
        Person  p = new Person();

        //我是静态代码块
        //我是构造代码块
        //我是构造方法
        p.study();
        //我是静态代码块
        //我是构造代码块
        //我是构造方法
        //我是局部代码块
        //我是普通方法
        Person p1 = new Person();//当再去new对象，静态代码块不会加载


    }
}
class Person{
    //创建静态代码块，类里方法外
    static{
        System.out.println("我是静态代码块");
    }

    /**
     * 构造代码块
     * 位置：类里方法外
     * 触发节点：随着类的加载而加载，只加载一次
     */
    //构造代码块，类里方法外
    {
        System.out.println("我是构造代码块");
    }
    //构造方法
    //private Person(){}  单例模式
    public Person(){
        System.out.println("我是构造方法");
    }
    //普通方法
    public void study(){

        {
            System.out.println("我是局部代码块");
        }
        System.out.println("我是普通方法");
        //局部代码块
//        1. 位置：放在方法里边的代码块
//        2.作用：一般作用于控制变量的作用范围，除了花括号就失效
//        3.注意事项：变量的作用范围越小越好，成员变量会存在线程问题
    }
}
