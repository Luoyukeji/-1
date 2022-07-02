package com.ithmm_02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentDemo {
    public static void main(String[] args) {
        List<Student> l = new ArrayList<Student>();
        Student s1 = new Student("张三","25");
        Student s2 = new Student("李四","33");
        Student s3 = new Student("王五","55");
        //把学生对象添加到集合
        l.add(s1);
        l.add(s2);
        l.add(s3);

        //遍历结合迭代器，for循环
      /* Iterator<Student>  it=l.iterator();
       while(it.hasNext()){
           Student s  = it.next();
           System.out.println("姓名："+s.getName() +"           "     +"年龄： "+s.getAge());
       }*/

        //for 循环
        for(int i=0; i<l.size(); i++){
            Student s = l.get(i);
            System.out.println("姓名："+s.getName() +"           "     +"年龄： "+s.getAge());
        }
    }
}
