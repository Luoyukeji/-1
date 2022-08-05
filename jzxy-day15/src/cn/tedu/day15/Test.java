package cn.tedu.day15;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
//        int arr [] ={1,2,3};
//
//        try {
//            System.out.println(arr[3]);//ArrayIndexOutOfBoundsException
//            //运行时异常：数组下标越界
//        }catch(Exception e){
//            e.printStackTrace();
//        }
//        //编译时异常：因为语法不规范导致的，如果不处理，编译无法通过
//
//        //Throwable 类是 Java 语言中所有错误或异常的超类。、
//        // 只有当对象是此类（或其子类之一）的实例时，才能通过 Java 虚拟机或者 Java throw 语句抛出。
//        // 类似地，只有此类或其子类之一才可以是 catch 子句中的参数类型。
//    }

        try {
            System.out.println("请输入一个整数：");
            Scanner sc = new Scanner(System.in);
            int s = sc.nextInt();
            System.out.println(s);

        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("后面的程序可以正常运行");
    }
}
