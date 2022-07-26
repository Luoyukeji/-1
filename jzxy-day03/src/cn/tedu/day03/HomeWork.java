package cn.tedu.day03;

/*
     *
    ***
   *****
  *******
 *********

 * 打印菱形
 */
public class HomeWork {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; i <= j; j--)
                System.out.print(" ");
            for (int j = 1; j <= i; j++)
                System.out.print("*");
            for (int j = 1; j < i; j++)
                System.out.print("*");
            System.out.println();
        }
            for(int i = 4;i>=1;i--) {//控制行数
                for(int k = 0;k<=4-i;k++) {//空格的个数
                    System.out.print(" ");
                }

                for(int j = 1;j<=2*i-1;j++) {//控制星星个数的时候和行有关
                    System.out.print("*");
                }
                System.out.println();

            }
        }
    }

