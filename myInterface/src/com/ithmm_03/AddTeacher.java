package com.ithmm_03;

import java.util.ArrayList;
import java.util.Scanner;

public class AddTeacher {

    public static void Teacher(ArrayList<Teacher>array){

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你要添加的姓名： ");
        String name= sc.nextLine();
        System.out.println("请输入你要添加的年龄： ");
        int age = sc.nextInt();
        System.out.println("请输入你要添加的学科： ");
        String subject = sc.nextLine();

        Teacher t =new Teacher();
        t.setName(name);
        t.setAge(age);
        t.setSubject(subject);

        array.add(t);

        //遍历集合中老师信息
            for (int i = 0; i < array.size(); i++) {
                Teacher t1 = array.get(i);
                System.out.println(array.get(i));
            }
        }
}
