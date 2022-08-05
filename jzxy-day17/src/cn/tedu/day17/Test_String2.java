package cn.tedu.day17;

public class Test_String2 {
    public static void main(String[] args) {
        String str = "好好学习java";
        /**
         * public StringBuilder(String var1) {
         *         super(var1.length() + 16);
         *         this.append(var1);
         *         内部字符数组默认初识容量为16，if>16扩容
         */
        StringBuilder sb = new StringBuilder(str);//将str内容复制到StringBuilder里面，

        //追加
        sb.append("为了月薪过万");//好好学习java为了月薪过百万

        //replace()替换部分内容
        sb.replace(10,sb.length(),"改变世界");//好好学习java为了改变世界

        //delete()删除部分内容
        sb.delete(0,7);//a为了改变世界，删除下标0-7，含头不含尾

        //insert()插入操作
        sb.replace(4,5,"我的");//a为了改我的世界








        System.out.println(sb);
    }
}
