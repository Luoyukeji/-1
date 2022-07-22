package cn.tedu.day05;

/**
 *可变参数一定要在参数列表的最后边
 * 在方法声明中使用   ...表示多个相同类型的参数
 * 注意：在实际调用中，我们已经在方法中
 */
public class Test {
    public static void main(String[] args) {
        method(1,2,3,4,5,6,4);
        System.out.println();
        method1(8, 2,2,4,5,6);
    }
    public static void method(int ...values){
        for (int i = 0; i < values.length; i++){
            System.out.print(values[i]+ " ");
        }
    }
    public static void method1(int a,int...ints){

        for (int i = 0; i < ints.length; i++){
            System.out.print(ints[i]+ " ");
        }
    }
}
