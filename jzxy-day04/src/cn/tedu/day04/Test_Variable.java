package cn.tedu.day04;

public class Test_Variable {//多变的，变量

    //定义成员变量
    static int count;
    static double d;
    static boolean b;
    static String s ;

    public static void main(String[] args) {
        //定义局部变量
        int sun  = 100;
        System.out.println(sun);//100,变量的就近原则，使用的是离自己最近的值
        System.out.println(count);//0
        System.out.println(d);//0.0
        System.out.println(b);//false
        System.out.println(s);//null


        int arr[]= new int[5];
        System.out.println(arr[0]);
    }
}
