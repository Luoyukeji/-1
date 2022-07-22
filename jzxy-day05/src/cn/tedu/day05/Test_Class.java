package cn.tedu.day05;

/**
 * 类和对象的练习
 */
public class Test_Class {
    public static void main(String[] args) {

        Phone p =new Phone();

        System.out.println(p.brand="123");
        System.out.println(p.price);
        System.out.println(p.size);
        System.out.println(p.color);
        p.call();
        p.message();
        p.play();



        Phone p2 = new Phone();
        p2.brand="坤坤手机";
        p2.color="屎黄色";
        p2.size=6.5;
        p2.price= 380;

        System.out.println(p2.brand);
        System.out.println(p2.size);
        System.out.println(p2.color);
        System.out.println(p2.price);

        p2.ctrp();


        Phone p3 = new Phone();
        p3.ctrp();




    }
}

class Phone {
    //成员变量---属性---类里方法外
    String brand = "huawei";//品牌
    double price=16888;
    double size=18;
    String color="鲸鱼森林";

    //成员方法--行为--类里方法外
    public void call(){
        System.out.println("打电话...");
    }
    public void message(){
        System.out.println("发短信给mmm");
    }
    public void play(){
        System.out.println("打王者");
    }
    public void ctrp(){
        System.out.println("唱跳，rap，篮球");
    }
}

