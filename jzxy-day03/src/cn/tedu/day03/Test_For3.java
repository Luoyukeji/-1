package cn.tedu.day03;
//打印九九乘法表
public class Test_For3 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {//外行

            for (int j = 1; j<=i; j++) {//内列
                System.out.print(j+"*"+i+"="+i*j+"\t");//\t 制表符
            }

            System.out.println();
        }
    }
}
