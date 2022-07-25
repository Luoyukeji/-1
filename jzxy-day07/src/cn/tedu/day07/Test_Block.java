package cn.tedu.day07;

/**
 * 构造代码块和局部代码块
 */
public class Test_Block {
    public static void main(String[] args) {
        Teacher t = new Teacher();//通过调用无参构造来创建对象
        Teacher t1 = new Teacher("张三","java");
        System.out.println(t1);
        //10;局部代码块有限执行
        t.study();
        t.teach();
        //调用构造方法啦
        //我是teacher的无参构造java
        //调用构造方法啦
        //我是teacher的带参构造
        //Teacher{name='张三', subject='java'}
        //10
        //老师正在备课
        //教书育人



    }
}
class Teacher{
    String name;
    String subject;

    //构造代码块优先于构造方法执行
    {
        subject = "java";
        System.out.println("调用构造方法啦");
    }
    public Teacher (){//没有返回值类型方法名和类名相同
        System.out.println("我是teacher的无参构造"+subject);
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", subject='" + subject + '\'' +
                '}';
    }

    public Teacher (String name, String subject){
        this.name = name;
        this.subject = subject;
        System.out.println("我是teacher的带参构造");

    }
    public void study(){
        {
            int i = 10;
            System.out.println(i);
        }
        //System.out.println(i);//超出作用域
        System.out.println("老师正在备课");
    }

    public static void teach(){
        System.out.println("教书育人");
    }


}