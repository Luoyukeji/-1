package com.ithmm_02;

import java.util.Scanner;

public class TeacherDemo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("请输入学生成绩： ");
       int score = s.nextInt();

       Teacher t = new Teacher();
       try {
           t.checkScore(score);
       }catch(ScoreException e ){
           e.printStackTrace();
       }
    }
}
