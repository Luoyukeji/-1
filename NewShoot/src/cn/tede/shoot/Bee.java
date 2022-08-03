package cn.tede.shoot;

import java.util.Random;

//蜜蜂
public class Bee extends FlyingObject implements Award{

    private int xSpeed = 1;//x坐标的移动速度
    private int ySpeed = 2;//y坐标的移动速度
    private  int awardType;//奖励类型
    public Bee(){
        this.image = ShootGame.bee;
        width = image.getWidth();
        height = image.getHeight();
        y = - height;
        //y = 200;
        x= (int)Math.random()*(ShootGame.WIDTH - width);
        Random r =new Random();
        //int x = r.nextInt(ShootGame.WIDTH - width);
        //x = 100;
        awardType = r.nextInt(2);

    }

    @Override
    public int getType() {//奖励类型
        return awardType;
    }

    @Override
    public void step() {
        x+= xSpeed;
        y+= ySpeed;
        if(x>ShootGame.WIDTH - width){
            xSpeed = -1;
        }
        if(x<0){
            xSpeed = 1;
        }
    }

    @Override
    public boolean outOfBounds() {
        return y>ShootGame.HEIGHT;
    }

    @Override
    public boolean hitColumn() {
        return false;
    }
}
