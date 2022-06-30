package com.ithmm_05;

public class PersonDemo {
    public static void main(String[] args) {
        Teacher t1 =new Teacher();
        t1.setName("hmm");
        t1.setAge(20);
        System.out.println(t1.getName()+","+t1.getAge());
        t1.teach();

        Teacher t2 =new Teacher("yyy",25);
        System.out.println(t2.getName()+","+t2.getAge());
        t2.teach();

        System.out.println("----------------------------------------------");

        Student s1 =new Student();
        s1.setName("lwx");
        s1.setAge(17);
        System.out.println(s1.getName()+","+s1.getAge());
        s1.learn();
    }
}
