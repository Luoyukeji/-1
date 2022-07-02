package com.ithmm_05;

import java.util.Date;

/*
public long getTime()返回自 1970 年 1 月 1 日 00:00:00 GMT 以来此 Date 对象表示的毫秒数。
返回：
自 1970 年 1 月 1 日 00:00:00 GMT 以来此日期表示的毫秒数。
setTime
public void setTime(long time)设置此 Date 对象，以表示 1970 年 1 月 1 日 00:00:00 GMT 以后 time 毫秒的时间点。
参数：
time - 毫秒数。

 */
public class DateDemo02 {
    public static void main(String[] args) {
        Date date = new Date();
        long time = date.getTime();
        System.out.println(time / 365 / 24 / 60 / 60 / 1000);
        //public void setTime(long time)设置此 Date 对象，以表示 1970 年 1 月 1 日 00:00:00 GMT 以后 time 毫秒的时间点。
        Date date1 = new Date();
        long time1  = 1000*60*60;
        date1.setTime(time1);
        System.out.println(date1);
    }
}
