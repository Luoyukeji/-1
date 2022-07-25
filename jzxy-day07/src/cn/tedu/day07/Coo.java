package cn.tedu.day07;

public class Coo {
    void show() {
        Aoo o = new Aoo();
        o.a = 1;
        o.b = 2;
        o.c = 3;
        //o.d = 4;

    }
}

class Eoo extends Aoo{
    public void show(){
        Aoo o = new Aoo();

    }
}