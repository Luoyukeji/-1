package cn.tedu.day17;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * Date 用来获取年月日时分秒毫秒
 * 分配 Date 对象并初始化此对象，以表示自从标准基准时间（称为“历元（epoch）”，即 1970 年 1 月 1 日 00:00:00 GMT）以来的指定毫秒数。
 */
public class Test_Date1 {
    public static void main(String[] args) throws Exception {
       // method();
        method2();
    }
    public static void method(){
        Date d = new Date();
        System.out.println(d.getDate());
        //month - 0-11 之间的月份。
        System.out.println(d.getMonth()+1);//美国11个月
        System.out.println(d.getDay());
        System.out.println(d.getHours());

        System.out.println(d.getMinutes());
        System.out.println(d.getSeconds());
        //从1970年到现在的毫秒值
        System.out.println(d.getTime());

        System.out.println(d.toLocaleString());//2022-8-5 11:20:43
        long time = d.getTime();
        System.out.println();
    }

    public static void method2() throws ParseException {
        Scanner scanner = new Scanner   (System.in);
        System.out.println("请输入你的生日");


        String birthday = scanner.nextLine();
        //long start = d.getTime()+32*365*24*60*60*1000;//毫秒
        //吧String类型的日期转化为Date类型
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");


            Date birthday1 = sdf.parse(birthday);
           //获取毫秒值
        long time = birthday1.getTime();//获取出生时的毫秒数

        long currentTime = System.currentTimeMillis();//1970到现在的毫秒数
        System.out.println((currentTime - time)/24/60/60/ 1000);//单位：天



    }
}
