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
    }
}
