package cn.tedu.day17;

public class Test_Number {
    public static void main(String[] args) {
        // - 装箱：把基本数据类型转换为对应包装类类型
       // - 拆箱：把包装类型转换为对应的基本数据类型
        Integer iii = 5;//iii 是引用数据类型，5是基本数据类型，引用了包装类的地址

        int a = iii;//编译器自动完成拆箱：从包装类型的值，自动变成基本数据类型的值








        //int 的包装类 Integer
        Integer i0;//Integer以对象的形式存在，默认值null
        Integer i1 = new Integer(1);//Integer
        /*
        public Integer(int var1) {
        this.value = var1;
    }
         */
        Integer i2  = Integer.valueOf(127);//Integer对象
        Integer i3 = Integer.valueOf(127);
        Integer i4 = Integer.valueOf(200);
        System.out.println(i1 == i2);//false地址不同
        System.out.println(i2 == i3);//true//因为静态的valueOf()高效过程：数据在-128-127之间，相同的数据只会存储一次，如果缓存区已经有相同数据，直接拿来使用
        System.out.println(i3 == i4);//false数据不在-128-127之间，所以存储了两次，是两个对象，地址不同

        /*
        public static int parseInt(String var0) throws NumberFormatException {
        return parseInt(var0, 10);
    }
        将字符串参数作为有符号的十进制整数进行解析
         */
        int i = i1.parseInt("8000");//包装类转换为基本数据类型
        System.out.println(i+10);//8010

        //创建Double对象
        Double d1 = new Double(3.14);
        Double d2 = Double.valueOf("3.14");
        Double d3 = Double.valueOf("3.14");
        System.out.println(d2 == d3);//false

        System.out.println(d1.parseDouble("5.2")+1.4);//6.2//包装类转基本数据类型

    }
}
