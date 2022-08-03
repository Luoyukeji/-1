package cn.tede.shoot;

public class AirPlane extends FlyingObject implements Enemy{
    private int speed = 2;//敌人飞机移动速度2
    public AirPlane(){
        this.image = ShootGame.airplane;
        width = image.getWidth();
        height = image.getHeight();
        y= -height;
        x = (int)(Math.random()*(ShootGame.WIDTH - width));
//        x = 300;
//        y = 190;
    }

    @Override
    public int getScore() {
        return 5;
    }

    @Override
    public void step() {
        y+=speed;
    }

    @Override
    public boolean outOfBounds() {
        return y>ShootGame.HEIGHT;
    }

    @Override
    public boolean hitColumn() {
        return y>ShootGame.HEIGHT;
    }
}
