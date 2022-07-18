package cn.tedu.day02;

public class Demo {
    public static void main(String[] args) {

        int i= 2;
        short s =111;
        byte b = 127;
        long l= 1;

        double d = 2.33;
        double dd = 3D;//3.0

        float f = 2.3f;//右边的2.3 字面值为double类型，float是四个字节存不下
        //2.3的字面值为double类型，加了F后缀就会变成float类型
        System.out.println(d);
        System.out.println(dd);//3.0
        System.out.println(f);
        long  x = 999_999_999L;
        //字面值是int类型，需要转换为long类型的数据，在字面值后面加上L/l即可

        float ff = 3;//整数的字面值是int类型
        float fff = 3.0f ;


        //类型转换
        //从小到大(隐式转换)
        byte bbb = 110;
        int ii = bbb;//小转大，右边是小类型，给左边大类型转换，可以直接使用
        //从大到小
//        强转
        int y = 100;
        byte yy = (byte)y;
        System.out.println(yy);

        //浮点数转化到整数是通过舍弃后面的小数得到的，不是四舍五入
        float g= 3.14f;
        int h = (int)g;
        System.out.println(h);


        /*
        计算规则
        计算结果的数据类型，与最大数据类型保持一致
        int/int - int


        byte，short，char三种比int晓得整数，在运算的时候会自动转换为int类型
        */
        System.out.println((double)5/2);

        byte q = 1;
        byte w = 2;
        byte r = (byte)(q+w);
        System.out.println(r);

        //整数运算溢出
        //光速运算一年的长度是多少米?
        System.out.println((long)300000000*365*24*60*60);
        System.out.println(300000000l*365*24*60*60);
        //System.out.println(300000000*365*24l*60*60);前面已经溢出


        System.out.println(1-0.9);//0.09999999999999998  精度丢失


        //浮点数的特殊值
        //零不能做除数
        System.out.println(3.5/0);//Infinity   无穷大
        System.out.println(0/0.0);//NaN  --  -not a number


        //运算符
        //算数，+ - * / % -- ++
        //比较
        // 赋值，关系，逻辑，位


    }
}
