package com.ithmm_05;

/**
 * 哈希值： 是JDK 根据对象的地址或者字符串或者数字算出来的int 类型的数值
 * public int hashCode();返回对象的哈希码值
 */
public class HashDemo {
    public static void main(String[] args) {
        Student s1 = new Student("张三",35);

        //同一个对象多次调用hashCode()方法返回的哈希值是相同的
        System.out.println(s1.hashCode());//356573597
        System.out.println(s1.hashCode());//356573597

        System.out.println("------------------------");
        Student s2 = new Student("张三",35);

        //默认情况下，不同对象的哈希值是不相同的

        //通过方法重写，可以实现不同对象的哈希值是相同的
        System.out.println(s2.hashCode());//1735600054
        System.out.println(s2.hashCode());//1735600054

        System.out.println("hello".hashCode());//99162322
        System.out.println("world".hashCode());//113318802
        System.out.println("java".hashCode());//3254818

        System.out.println("-------------------------");
        //字符串重写了hashCode()方法
        System.out.println("重地".hashCode());//1179395
        System.out.println("通话".hashCode());//1179395

    }
}
