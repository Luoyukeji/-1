package cn.tedu.day07;

public class Test_Static2 {
    public static void main(String[] args) {

    }
}
class Teacher2{
    String name;
    static int age;
    public void teach(){
        //普通资源可以调用静态资源

        System.out.println(age);
        //普通资源可以调用静态方法
        eat();
        System.out.println("正在讲课");
    }
    public static void eat(){
        System.out.println("干饭");
    }
    public static void speak(){
        //静态资源不可以调普通资源
        //System.out.println(name);
        //teach();

        //静态资源可以调用静态属性
        System.out.println(age);
        //静态资源可以调精态方法
        eat();

        System.out.println("正在说话");
    }
}