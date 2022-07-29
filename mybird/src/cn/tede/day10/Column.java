package cn.tede.day10;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

//柱子
public class Column {
    int x, y;//图片中心位置
    int width, height;
    BufferedImage image;
    int gap;//柱子中间缝隙
    int distance;//两个柱子之间距离,中心点
    Random random = new Random();

    public Column(int n) throws IOException {
        image = ImageIO.read(getClass().getResource("column.png"));
        width = image.getWidth();
        height = image.getHeight();
        gap = 144;//缝隙，多方测量得出的144
        distance = 245;
        x = 550 + (n - 1) * 245;
        y = random.nextInt(219) + 132;
    }

    //柱子移动
    public void step() {
        x--;//x向左做匀速直线运动
        if (x == -width / 2) {
            x = distance * 2 - width / 2;
            y = random.nextInt(219) + 132;
        }
    }
}
