package cn.tede.day10;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;

//鸟
public class Bird {
    int x,y;//鸟中心位置
    int width, height;//宽高
    int size;//鸟的边长，检测碰撞
    BufferedImage image;

    double g; //重力加速度
    double t;//两次位置时间间隔
    double v0;//初始上抛速度
    double speed;//当前上抛速度
    double s;//位移
    double alpha;//鸟的倾角 单位是弧度

    //添加鸟动的数组
    BufferedImage[] images;
    int index ;


    public Bird() throws Exception {
        image = ImageIO.read(getClass().getResource("0.png"));//添加鸟的图片
        width = image.getWidth();
        height = image.getHeight();
        x = 132;//鸟的坐标
        y = 280;
        size = 40; //鸟的边长

        g = 4;
        v0 = 20;
        t = 0.25;
        speed = v0;
        s = 0;
        alpha = 0;

        images = new BufferedImage[8];
        for(int i = 0;i < images.length;i++){
            images[i] = ImageIO.read(getClass().getResource(i+".png"));
        }
        index = 0;//每循环到第八张图片，将index值变为0
    }

    //鸟飞
    public void fly(){
        index++;
        image = images[(index/12)%8];//0-7图片
    }
    //鸟移动的方法
    public void step() {
        double v0 = speed;
        s = v0 * t - g * t * t / 2;
         y = y - (int)s;//鸟的坐标位置
        double v= v0- g * t ;//下次的速度
        speed = v;
        alpha = Math.atan(s/8);
    }
    //鸟向上飞翔
    public void flappy() {
        speed = v0;
    }

    public boolean hit(Ground ground) {
        boolean hit = y + size/20 >ground.y;
        if (hit){
            y = ground.y - size/2; //装上后鸟的y坐标
            alpha = - 3.14/2;//摔倒后鸟嘴朝下
        }
        return hit;
    }
    public boolean hit(Column column){
        //检测是否在柱子范围内
        if(x>column.x-column.width/2 - size/2 && x< column.x + column.width/2 + size/2){
            //检测是否在缝隙中
            if(y>column.y - column.gap/2 + size/2 && y<column.y + column.gap/2 -size/2){
                return false;
            }
            return true;
        }
        return false;
    }
}
