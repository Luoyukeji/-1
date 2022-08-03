package com.ithmm_01;
/*
try
{
   // 可能出现异常的程序代码
}catch(异常类名 变量名)
{
   //Catch 块（异常的处理代码）
}
 */
public class TryCatch {
    public static void main(String[] args) {
        System.out.println("开始");
        method();
        System.out.println("结束");
    }
    public static void method(){
        try {
            int arr[] = {1, 2, 3};
            System.out.println(arr[3]);
        }catch(ArrayIndexOutOfBoundsException e){
            //System.out.println("数组下标越界");
             e.printStackTrace();
        }
    }
}

