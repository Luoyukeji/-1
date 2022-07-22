package cn.tedu.day06;
//方法重载
public class Test_Overload {
    public static void main(String[] args) {

        method();
        method(1,5);
        method("hmm",20);
        method(5);
    }
    //创建method(int i,int j)
    public static  void method(int i,int j){
        System.out.println(i+j);
    }

    public static void method(String s ,int i){
        System.out.println(s+"今年"+i+"岁了");
    }

    public static void method(){
        System.out.println("我没参数");
    }

    public static void method(int i){

        System.out.println(i*i);
    }
}
