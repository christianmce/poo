import greenfoot.*; 
/**
 * @author <Dr. Christian Mauricio Castillo Estrada>
 * @version 1.0 2025
 */
public class MyWorld extends World
{
   
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 700, 1); 
        crearPlantas();
        prepare();
    }    
    
    private void prepare()
    {

    }
    
    public void crearPlantas(){

        for(int i=0;i<5;i++){
        	Planta o1 = new Planta();
        	int x = Greenfoot.getRandomNumber(getWidth());
        	int y = Greenfoot.getRandomNumber(getHeight());
        	addObject(o1,x,y);
        }

    }            
}
