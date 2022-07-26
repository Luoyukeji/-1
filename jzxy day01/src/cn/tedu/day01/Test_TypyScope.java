package cn.tedu.day01;

/**
 * 本类用于测试基本数据类型的最大值和最小值
 *
 */
public class Test_TypyScope {
    public static void main(String[] args) {
        //java 提供了对应基本数据类型的工具箱
        byte byteMax=Byte.MAX_VALUE;
        byte byteMin=Byte.MIN_VALUE;
        System.out.println("byteMax = " + byteMax);
        System.out.println("byteMin = " + byteMax);

        System.out.println("--------------");

        short shortMax=Short.MAX_VALUE;
        short shortMin=Short.MIN_VALUE;
        System.out.println("shortMax = " + shortMax);
        System.out.println("shortMin = " + shortMin);

        System.out.println("-----------------------");

        int intMax = Integer.MAX_VALUE;
        int intMin = Integer.MIN_VALUE;
        System.out.println("IntegerMax ="+ intMax);
        System.out.println("IntegerMin  = "+ intMin);

        System.out.println("---------------------");
        long longMax = Long.MAX_VALUE;
        long longMin = Long.MIN_VALUE;
        System.out.println("longMax = "+ longMax);
        System.out.println("longMin = "+ longMin);

        System.out.println("-----------");
        double doubleMax = Double.MAX_VALUE;
        double doubleMin = Double.MIN_VALUE;
        System.out.println(doubleMax);
        System.out.println(doubleMin);

        System.out.println("----------------");
        float floatMax = Float.MAX_VALUE;
        float floatMin = Float.MIN_VALUE;
        System.out.println(floatMax);//3.4028235E38
        System.out.println(floatMin);//1.4E-45

        //char 字符型
        char ch1 = 'a';
        char ch2 = 97;//可以保存数字，但是在打印的时候，回去查ASCII码表
        //65->A   66-B  97-a  98-b
        char ch3 = '中';

        System.out.println(ch1);
        System.out.println(ch2);
        System.out.println(ch3);


        }
}
