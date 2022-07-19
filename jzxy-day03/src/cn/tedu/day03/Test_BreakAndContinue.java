package cn.tedu.day03;

import java.util.Scanner;

//接收用户输入的100次数据如果用户输入的不是88就继续数如直到88结束
public class Test_BreakAndContinue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你要输入的数据： ");
        int input = sc.nextInt();

        System.out.println("开始猜了哦");
        for(int i=0;i<100;i++) {
            int s = sc.nextInt();
            if (s == input) {
                System.out.println("对了");
                break;
            } else {
                System.out.println("错了，请继续：");
                continue;
                //后不能加代码

            }
        }
    }
}
