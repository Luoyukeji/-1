package com.ithmm_09;

import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String s1 = s.nextLine();
        String student1 []= s1.split(",");
        for (int i = 0; i < student1.length;i++) {
            System.out.println(student1[i]);
        }
    }
}
