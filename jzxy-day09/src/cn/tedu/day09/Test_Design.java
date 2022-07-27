package cn.tedu.day09;

/**
 * 具体事物：语文老师，数学老师
 * 共性：讲课，备课
 */
public class Test_Design {
    public static void main(String[] args) {
        Teacher t1 = new ChineseTeacher("张老师",111);
        System.out.println(t1);
        t1.teach();
        t1.prepare();

        Teacher t2 = new MathTeacher("李老师",110);
        System.out.println(t2);
        t2.teach();
        t2.prepare();

    }
}
 abstract class Teacher{
   private String name;
   private int id;
    public void Teacher(){

    }

    public Teacher(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public abstract void teach();

    public abstract void prepare();

     @Override
     public String toString() {
         return "Teacher{" +
                 "name='" + name + '\'' +
                 ", id=" + id +
                 '}';
     }

 }
 class ChineseTeacher extends Teacher{

    public ChineseTeacher(String name, int id) {
        super(name, id);
    }

     @Override
     public void teach() {
         System.out.println("语文老师正在教课文");
     }

     @Override
     public void prepare() {
         System.out.println("语文老师正在准备作文课");
     }
 }
class MathTeacher extends Teacher{
    public MathTeacher(String name, int id) {
        super(name,id);

        }

    @Override
    public void teach() {
        System.out.println("数学老师正在教算数");
    }

    @Override
    public void prepare() {
        System.out.println("数学老师准备讲试卷课");
    }

}
