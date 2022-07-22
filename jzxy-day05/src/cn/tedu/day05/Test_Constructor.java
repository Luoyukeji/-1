package cn.tedu.day05;

/**
 * 本类用于测试构造方法
 */
public class Test_Constructor {
    public static void main(String[] args) {
        Person p = new Person();
        System.out.println(p.name.equals("1"));//NullPointerException
        System.out.println(p.age=30);
        System.out.println(p.address="山西");

        System.out.println("----------------");

        Person p2 = new Person("李四",30,"山东");
        System.out.println(p2.name);
        System.out.println(p2.age);
        System.out.println(p2.address);
        //System.out.println(p2.getName()+p2.getAge()+p2.getAddress());
        p.learn();

        System.out.println("----------------");
        Person p3 = new Person("王五");
        System.out.println(p3.name);


        System.out.println("------------------");
        Person p4 = new Person("赵六",25);
        System.out.println(p4.name);
        System.out.println(p4.age);



    }
}
class Person{
    //name
    //age
    //address
    //学习

    String name;
    int age ;
    String address;

    public Person(){
        System.out.println("我是无参构造");
    }

//    @Override
//    public String toString() {
//        return "Person{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                ", address='" + address + '\'' +
//                '}';
//    }

    public Person(String name){
        this.name =name;
        System.out.println("这是一个带一个参数的构造方法");
    }


    public Person(String name,int age){

        this.name = name;
        this.age  = age;
        System.out.println("这是一个带两个参数的构造方法");
    }





public Person(String name, int age, String address){

        this.name = name;//等号右边的赋值给等号左边的，把用户传过来的name给到成员变量
        this.age = age;
        this.address = address;
    System.out.println("我是带参构造");

}
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public String getAddress() {
//        return address;
//    }
//
//    public void setAddress(String address) {
//        this.address = address;
//    }



    public void learn(){
        System.out.println("好好学习，天天向上");
    }
}
