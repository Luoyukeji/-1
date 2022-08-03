package cn.tede.shoot;

import java.awt.image.BufferedImage;

//英雄鸡
public class Hero extends FlyingObject {

    BufferedImage[] images = {};
    int index = 0;

    private int doubleFire;//双倍火力的子弹数量
    private int life;//命的数量

    public Hero() {
        life = 3;
        doubleFire = 0;
        this.image = ShootGame.hero0;
        images = new BufferedImage[]{ShootGame.hero0, ShootGame.hero1};
        width = image.getWidth();
        height = image.getHeight();
        x = 150;
        y = 400;
    }

    @Override
    public void step() {
        if (images.length > 0) {
            image = images[index++ / 10%images.length];
        }
    }

    @Override
    public boolean outOfBounds() {
        return false;
    }

    @Override//重写
    public boolean hitColumn() {
        return false;
    }

    //发射子弹
    public Bullet[] shoot() {
        int xStep = width / 4;
        int yStep = 20;
        if (doubleFire > 0) {//双倍火力
            Bullet[] bullets = new Bullet[5];//2
            bullets[0] = new Bullet(x + xStep, y - yStep);
            bullets[1] = new Bullet(x + 3 * xStep, y - yStep);
            bullets[2] = new Bullet(x + 2 * xStep, y - yStep);
            bullets[3] = new Bullet(x + 0 * xStep, y - yStep);
            bullets[4] = new Bullet(x + 4 * xStep, y - yStep);

            doubleFire -= 2;
            return bullets;
        } else {
            Bullet[] bullets = new Bullet[1];
            bullets[0] = new Bullet(x + 2 * xStep, y - yStep);
            return bullets;
        }
    }

    /**
     *
     * @param x:鼠标x坐标位置
     * @param y;鼠标y坐标位置
     */
    public void moveTo(int x, int y) {
        this.x = x- width/2;//hero.x+width/2;
        this.y = y - height/2;

    }
    public void addDoubleFire(){
        doubleFire += 40;
    }
    public void addLife(){
        life++;
    }
    //获取英雄鸡命数
     public int getLife(){
        return life;
     }

//    public boolean outOfBounds(){
//        return false;
//    }
    //减命
    public void subtractLife(){
        life--;
    }
    //重新设计双倍火力值
    public void setDoubleFire(int doubleFire){
        this.doubleFire = doubleFire;
    }
    //碰撞的算法
    public boolean hit(FlyingObject other){
        int x1 = other.x - this.width/2 ;
        int x2 = other.x + this.width/2 + this.width;
        int y1 = other.y - this.height/2 ;
        int y2 = other.y + other.height + other.height/2;
        return this.x + this.width/2>x1
                &&this.x+this.width/2<x2
                &&this.y+this.height/2>y1
                &&this.y+this.height/2<y2;

    }
}