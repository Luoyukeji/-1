package cn.tedu.day09;

public class InterTest {
    public static void main(String[] args) {
        //接口不可以创建对象，只能用他的实现类，多态思想

        //创建多态对象
        Inter i = new InterImpl();
        i.eat();
        i.play();

        //创建子类对象
        InterImpl ii = new InterImpl();//不推荐
        ii.eat();
        ii.play();
    }
}
