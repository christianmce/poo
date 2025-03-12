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
