package cn.tedu.day06;

public class Test {
    public static void main(String[] args) {

        Teacher [] t = new Teacher[3];
        t[0] = new Teacher("张三",20,"山西",1000);
        t[1] = new Teacher("李四",25,"陕西",2000);
        t[2] = new Teacher("王五",30,"山东",3000);
        t[0].sayHi();
        System.out.println("----------------------------------");
        t[1].sayHi();
        System.out.println("----------------------------------");
        t[2].sayHi();

        System.out.println("----------------------------------");
        Student [] s = new Student[3];
        s[0] = new Student("张三",20,"北京",1001);
        s[1] = new Student("李四",25,"陕西",1002);
        s[2] = new Student("王五",30,"山东",1003);
        for (int i = 0; i < 3; i++){
            System.out.println(s[i]);
        }


    }
}
class Person1{
    String name;
    int age;
    String address;
    public Person1(String name, int age, String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }
    public void sayHi(){
        System.out.println(name + " " + age + " "+address);
    }
}
class Teacher extends Person1{
    double salary;

    public Teacher(String name, int age, String address,double salary) {
        super(name, age, address);
        //super通过这个关键字来使用父类的内容，调用的是超类的构造方法，有参传参
        this.salary = salary;


        //sayHi();
    }

    @Override
    public void sayHi() {
        super.sayHi();
        System.out.println(name + age +address + salary);
    }
}
class Student extends Person1{
    int id;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", id=" + id +
                '}';
    }

    public Student(String name, int age, String address, int id){
        super(name, age, address);
        this.id = id;


    }
}
class Doctor extends Person1{
    public Doctor(String name, int age, String address){
        super(name, age, address);
        //this.
    }
}