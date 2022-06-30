package com.ithmm_04;
/*
  测试类
 */
public class JumppingDemo {
    public static void main(String[] args) {
        //需求：创建接口操作类对象，调用method方法
        JumppingOperator jo = new JumppingOperator();
//        Jumpping j = new Jumpping();//不能实例化
        Jumpping j = new Cat();
        jo.method(j);

        System.out.println("----------------");
        jo.method(new Jumpping() {
            @Override
            public void jump() {
                System.out.println("猫可以跳高了");
            }
        });//注意
        jo.method(new Jumpping(){
            @Override
            public void jump() {
                System.out.println("你在狗叫什么");
            }
        });
    }
}

