// <author>: Dr. Christian Mauricio Castillo Estrada 
// Facultad de Negocios, Universidad Autónoma de Chiapas

public class Planta extends Actor
{   
    public void act()
    {
        if (Greenfoot.mouseClicked(this)) {
           getWorld().showText("Planta 1", 500, 100);
           getWorld().removeObject(this);
        }
    }
}

// ******************************************************************
// Dragg image by Mouse

public class Planta extends Actor
{   
    private boolean drag=false;
    private int rx=0,ry=0;
    
    public void act()
    {
        if(Greenfoot.mouseDragged(this)){
	        
            MouseInfo mouse = Greenfoot.getMouseInfo();
	        if(!drag){
		        drag=true;
		        rx=getX()-mouse.getX();
		        ry=getY()-mouse.getY();	
	        }
	        else{
		        setLocation(mouse.getX() +rx, mouse.getY()+ry);
	        }

	        if(Greenfoot.mouseDragEnded(this)){
		        drag=false;
	        }
        }
    }
}
