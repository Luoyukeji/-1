package cn.tedu.day06;

public class Test_SuperDemo {
    public static void main(String[] args) {

        Boo b = new Boo();
        Son s = new Son();
        Doo d =new Doo();


    }
}
class Aoo{
    public Aoo() {
        System.out.println("我是超类Aoo的构造方法");
    }
}
class Boo extends Aoo {
    public Boo() {
        super();//默认的
        System.out.println("我是派生类Boo的构造方法");

    }
}
class Coo{
    public  Coo(int i){

    }
}
class Doo extends Coo{
    public Doo(){
        super(5);
    }
}
class Father {
    public Father(){
        System.out.println("我是父类的无参构造");
    }
    public Father(String s ){
        System.out.println("我是父类的有参构造" + s);
    }
}
class Son extends Father{
    public Son(){
        super("哥斯拉");//访问超类的构造方法   // 执行  System.out.println("我是父类的有参构造" + s);
        System.out.println("我是子类无参构造方法");
    }
}