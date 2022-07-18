package cn.tedu.day02;

public class Test_OperDemo {
    public static void main(String[] args) {
        /*
        算数运算符：+ - * / %
        % ： 取余，取模，余数为0-整除
        ++ --: ke
            1）单独使用,可在变量前可在变量后
            2）被使用：前后有差别
         */

//        int a = 5,b = 5;
//        System.out.println(a--);//5
//        System.out.println(a);//4
//        System.out.println(--b);
//        System.out.println(b);
//
//        int a =5 ;
//        int b = 5;
//        int c  = a++;//先将a 赋值给c 然后a++
//        int d = --b;
//        System.out.println(a);//6
//        System.out.println(b);//4
//        System.out.println(c);//5
//        System.out.println(d);//4
//
//        System.out.println(5%2);//1  商2 余1
//        System.out.println(2%5);//2  商0 余2
//        System.out.println(3%3);//0  商1 余0
//
//
//        System.out.println(5%3);//2 商1 余2
//        System.out.println(6%2);//0 商3 余0
//        System.out.println(3%5);//3 商0 余3


        /*
        关系运算符： > < >= <=  == !=
        结果为boolean类型
        成立true 不成立false
         */
//        int  a = 5,b = 10,c = 5;
//        System.out.println(c<b);//true
//        System.out.println(a>=c);//true
//        System.out.println(a<=b);//true
//        System.out.println(a == c);//true
//        System.out.println(a!=c);//false
//        System.out.println(a%2==0);//5%2 =1  1!=0 false


        /*
        逻辑运算符 &&(短路与)  ||(短路或) !(逻辑非) &() |() +
        &&:短路与：两边都为真为真，见false则为false
        当第一个为false，则发生短路(后面就不执行)

        ||：短路或：有一边为真，则结果为真，见true则true
        当以一个为true，则发生短路(后面的不执行)

        ! :逻辑非(取反)，非真则假，非假则真
         */

//        int a = 5,b =10,c =5;
//        boolean b1 = b>a&&b<c;
//        System.out.println(b1);//false
//        System.out.println(b<=a&&b>c);//false
//        System.out.println(a==b&&b<c);//false
//        System.out.println(b!=c &&b>a);//true
//
//        boolean b2 = b>a||c++>2;//true--短路
//        System.out.println(b2);
//        System.out.println(c);//5


        //有真则真，全假为假
//        int a = 5,b = 10,c = 5;
//        boolean b1 =!(b>a);//!(true)-->false
//        System.out.println(b1);//false
//        System.out.println(b>=a||b<c);//true
//        System.out.println(b<=a||b>c);//false||true--->true
//        System.out.println(b!=c||b>a);//true
//        System.out.println(a==b||b<c);//false
//
//        boolean b3 = a>b&&c++>2;
//        System.out.println(b3);//false
//        System.out.println(c);
//

        /*int a =5;
        a+=10;//a=a+10;
        System.out.println(a);//15

        a*=2; //a=a*2;
        System.out.println(a);//30
        a/=6;
        System.out.println(a);//5

        //面试题
        short s =5 ;
        s += 10;
        System.out.println(s);//15,自带强转


        System.out.println(10+""+1020);//101020
        System.out.println(""+10+10+5);//10105
        System.out.println(30+20+"");//50
        System.out.println(30+20+""+30+20);//503020

*/
        /*
        三目运算符
        boolean? 数1:数2;
            若为true，整个表达式结果为数1；
            若为false，整个表达式结果为数2
         */

        System.out.println(3>5?5:4);
        int a = 10;


        //System.out.println(b);
    }
}
