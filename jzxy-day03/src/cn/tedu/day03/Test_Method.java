package cn.tedu.day03;

public class Test_Method {
    public static void main(String[] args) {
        ;
        method();
        method1(1,2);
        System.out.println(add(10,50));
    }
    public static void method(){
        System.out.println("这是一个无参无返回值的方法");
    }

    public static void  method1(int x,int y){
        System.out.println("这是一个有参无返回值方法");

    }
    //无参有返回值
    public static double method2(){
        return 2.0;
    }
    //有参有返回值
    public static int add(int x,int y) {
        return x + y;
    }
}
