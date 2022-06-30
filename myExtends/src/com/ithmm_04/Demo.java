package com.ithmm_04;
/*
     测试类
 */
public class Demo {
    public static void main(String[] args) {
        //创建老师对象进行测试
        Teacher t1 = new Teacher();
        t1.setName("hmm");
        t1.setAge(20);
        System.out.println(t1.getName()+","+t1.getAge());
        t1.teach();

        //带参构造创建对象
        Teacher t2=new Teacher("lwx",17);
        System.out.println(t2.getName()+","+t2.getAge());
        t2.teach();

    }
}
