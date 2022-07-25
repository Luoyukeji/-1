package cn.tedu.day07;
/*
   测试Static

   静态资源可以通过类名.来访问
   静态资源是优先于对象对象加载的，随着类的加载而加载，比对象先加载到内存，没对象
   时也可以通过类名直接调用3
 */
public class Test_Static {
    public static void main(String[] args) {
        System.out.println(Student2.name);//静态资源可以通过类名.来访问
        Student2.study();
        Student2 s = new Student2();
        s.name = "后裔";
        System.out.println(s.name);//后裔
        s.speak();
        s.study();
        Student2 s2 =new Student2();
        //静态全局共享
        System.out.println(s2.name);//后裔
        System.out.println(Student2.name);//后裔


    }
}
class Student2{
    //定义属性--成员变量--无需手动初始化
    //static 可以用来修饰成员变量和成员方法，一般写在修饰符之后
    int stuId;
    static String name;
    public void speak(){
        System.out.println("会说就多说");
    }
    public static void study (){
        System.out.println("好好学习，天天向上");
    }
}
