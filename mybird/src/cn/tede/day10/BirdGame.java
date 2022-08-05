package cn.tede.day10;
//画板

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;

public class BirdGame extends JPanel {
    Bird bird;
    Ground ground;
    Column column1, column2;
    BufferedImage background;

    //实现积分
    int score;

    //boolean gameover;//默认为false，游戏未结束
    BufferedImage startImage;
    BufferedImage gameOverImage;

    //游戏状态
    int state;
    public static final int START = 0;
    public static final int RUNNING = 1;
    public static final int GAME_OVER = 2;

    public BirdGame() throws Exception {
        //无参构造
        //创建对象

        bird = new Bird();
        ground = new Ground();
        column1 = new Column(1);
        column2 = new Column(2);
        background = ImageIO.read(getClass().getResource("bg.png"));
        //gameover = false;
        startImage = ImageIO.read(getClass().getResource("start.png"));
        gameOverImage = ImageIO.read(getClass().getResource("gameover.png"));

        state = START;
    }

    @Override
    public void paint(Graphics g) {//Graphics画笔
        g.drawImage(background, 0, 0, null);//画背景
        //画第一个柱子
        g.drawImage(column1.image, column1.x - column1.width / 2, column1.y - column1.height / 2, null);//
        g.drawImage(column2.image, column2.x - column2.width / 2, column2.y - column2.height / 2, null);
        //画地面
        g.drawImage(ground.image, ground.x, ground.y, null);
        //旋转的绘图坐标系
        Graphics2D g2 = (Graphics2D) g;
        g2.rotate(-bird.alpha, bird.x, bird.y);//旋转

        //画鸟
        g.drawImage(bird.image, bird.x - bird.width / 2, bird.y - bird.height / 2, null);
        g2.rotate(bird.alpha, bird.x, bird.y);

        //添加绘制分数
        Font f = new Font(Font.SANS_SERIF, Font.BOLD, 40);
        g.setFont(f);
        g.drawString("" + score, 40, 60);
        g.setColor(Color.white);
        g.drawString("" + score, 37, 57);

//        if(gameover){
//            g.drawImage(gameOverImage,0,0,null);
//        }
        switch (state) {
            case GAME_OVER:
                g.drawImage(gameOverImage, 0, 0, null);
                break;
            case START:
                g.drawImage(startImage, 0, 0, null);
                break;
        }
    }


    public void action() throws Exception {
        //鼠标控制上,匿名内部类
        MouseListener l = new MouseAdapter() {
            //鼠标按下
            public void mousePressed(MouseEvent e) {
                //bird.flappy();

                try {
                    switch (state) {
                        case GAME_OVER:
                            column1 = new Column(1);
                            column2 = new Column(2);
                            bird = new Bird();
                            score = 0;
                            state = START;
                            break;
                        case START:
                            state = RUNNING;
                        case RUNNING:
                            bird.flappy();
                    }
                    }catch(Exception e2){
e2.printStackTrace();
                    }
                }
            };
        //鼠标添加到画板
        addMouseListener(l);


        while (true) {
//            if(!gameover){
//                ground.step();
//                column1.step();
//                column2.step();
//                bird.step();
//                bird.fly();
//            }
//
//            //撞地结束
//            if(bird.hit(ground) || bird.hit(column1)||bird.hit(column2)){
//                gameover = true;
//            }

//            //积分逻辑
//            if(bird.x == column1.x || bird.x == column2.x){
//                score++;
            switch (state) {
                case START:
                    bird.fly();
                    ground.step();
                    break;
                case RUNNING:
                    column1.step();
                    column2.step();
                    bird.step();
                    bird.fly();
                    ground.step();
                    //积分逻辑
                    if (bird.x == column1.x || bird.x == column2.x) {
                        score++;
                    }
                    //撞地结束
                    if (bird.hit(ground) || bird.hit(column1) || bird.hit(column2)) {
                        state = GAME_OVER;
                    }
                    break;
                default:
                    break;
            }
                    repaint();//刷新，重新绘制界面
                    Thread.sleep(1000 / 30);//一秒刷新30次
            }
        }


        public static void main (String[]args) throws Exception {
            JFrame frame = new JFrame("FlyBird");//画框
            BirdGame game = new BirdGame();
            frame.add(game);
            frame.setSize(440, 670);//窗口大小
            frame.setLocationRelativeTo(null);//窗口位置 ,null -> 居中
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//点击窗口x，程序自动关闭
            frame.setVisible(true);//尽快调用paint方法
            game.action();
        }
    }

