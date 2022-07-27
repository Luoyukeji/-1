package cn.tedu.day09;
//Interface 接口 的实现类
//实现类要使用接口 内容 要和接口建立实现关系 通过关键字 implements 来实现
//如果实现类和接口类建立关系之后 可以通过 1.把类变成抽象类 2.重写接口里的抽象方法  来
public class InterImpl implements Inter{
    @Override
    public void eat() {
        System.out.println("吃屁");
    }

    @Override
    public void play() {
        System.out.println("玩啥");
    }
}
