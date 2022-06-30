package com.ithmm_06;

import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
        String mima = "123";
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入你的密码： ");
            Scanner s = new Scanner(System.in);
            String password = s.nextLine();

            if (mima.equals("password")) {
                System.out.println("登陆成功");
                break;
            } else {
                if (2 - 1 == 0) {
                    System.out.println("你的账户已被锁定");
                } else {
                    System.out.println("密码错误，你还剩" + (2 - i) + "机会");
                }
            }

        }
    }
}

