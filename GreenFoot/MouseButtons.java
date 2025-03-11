import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
 
 
public class Button extends Actor
{
    public static int clicks;
    public int imageNumber;
    public int imageNumber2;
    public int imageNumber3;
    private Counter counter;
    public static int x = 1;
    public static int y = 0;
    public static int z = 0;
    public static int a = 0;
    public Button(Counter pointCounter){
    counter = pointCounter;
     
     
    }
    /**
     * Act - do whatever the Button wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mousePressed(this)){
        clicks = clicks + x;
        Greenfoot.playSound("Click2-Sebastian-759472264.wav");
        counter.add(x);
        updateImage2();
        
         
        }
        if(clicks == 50){
        updateImage();
        x = 5;
        clicks = 55;
        }
        if(clicks == 500){
        updateImage();
        x = 25;
        clicks = 525;
        }
        if(clicks == 5000){
        updateImage();
        x = 125;
        clicks = 5125;
        }
        if(clicks == 50000){
        updateImage();
        x = 625;
        clicks = 381;
        }
        if(clicks == 500000){
        updateImage();
        x = 3125;
        clicks = 783;
        }
        if(y >= 0){
        if(z != 2000000){
        z++;
        }
        if(z == 2000000){
        counter.add(y);
        z = 0;
        }
        if(y == 5){
        y = 0;
        }
        }
         if(a != 30){
        a++;
         
        }
        if(a == 30){
        setImage("button" + imageNumber + ".png");
        a = 0;
        }
         
    }    
    public void updateImage(){
    imageNumber++;
    if(imageNumber == 7){
    imageNumber = 0;
    }
    setImage("button" + imageNumber + ".png");
    }
    public void updateImage2(){
    imageNumber2++;
    if(imageNumber2 == 7){
    imageNumber2 = 0;
    }
    setImage("button" + imageNumber + " - Copy.png");
    }
   
}
