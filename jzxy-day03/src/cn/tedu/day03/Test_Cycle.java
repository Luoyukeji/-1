package cn.tedu.day03;

/*
 需求：打印you三角
 */
public class Test_Cycle {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
       // System.out.println("请输入要打印三角形的行数： ");
        //int  s = sc.nextInt();
        for (int j = 1; j<=4 ;j++) {
            for (int i = 4; i > j; i--) {
                System.out.print(" ");
            }
            for (int x = 1; x <=j;x++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
