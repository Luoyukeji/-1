package com.ithmm_03;

public class Outer {
    public void method(){
     /*   new Inter(){
            @Override
            public void show() {
                System.out.println("匿名内部类");
            }
        };*/   //对象
      /*  new Inter(){
            @Override
            public void show() {
                System.out.println("匿名内部类");
            }
        }.show();*/   // 对象调方法

       Inter i =  new Inter(){
            @Override
            public void show() {
                System.out.println("匿名内部类");
            }
        };
       i.show();

    }
}
