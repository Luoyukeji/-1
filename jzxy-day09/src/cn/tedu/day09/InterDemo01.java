package cn.tedu.day09;

public class InterDemo01 {
    public static void main(String[] args) {
        Inter5 i= new Inter5Imp();
        i.save();
        i.delete();
        i.update();
        i.find();

    }
}
interface Inter3{
    void save();
    void delete();
}
interface Inter4{
    void update();
    void find();
}
//接口和接口之间是继承关系，多个接口之间用逗号隔开
interface Inter5 extends Inter3,Inter4{

}
class  Inter5Imp implements Inter5{

    @Override
    public void save() {
        System.out.println("正在保存");
    }

    @Override
    public void delete() {
        System.out.println("删除");
    }

    @Override
    public void update() {
        System.out.println("更新");
    }

    @Override
    public void find() {
        System.out.println("查找");
    }
}