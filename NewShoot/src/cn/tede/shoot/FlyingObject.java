package cn.tede.shoot;
//父类
import java.awt.image.BufferedImage;

public abstract class FlyingObject {
    protected int x;//x坐标
    protected int y;//y坐标
    protected int width;//宽
    protected int height;//高
    protected BufferedImage image;//图片

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public BufferedImage getImage() {
        return image;
    }

    public void setImage(BufferedImage image) {
        this.image = image;
    }
    public abstract void step();
    public boolean shootBy(Bullet bullet){
        int x= bullet.x;
        int y = bullet.y;
        return this.x<x&&x<this.x+width&&this.y<y && y<this.y+height;
    }

    /**
     * 检查是否出界
     * @return
     */
    public abstract  boolean outOfBounds();//

    /**
     * 检测是否碰墙
     */
    public abstract boolean hitColumn();
}
