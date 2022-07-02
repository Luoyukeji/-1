package com.ithmm_05;

import java.util.Date;

//Date()
//          分配 Date 对象并初始化此对象，以表示分配它的时间（精确到毫秒）。
//Date(long date)
//          分配 Date 对象并初始化此对象，以表示自从标准基准时间（称为“历元（epoch）”，即 1970 年 1 月 1 日 00:00:00 GMT）以来的指定毫秒数。
public class DateDemo01 {
    public static void main(String[] args) {
        //public Date()
        Date date = new Date();
        System.out.println(date);

        Date date1 = new Date(1000*60*60*24);//中国在东八区+8hour
        System.out.println(date1);
    }
}
