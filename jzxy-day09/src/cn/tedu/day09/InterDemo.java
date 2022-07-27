package cn.tedu.day09;

/**
 * 面向接口
 * 具体事物：语文老师，数学老师
 *   共性：讲课，备课
 */
public class InterDemo {
    public static void main(String[] args) {
        InterfaceDemo ifd = new ChineseTeacher1();


        ifd.teach();
        ifd.ready();

        InterfaceDemo ifd1 = new MathTeacher2();

        ifd1.teach();
        ifd1.ready();

    }
}
abstract class Teacher2{
    String name;
    int id;
    public void Teacher2(){
        System.out.println("我是抽象老师类的无参构造");
    }

    public void Teacher2(String name,int id) {
        this.name = name;
        this.id = id;
    }
}
class ChineseTeacher1  implements InterfaceDemo{



    @Override
    public void teach() {
        System.out.println("语文老师教识字");
    }

    @Override
    public void ready() {
        System.out.println("语文老师备课");
    }
}
class MathTeacher2  implements InterfaceDemo{



    @Override
    public void teach() {
        System.out.println("数学老师教算数");
    }

    @Override
    public void ready() {
        System.out.println("数学老师备课");
    }
}
