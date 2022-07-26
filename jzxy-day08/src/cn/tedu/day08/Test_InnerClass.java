package cn.tedu.day08;

public class Test_InnerClass {
    public static void main(String[] args) {

    }
}
class Mama{
    private String name;
    void createBaby(){
        Baby b = new Baby();//内部类只能在外部类创建对象，对外不具备可见性
        b.showMamaName();

    }
    class Baby{
        void showMamaName(){

            System.out.println(name="123");
            System.out.println(Mama.this.name);//内部类访问外部类，外部类名.this.属性

        }

    }
}