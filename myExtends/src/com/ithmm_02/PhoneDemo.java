package com.ithmm_02;
/*
    测试类
 */
public class PhoneDemo {
    public static void main(String[] args) {
        Phone p =new Phone();
        NewPhone np= new NewPhone();
        np.call("hmm");
        System.out.println("------------------------");
        p.call("hmm");
    }
}
