package cn.tedu.day16;
/**
 * java.lang: 不需要import导包，比如字符串，多线程，Math；
 * java.io文件操作，输入/输出
 * @author
 */

public class Test {
    public static void main(String[] args) {
        Student s = new Student("jack",18);
//        s:引用数据类型变量
        System.out.println(s);//cn.tedu.day16.Student@1540e19d 包名+@+地址

        //getClass().getName() + '@' + Integer.toHexString(hashCode())
        //
        //返回：
        //该对象的字符串表示形式。

        System.out.println(s.hashCode());//356573597

        Student s2 = new Student("jack",18);
        System.out.println(s.equals(s2));//false
        //  public boolean equals(Object var1) {
        //        return this == var1;
        //    }//比较的是地址值是否相等 ==进行的比较

//        同一类型的对象比较  instanceof
    }
}
class Student {
    String name;
    int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        Student student = (Student) o;//强转
//
//        if (age != student.age) return false;
//        return name != null ? name.equals(student.name) : student.name == null;
//    }

//    @Override
//    public int hashCode() {
//        int result = name != null ? name.hashCode() : 0;
//        result = 31 * result + age;
//        return result;
//    }

    //自己重写equals方法
    public boolean equals(Object obj) {
        //如果是学生就比较，不是就直接返回false---匹配种类
        if (obj instanceof Student) {//同一类型对象进行比较
            Student ss = (Student) obj;//把obj强转为Student，因为想用子类的特有属性，如果不转，只能用父类的
            if (this.name == ss.name && this.age == ss.age) {//判断属性值是否相等
                return true;
            }
        }
        return false;
    }
}
