import greenfoot.*;  // UNACH
/**
 * @author <Dr. Christian Mauricio Castillo Estrada>
 * @version 2025
 */
public class Tractor extends Actor
{    
    public void act()
    {
        if(Greenfoot.isKeyDown("space")){
        	turn(-3);
        }
        if(Greenfoot.isKeyDown("down")){
        	setLocation(getX(), getY()+1); // down
        }
        if(Greenfoot.isKeyDown("right")){
        	setLocation(getX()+1, getY()); // right
        }
        if(Greenfoot.isKeyDown("left")){
        	setLocation(getX()-1, getY()); // right
        }
        
        removeTouching(Planta.class);
    }
}
