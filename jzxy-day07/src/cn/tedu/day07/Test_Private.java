package cn.tedu.day07;

public class Test_Private {
    public static void main(String[] args) {

        Student s = new Student();
        s.setSubject("PHP");
        System.out.println(s.getSubject());
        Student s2 = new Student();
        s2.name = "hmm";
        s2.stuId = 110;
        s2.setSubject("PHP");
        s2.getSubject();
        System.out.println(s2);


    }
}

class Student{
    String name;
    int stuId;//学号stuId
    //对成员变量进行封装
    private String subject;
    private int score;
    //对外提供公共的属性值设置方法
    public void setSubject(String subject){
        this.subject = subject;
    }
    //对外提供公共的属性值访问方法
    public String getSubject(){
        return subject;
    }

    public void setScore(int score){
        this.score = score;
    }
    public int getScore(){
        return score;
    }

    public void study(){
        eat();//把私有方法放到公共方法中间接访问
        System.out.println("正在上课学习");

    }
    private void eat(){
        System.out.println("还有一个小时吃饭");
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", stuId=" + stuId +
                ", subject='" + subject + '\'' +
                ", score=" + score +
                '}';
    }
}