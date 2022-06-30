package com.ithmm_02;

public class Outer {
    private int num = 10;

    public void method(){

        class Inner{
            int num1= 30;
            public void show(){
                System.out.println(num);
                System.out.println(num1);
            }
        }
        Inner i = new Inner();
        i.show();
    }
}
