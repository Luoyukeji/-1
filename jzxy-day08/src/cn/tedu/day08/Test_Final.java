package cn.tedu.day08;

public class Test_Final {
    public static void main(String[] args) {
        Son s = new Son();
        //s.name = "erzi";常量的值不可以被修改
        s.work();

    }
}
 class Father{
    final  String name = "diedie";
    final public void work(){//final 可以修饰成员方法，但被修饰的是最终实现类，不能被子类重写
        System.out.println("打工人");
    }

}
class Son extends Father{
//    @Override//'work()' cannot override 'work()' in 'cn.tedu.day08.Father'; overridden method is final
//    public void work() {
//        super.work();
//    }
}