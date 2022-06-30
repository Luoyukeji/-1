package com.ithmm_06;

import java.util.Scanner;

public class Demo02 {
    public static void main(String[] args) {
        System.out.println("请输入一个字符串：");
        Scanner s = new Scanner(System.in);
        String s1  = s.nextLine();
        for (int i = 0; i < s1.length(); i++) {
            System.out.println(s1.charAt(i));
        }
    }
}
