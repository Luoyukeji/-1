package cn.tedu.day16;

/**
 * String 是不可改变的， 即，字符串一旦创建，内容就不可变
 * 若果想改变，就比需创建新对象
 */
public class Test_StringDemo {

    public static void main(String[] args) {

        String ss = new String();//触发的是无参构造
        char[] value = { 'h','e','l','l','o'};
        String ss2 = new String(value);//存在堆内存中低效
        String ss3 = "hello";//此方法创建对象底层也会new String(),存放在常量池，高效
        System.out.println(ss2 == ss3);//false
        /*
        java中创建字符串对象时，使用字面量直接赋值
        常量池：创建字符串对象时，保存在常量池中
              因为这样创建对象时java会重用已经创建的字符串对象
              使用字面量创建对象时，虚拟机(JVM)会先检查常量池中是否缓存过该内容的字符串
              若有，直接重用该对象，若没有才创建该字符串对象并缓存它
         */
        String s1 = "123abc";//123abc字面量：
        String s2 = "123abc";//常量池中已有，直接重用对象
        System.out.println(s1.equals(s2));//true
        String s3 = new String("123abc");//
        System.out.println(s1==s3);//false
        System.out.println(s1.equals(s3));//true
        /*
        String类已经重写了equals方法
         */

        //修改字符串内容会创建新的对象
        s1 = s1+"!";
        System.out.println(s1);
        System.out.println(s1==s3);//false

        //编译器有一个优化措施：当编译器在编译过程中
        //发现一个计算表达式参数都是字面量，会直接计算
        //所以下面的代码会直接编译为String s5 = "123abc";//
        String s5 = "123" + "abc";
        System.out.println(s2==s5);//true

        String s = "123";
        String s6 = s + "abc";//s不是字面量，所以不会直接计算
        System.out.println(s2 ==s6);//false
    }
}
