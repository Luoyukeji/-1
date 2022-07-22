package cn.tedu.day05;

public class Test_ArraysDemo {
    public static void main(String[] args) {
        int arr[][] = {{1,2},{2,6},{5,9},{7,8}};
        for (int i = 0; i < arr.length; i++) {  //外层循环控制行数
            //System.out.println(Arrays.toString(arr));
            for(int j = 0; j < arr[i].length; j++) {  //内层循环控制列数

                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
