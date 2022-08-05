package cn.tedu.day17;

public class Test_String {
    public static void main(String[] args) {
        method();
        method2();
        method3();
    }

    //将指定字符串拼接10000次
    public static void method() {
        String str = "qwertyuiop";
        String result = "";
        long start = System.currentTimeMillis();//1970-01-01 00:00:00

        for (int i = 0; i < 10000; i++) {
            result += str;
        }
        long end = System.currentTimeMillis();
        //long time = ;
        System.out.println(end - start);
    }
//String 不适于进行频繁修改的操作，所以引入工具类
    //用工具类拼接
    public static void method2() {
        String str = "qwertyuiop";
        StringBuffer sb = new StringBuffer();
        StringBuilder sb2 = new StringBuilder();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            sb.append(str);
        }
        long end = System.currentTimeMillis();
        //System.out.println(sb.toString());
        System.out.println(end - start);//1毫秒，效率大大提高
    }

    public static void method3(){
        String str = "qwertyuiop";
        long start = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1000000; i++) {
            sb  .append(str);

        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);//1
    }
}
