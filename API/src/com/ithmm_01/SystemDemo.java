package com.ithmm_01;
/*
system 常用方法
 */
public class SystemDemo {
    public static void main(String[] args) {
        //System.out.println("开始");
        //public static void exit(int status),终止当前运行的java虚拟机，非零表示异常终止
        //System.exit(0);

        //System.out.println("结束");
        //public static void currenTimeMillis(),返回当前时间，以毫秒为单位(1970-现在的毫秒)
        System.out.println(System.currentTimeMillis() / 1000 / 60 / 60 / 24 / 365);

        //计算
        long start = System.currentTimeMillis();
        for (int i = 0; i<1000000; i++){
            System.out.println(i);
        }
        long end = System.currentTimeMillis();
        System.out.println((double)(end - start)/1000);

    }
}
