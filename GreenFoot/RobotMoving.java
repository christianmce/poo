// Dr. Christian Mauricio Castillo Estrada
// Facultad de Negocios CIV Universidad Autónoma de Chiapas

public class Robot extends Actor
{
   
    public void act()
    {
        int x,y;
        if(Greenfoot.isKeyDown("enter")){
            for(y=400;y>250;y-=7){
                Greenfoot.delay(5);
            setLocation(100, y);
            }
            
            turn(90);  // or use: // setRotation(90);
            
            for(x=100;x<400;x+=7){
                Greenfoot.delay(5);
            setLocation(x, y);
            }
        }
        
        
    }
}
