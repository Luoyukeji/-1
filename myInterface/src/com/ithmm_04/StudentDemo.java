package com.ithmm_04;


import java.util.ArrayList;
import java.util.Scanner;

public class StudentDemo {
    public static void main(String[] args) {

        //首先创建一个集合
        ArrayList<Student> array = new ArrayList<Student>();
        while (true) {
            System.out.println("--------学生管理系统----------");
            System.out.println("1 添加学生");
            System.out.println("2 删除学生");
            System.out.println("3 修改学生");
            System.out.println("4 查看所有学生");
            System.out.println("5 退出");
            System.out.println("请输入你的选择：  ");
            Scanner sc = new Scanner(System.in);
            //键盘接受用户选择
            String line = sc.nextLine();

            switch (line) {
                case "1":
//添加学生信息
                    addStudent(array);
                    break;
                case "2":
//删除学生
                    deleteStudent(array);
                    break;
                case "3":
                    updateStudent(array);
                    //修改
                    break;
                case "4":
                    findStudent(array);
                    //查看
                    break;
                case "5":
                    //退出
                    System.out.println("谢谢使用");
                    System.exit(0);
                default:
                    System.out.println("您输入的有误请重新输入");
            }
        }

    }

    public static void addStudent(ArrayList<Student> array) {

            Scanner sc = new Scanner(System.in);
            System.out.println("请输入姓名");
            String name = sc.nextLine();
            System.out.println("请输入年龄");
            String age = sc.nextLine();
            System.out.println("请输入学号");
            String id = sc.nextLine();
            System.out.println("请输入地址");
            String address = sc.nextLine();
            //new一个学生对象存放数据
            Student s = new Student(name, age, id, address);

            array.add(s);//将学生对象添加到集合中，this.什么=什么，将局部变量赋值给成员变量存放到一个集合数组中
    }
    public static void findStudent(ArrayList<Student> array) {
        System.out.println("姓名\t\t学号\t\t年龄\t\t地址");
        if(array.size() == 0){
            System.out.println("暂无信息");
        }else{
            for (int i = 0;i<array.size();i++){
                Student s = array.get(i);
                System.out.println(s.getName()+"\t\t"+s.getId()+"\t"+s.getAge()+"\t"+s.getAddress());
            }
        }
    }
    //修改学生
    public static void updateStudent(ArrayList<Student> array){

        System.out.println("请输入你要修改的学生学号： ");
        Scanner s = new Scanner(System.in);
        String updateId= s.nextLine();
        int index=getIndex(array,updateId);
        if(index==-1){
            System.out.println("查无此人");
        }else{
            System.out.println("请输入新的学生姓名");
            String name = s.nextLine();
            System.out.println("请输入新的学生年龄");
            String age = s.nextLine();
            System.out.println("请输入新的学生地址");
            String address = s.nextLine();
            Student s1 = new Student(name,updateId,age,address);
            array.set(index,s1);
            System.out.println("修改成功");

        }


        }
        //删除学生信息
        public static void deleteStudent(ArrayList<Student> array){
            System.out.println("请输入你要删除的学生信息：  ");
            Scanner s = new Scanner(System.in);
            String deleteId = s.nextLine();
            int index = getIndex(array,deleteId);
            if(index==-1){
                System.out.println("查无此人");
            }else{
                array.remove(index);
                System.out.println("删除成功");
            }
        }

        //效验
    public static int getIndex(ArrayList<Student> array,String Sid){
        int index = -1;
        for (int i = 0;i< array.size();i++){
            Student s = array.get(i);
            String id = s.getId();
            //sid键盘输入的id
            if(id.equals(Sid));{
                index=i;
            }
        }
        return index;
    }
    }


