package cn.tedu.day07;

public class Teat_Teacher {
    public static void main(String[] args) {
        Teacher1 t = new Teacher1("鲁班","男",800,1500);
        System.out.println(t);
        System.out.println("name:"+t.getName()+" "+"gender: "+ t.getGender()+" "+"age:"+t.getAge()+" "+"salary: "+t.getSalary());


    }
}
class Teacher1{
    //属性封装，私有化
    private String name;
    private String gender;
    private int age;
    private double salary;

    //如果什么都不写，默认会提供无参构造，编译器自动提供
    //如果我们创建了丰富的含参构造方法，那么无参构造将不会默认提供，需要手动添加
    //我们创建多个构造方法是为了给外界提供创建本类对象的多种方法

    public Teacher1 (){
        System.out.println("我是无参构造哦");
    }
    public Teacher1(String name, String gender,int age,double salary){
        this.name = name;//将此构造方法传入的参数name，把这个参数赋值给成员变量this.name
        this.gender = gender;
        this.age = age;
        this.salary = salary;
        System.out.println("我是全参构造");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Teacher1{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
