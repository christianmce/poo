import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
 
/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    int strenght = 5;
    int str = 50;
    int xachse = 70;
    int yachse = 98;
    int time = 140;
    int delay = 65;
    private boolean mseBtnDown;
    private int mseX, mseY;
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        buttons();
        //fallen();
        jump();
    }    
 
    public void fallen() {
        if (getY() != 440) {
            Greenfoot.setSpeed(50);
            int i = 0;
            int y = 0;
            int x = 0;
            int initialY = getY();
            while (getY() <= 440 && getY() != 440) {
                x = x * x;
                x = -x;
 
                y = x;
                x = i;
 
                x++;
                i++;
 
                setLocation(getX(), initialY - y);
                if (getY() > 440 && getY() != 440) {
                    setLocation(getX(), 440);
                }
                Greenfoot.delay(1);
            }
            setLocation(getX(), 440);
            Greenfoot.setSpeed(65);
        }
    }
 
    public void buttons() {
        if (Greenfoot.isKeyDown("e")) {
            World world = (World) getWorld();
            while (Greenfoot.isKeyDown("e")) {
            }
            world.showText("Wähle Sprungweite 1-9 (aktuell: " + strenght + " )", 600, 50);
            world.repaint();
            while (!Greenfoot.isKeyDown("1") && !Greenfoot.isKeyDown("2") && !Greenfoot.isKeyDown("3")  && !Greenfoot.isKeyDown("4") && !Greenfoot.isKeyDown("5") && !Greenfoot.isKeyDown("6") && !Greenfoot.isKeyDown("7") && !Greenfoot.isKeyDown("8") && !Greenfoot.isKeyDown("9") && !Greenfoot.isKeyDown("escape")) {
            }
            while (Greenfoot.isKeyDown("1") || Greenfoot.isKeyDown("2") || Greenfoot.isKeyDown("3")  || Greenfoot.isKeyDown("4") || Greenfoot.isKeyDown("5") || Greenfoot.isKeyDown("6") || Greenfoot.isKeyDown("7") || Greenfoot.isKeyDown("8") || Greenfoot.isKeyDown("9") || Greenfoot.isKeyDown("escape")) {
            }
            strenght = Integer.parseInt(Greenfoot.getKey());
            world.showText(null, 600, 50);
            world.repaint();
            str = strenght * 10;
 
            if (str == 10) {
                xachse = 32;
                yachse = 102;
                time = 64;
                delay = 58;
            }else if (str == 20) {
                xachse = 45;
                yachse = 101;
                time = 90;
                delay = 60;
            }else if (str == 30) {
                xachse = 54;
                yachse = 97;
                time = 108;
                delay = 62;
            }else if (str == 40) {
                xachse = 63;
                yachse = 99;
                time = 126;
                delay = 64;
            }else if (str == 50) {
                xachse = 70;
                yachse = 98;
                time = 140;
                delay = 65;
            }else if (str == 60) {
                xachse = 77;
                yachse = 99;
                time = 154;
                delay = 65;
            }else if (str == 70) {
                xachse = 84;
                yachse = 101;
                time = 168;
                delay = 66;
            }else if (str == 80) {
                xachse = 89;
                yachse = 99;
                time = 178;
                delay = 66;
            }else if (str == 90) {
                xachse = 95;
                yachse = 100;
                time = 190;
                delay = 67;
            }else {
                System.out.println("wtf ru doing?");
            }
        }
        if (Greenfoot.mousePressed(null)) {
            MouseInfo mouse = Greenfoot.getMouseInfo();
            // updatting button state
            if (!mseBtnDown && Greenfoot.mousePressed(null)) mseBtnDown = true;
            if (mseBtnDown && Greenfoot.mouseClicked(null)) mseBtnDown = false;
            // for button down state
            if (mseBtnDown)
            {
                // updating mouse position
                if (mouse != null)
                {
                    mseX = mouse.getX();
                    mseY = mouse.getY();
                }
                // moving
                turnTowards(mseX, mseY);
                move(3);
                setRotation(0);
            }
        }
        if (!Greenfoot.isKeyDown("space") && Greenfoot.isKeyDown("a") && !Greenfoot.isKeyDown("d")) {
            setLocation(getX() - 1, getY());
            setRotation(getRotation() - 1);
            Greenfoot.delay(1);  
        }
        if (!Greenfoot.isKeyDown("space") && !Greenfoot.isKeyDown("a") && Greenfoot.isKeyDown("d")) {
            setLocation(getX() + 1, getY());
            setRotation(getRotation() + 1);
            Greenfoot.delay(1);            
        }
    }
 
    public int stärke (int stärke) {
 
        if (stärke < 10 && stärke > 0) {
            return stärke;
        }else {
            return 5;
        }
 
    }
 
    public void jump() {
        if (Greenfoot.isKeyDown("space")) {
            int height = 0;
            int speed = 0;
 
            int y;
            int x = 0;
            int initialX = getX();
            int initialY = getY();
 
            if (Greenfoot.isKeyDown("space") && !Greenfoot.isKeyDown("a") && !Greenfoot.isKeyDown("d")) {
                Greenfoot.setSpeed(49);
                for (int i = 0; i <= 20; i++) {
 
                    x = x - 10;
                    x = x * x;
                    x = -x;
                    x = x + 100;
 
                    y = x;
                    x = i;
 
                    x = x + 1;
 
                    setLocation(getX(), initialY - y);
 
                    Greenfoot.delay(1);
 
                }
                Greenfoot.setSpeed(65);
            }else if (Greenfoot.isKeyDown("space") && Greenfoot.isKeyDown("a") && !Greenfoot.isKeyDown("d")) {
                Greenfoot.setSpeed(delay);
                for (int i = 0; i <= time; i++) {
 
                    x = x - xachse;
                    x = x * x;
                    x = -x / str;
                    x = x + yachse;
 
                    y = x;
                    x = i;
 
                    x = x + 1;
 
                    setLocation(initialX - x, initialY - y);
                    setRotation(getRotation() - 1);
                    Greenfoot.delay(1);
                }
                Greenfoot.setSpeed(65);
            }else if (Greenfoot.isKeyDown("space") && !Greenfoot.isKeyDown("a") && Greenfoot.isKeyDown("d")) {
                Greenfoot.setSpeed(delay);
                for (int i = 0; i <= time; i++) {
 
                    x = x - xachse;
                    x = x * x;
                    x = -x / str;
                    x = x + yachse;
 
                    y = x;
                    x = i;
 
                    x = x + 1;
 
                    setLocation(initialX + x, initialY - y);
                    setRotation(getRotation() + 1);
                    Greenfoot.delay(1);
                }
                Greenfoot.setSpeed(65);
            }else if (Greenfoot.isKeyDown("space") && Greenfoot.isKeyDown("a") && Greenfoot.isKeyDown("d")) {
                Greenfoot.setSpeed(50);
                for (int i = 0; i <= 20; i++) {
 
                    x = x - 10;
                    x = x * x;
                    x = -x;
                    x = x + 100;
 
                    y = x;
                    x = i;
 
                    x = x + 1;
 
                    setLocation(getX(), initialY - y);
                    Greenfoot.delay(1);
                }
                Greenfoot.setSpeed(65);
            }
        }    
    }
 
    public void funktion() {
        int y = 100;
        int x = 10;
        int initialY = getY();
        for (int i = 10; i <= 20; i++) {
            x = x - 10;
            x = x * x;
            x = -x;
            x = x + 100;
 
            y = x;
            x = i;
 
            x++;
 
            System.out.println("X = " + x);
            System.out.println("Y = " + y);
        }
    }
}
