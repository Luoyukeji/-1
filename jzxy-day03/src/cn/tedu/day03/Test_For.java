package cn.tedu.day03;

public class Test_For {
    public static void main(String[] args) {
        for (int i = 0; i <=10;i++){
            System.out.println(i);
        }
        for (int i = 10;i>=0&&i<=10;i--){
            System.out.println(i);
        }
      // for (int i = 1;i)
        for (int i =6;i<=6666;i=i*10+6){
            System.out.print(i+",");
        }
        System.out.println();

        /**
         *
         * 嵌套for循环
         * 存在最少类层for循环，根据外层的条件，判断里层是否执行，如果执行，
         */
        for (int i = 0; i < 3; i++){//外层循环控制行数
            for (int j = 0; j < 5 ;j ++){//内层循环控制列数
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
