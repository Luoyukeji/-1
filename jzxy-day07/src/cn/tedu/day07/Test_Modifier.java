package cn.tedu.day07;
/*
  访问修饰符的演示
 */
public class Test_Modifier {
    public static void main(String[] args) {

    }
}
class Aoo{
    public int a;//任何类
    protected int b;//本类，子类，同胞类
    int c;//本类，同胞类
    private int d;//本类
    public void show(){
        a = 1;
        b = 2;
        c = 3;
        d = 4;
    }
}
class Boo{ //同胞类
    void show(){
        Aoo o = new Aoo();
        o.a = 1;
        o.b = 2;
        o.c = 3;
        //o.d = 4;'d' has private access in 'cn.tedu.day07.Aoo'
    }

}
