package cn.tede.shoot;

/**
 * 子弹
 */
public class Bullet extends FlyingObject{
    private int speed = 3;//移动速度
    public Bullet(int x,int y){
        this.x = x;
        this.y = y;
        this.image = ShootGame.bullet;



    }

    @Override
    public void step() {
        y -= speed;


    }

    @Override
    public boolean outOfBounds() {
        return y<-height;
    }

    @Override
    public boolean hitColumn() {
        return y<-height;
    }
}
