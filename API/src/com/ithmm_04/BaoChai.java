package com.ithmm_04;

// - 装箱：把基本数据类型转换为对应包装类类型
// - 拆箱：把包装类型转换为对应的基本数据类型
public class BaoChai {
    public static void main(String[] args) {
        // - 装箱：把基本数据类型转换为对应包装类类型
        Integer i = Integer.valueOf(100);
        Integer ii =100;//自动装箱Integer.valueOf(100);switch
        //- 拆箱：把包装类型转换为对应的基本数据类型
       /* ii = ii.intValue()+200;
        System.out.println(ii);*/
        ii+=200;//内部隐含ii.intValue()
        System.out.println(ii);


        Integer iii = null;
        if(iii!=null){
            iii+=300;//NullPointerException//内部隐含ii.intValue(),所以null掉对象，会触发空指针异常
        }
    }
}
