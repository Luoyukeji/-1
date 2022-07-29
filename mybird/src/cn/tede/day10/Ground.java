package cn.tede.day10;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;

//地面
public class Ground {
    int x, y;
    int width, height;
    BufferedImage image;//地面图片

    public Ground() throws Exception {
        image = ImageIO.read(getClass().getResource("ground.png"));
        width = image.getWidth();
        height = image.getHeight();
        x = 0;
        y = 500;//地面开始坐标
    }

    public void step() {
        x--;
        if (x == -100) {
            x = 0;
        }
    }
}