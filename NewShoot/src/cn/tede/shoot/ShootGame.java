package cn.tede.shoot;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.TimerTask;

//import static java.util.concurrent.locks.StampedLock.STATE;


public class ShootGame extends JPanel {
    public static final int WIDTH =400;
    public static final int HEIGHT =654;
    private int state;
    public static final int START = 0;
    public static final int RUNNING = 1;
    public static final int PAUSE = 2;
    public static final int GAME_OVER =4;

    public static BufferedImage background;
    public static BufferedImage start;
    public static BufferedImage airplane;
    public static BufferedImage bee;
    public static BufferedImage bullet;
    public static BufferedImage hero0;
    public static BufferedImage hero1;
    public static BufferedImage pause;
    public static BufferedImage gameover;

    private FlyingObject[] flyings = {}; //敌机数组
    private Bullet [] bullets = {}; //子弹数组
    private Hero hero = new Hero();//英雄鸡

    private Timer timer;//定时器
    private int intervel = 1000/100; //时间间隔，十毫秒

    private int score = 0;//得分
//    public ShootGame(){
////        flyings  = new FlyingObject[2];
////        flyings[0] = new AirPlane();
////        flyings[1] = new Bee();
////        bullets = new Bullet[1];
////        bullets[0] = new Bullet(180,300);
//    }
    static{//静态代码块
        try {
            background= ImageIO.read(ShootGame.class.getResource("background.png"));
            start= ImageIO.read(ShootGame.class.getResource("start.png"));
            airplane = ImageIO.read(ShootGame.class.getResource("airplane.png"));
            bee = ImageIO.read(ShootGame.class.getResource("bee.png"));
            bullet = ImageIO.read(ShootGame.class.getResource("bullet.png"));
            //bullet = ImageIO.read(ShootGame.class.getResource("B1.png"));
            //hero0= ImageIO.read(ShootGame.class.getResource("C.png"));
            hero0= ImageIO.read(ShootGame.class.getResource("hero0.png"));
            hero1 = ImageIO.read(ShootGame.class.getResource("hero1.png"));
            pause= ImageIO.read(ShootGame.class.getResource("pause.png"));
            gameover = ImageIO.read(ShootGame.class.getResource("gameover.png"));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void paint(Graphics g) {
        g.drawImage(background,0,0,null);//画背景图片
        paintHero(g);
        paintBullets(g);
        paintFlyingObject(g);
        paintScore(g);//画分数
       // paintPause(g);
        paintState(g);


    }

    /**
     * 画游戏状态
     *
     */
    public void paintState(Graphics g){
        switch(state){
            case START:
                g.drawImage(start,0,0,null);
                break;
            case PAUSE:
                g.drawImage(pause, 0, 0, null);
                break;
            case GAME_OVER:
                g.drawImage(gameover, 0, 0, null);
                break;
        }
    }

    /**
     * 画分数
     * @param g
     */
    public void paintScore(Graphics g){
        Font font = new Font(Font.SANS_SERIF, Font.BOLD,4);
        g.setColor(new Color(0xffff0));//设置字体

        g.drawString("SCORE"+score,10,25);
        g.drawString("LIFE"+hero.getLife(),10,45);
    }
    //画英雄鸡
    public void  paintHero(Graphics g){
        g.drawImage(hero.getImage(),hero.getX(),hero.getY(),null);
    }
    //画子弹
    public void paintBullets(Graphics g){
        for(int i = 0;i < bullets.length; i++){
            Bullet b = bullets[i];
            g.drawImage(b.getImage(),b.getX(),b.getY(),null);
        }
    }
    //画飞行物
    public void paintFlyingObject(Graphics g){
        for(int i = 0; i< flyings.length;i++){
            FlyingObject f = flyings[i];
            g.drawImage(f.getImage(),f.getX(),f.getY(),null);
        }
    }
//    //画暂停
//    public void paintPause(Graphics g){
//        g.drawImage(pause,0,0,null);
//    }

    //随机生成飞行物
    public static FlyingObject nextOne(){
        //返回 飞行物对象
        Random random = new Random();
        int type = random.nextInt(20);//生成随机数0-19
        if(type == 0){
            return new Bee();
        }else{
            return new AirPlane();
        }
    }
    int flyEnterIndex = 0;
    //飞行物入场
    public void enterAction () {

        flyEnterIndex++;
        if (flyEnterIndex % 40 == 0) {//每调用40次该方法
            FlyingObject obj = nextOne();//随机生成一个飞行物
            flyings = Arrays.copyOf(flyings, flyings.length + 1);//扩容
            flyings[flyings.length - 1] = obj;//放在最后一位
        }
    }


    /*
    实现飞行物移动
     */
    public void stepAction() {
        for (int i = 0; i < flyings.length; i++){
            FlyingObject f =  flyings[i];
            f.step();
        }
        for(int i = 0;i<bullets.length;i++){
            /**
             * 子弹走
             *
             */
            Bullet b = bullets[i];
            b.step();
//            bullets[i].step();
        }
        hero.step();
    }
    int shootIndex = 0;
    //射击
    public void shootAction() {
        //调用30次该方法发射一次子弹，
        //英雄级打出子弹
        //扩容
        //追加数组
        shootIndex++;
        if (shootIndex % 30 == 0) {//每调用30次该方法
            Bullet [] bs = hero.shoot();//英雄鸡打出子弹
            bullets = Arrays.copyOf(bullets, bullets.length + bs.length);//扩容
            System.arraycopy(bs,0,bullets,bullets.length - bs.length,bs.length);
        }
    }


    public void bangAction() {
        for (int i = 0; i< bullets.length; i++){
            Bullet b = bullets[i];
            bang(b);
        }
    }

    private void bang(Bullet bullet) {
        int index = -1;
        for (int i = 0; i <flyings.length;i++){
            FlyingObject obj = flyings[i];
            if(obj.shootBy(bullet)){
                index = i;
                break;
            }
        }
        if(index != -1) {
            //击中
            FlyingObject one = flyings[index];//记录被击中的飞行物
            FlyingObject temp = flyings[index];//被击中的飞行物与最后一个飞行物交换
            flyings[index] = flyings[flyings.length - 1];
            flyings[flyings.length - 1] = temp;
            //删除最后一个飞行物(被击中的飞行物)
            flyings = Arrays.copyOf(flyings, flyings.length - 1);

            //检测one的类型，若果是敌人就加分


            if (one instanceof Enemy) {
                Enemy e = (Enemy) one;
                score += e.getScore();
            }
            if (one instanceof Award) {
                Award a = (Award) one;
                int type = a.getType();
                switch (type) {
                    case Award.DOUBLE_FIRE:
                        hero.addDoubleFire();
                        break;
                    case Award.LIFE:
                        hero.addLife();
                        break;
                }
            }
        }
        //如果one的类型就奖励，则设置奖励
    }

    /**
     * 删除越界的飞行物和子弹，小蜜蜂，飞机
     */

    public void outOfBoundsAction() {
        int index = 0;
        FlyingObject[] flyingLives = new FlyingObject[flyings.length];//没有碰撞的飞行物
        for (int i = 0; i < flyings.length; i++) {
            FlyingObject f = flyings[i];
            if (!f.outOfBounds()) {
                flyingLives[index++] = f;//没有越界的存储到或者的数组
            }
        }
        flyings = Arrays.copyOf(flyingLives, index);//没有越界的都留着

        index = 0;
        Bullet[] bulletLives = new Bullet[bullets.length];//存储没有发生碰撞的子弹
        for (int i = 0; i < bullets.length; i++) {
            Bullet b = bullets[i];
            if (!b.outOfBounds()) {//如果没有越界
                bulletLives[index++] = b;
            }
        }
        bullets = Arrays.copyOf(bulletLives,index);
    }

    /**
     * 检测游戏是否结束
     */
    public boolean isGameOver() {
        for (int i = 0; i < flyings.length; i++) {//遍历所有飞行物
            int index = -1;//没有发生碰撞
            FlyingObject obj = flyings[i];
            if(hero.hit(obj)){//检查英雄鸡与飞行物是否碰撞
                hero.subtractLife();//减命
                hero.setDoubleFire(0);//双倍火力清零
                index = i;//将碰撞飞行物的下标给到index
            }
            if(index!=-1){
                FlyingObject t = flyings[index];
                flyings[index] =  flyings[flyings.length - 1];
                flyings[flyings.length - 1] = t;//发生碰撞的元素和最后一个元素交换
                flyings = Arrays.copyOf(flyings,flyings.length-1);
            }
        }
        return hero.getLife() <= 0;
    }

    /**
     * 检查游戏是否结束
     */
    public void checkGameOverAction() {
        if(isGameOver()){//如果已经结束
            state = GAME_OVER;//改变状态为结束

        }
    }
    public void action(){
        //鼠标监听事件
        MouseAdapter i = new MouseAdapter(){
            public void mouseMoved(MouseEvent e) {//鼠标移动
                if(state == RUNNING) {
                    int x = e.getX();
                    int y = e.getY();
                    hero.moveTo(x, y);
                }
            }
            public void mouseEntered(MouseEvent e){//鼠标进入
                if(state == PAUSE){
                    state = RUNNING;
                }
            }

            @Override
            public void mouseExited(MouseEvent e) {//鼠标退出
                if(state!=GAME_OVER&&state!=START){
                    state = PAUSE;//游戏装态不是GAMEOVER ，鼠标离开窗口 ，设置暂停
                }
            }

            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                //鼠标点击事件
                switch(state){
                    case START:
                        state = RUNNING;
                        break;
                    case GAME_OVER://当状态是结束的时候，点击鼠标，会重新初始化各个对象，状态变为开始
                        flyings = new FlyingObject[0];
                        bullets = new Bullet[0];
                        hero = new Hero();
                        score = 0;
                        state  = START;


                }
            }
        };
        this.addMouseListener(i);//处理鼠标点击事件
        this.addMouseMotionListener(i);//处理鼠标滑动操作
        //启动执行代码
        java.util.Timer timer = new java.util.Timer();
        timer.schedule(new TimerTask() {
            public void run() {
                if(state == RUNNING){
                    enterAction();//飞行物入场
                    stepAction();//飞行物走一步
                    shootAction();
                    bangAction();
                    isGameOver();
                    checkGameOverAction();//检查游戏结束
                    outOfBoundsAction();
                }
                repaint();//重绘，调用paint方法

            }
        }, intervel ,intervel);//10毫秒以后，每隔10毫秒执行一次
    }
    public static void main(String[] args){
        JFrame frame = new JFrame("飞机大战");//画框
        ShootGame game = new ShootGame();
        frame.add(game);
        frame.setSize(WIDTH, HEIGHT);//窗口的大小
        frame.setAlwaysOnTop(true);//窗口在最上边
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//点x关闭
        frame.setLocationRelativeTo(null);//设置窗体的初始记录
        frame.setVisible(true);//尽快调用paint方法
        game.action();




    }
}

