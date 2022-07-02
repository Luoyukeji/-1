package com.ithmm_07;

import java.util.Calendar;

public class CalendarDemo {
    public static void main(String[] args) {
        //获取对象
     Calendar c =   Calendar.getInstance();//多态创建对象
//        System.out.println(c);//[time=1655449283220,
        //public int get (int filed)

//异常
        //输出十五年后的，三个月后的，十天前
        c.add(Calendar.YEAR,15);
        c.add(Calendar.MONTH,3);
        c.add(Calendar.DATE,-10);
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH)+1;
        int date = c.get(Calendar.DATE);
        System.out.println(year+"年"+month+"月"+date+"日");

    }
}
