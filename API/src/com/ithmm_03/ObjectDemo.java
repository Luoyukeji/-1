package com.ithmm_03;

public class ObjectDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("hmm");
        s1.setAge(19);

        Student s2 = new Student();
        s2.setName("hmm");
        s2.setAge(19);

        System.out.println(s1.equals(s2));//未重写equals方法，比较的是地址

    }
}
