package cn.tedu.day03;

public class Test_Switch2 {
    public static void main(String[] args) {
        String s = "Monday";
        switch (s) {
            case "Monday":
                System.out.println("你好星期一");
                break;
            case "Tuesday":
                System.out.println("你好星期二");
                break;
            case "Wednesday":
                System.out.println("你好星期三");
                break;
            case "Thursday":
                System.out.println("你好星期四");
                break;
            case "Friday":
                System.out.println("你好星期五");
                break;
            case "Saturday":
                System.out.println("你好星期六");
                break;
            case "Sunday":
                System.out.println("你好星期日");
                break;
            default:
                System.out.println("出错了");//如果default之前有break执行，default就不执行了
               // System.exit(0);
        }
    }
}
