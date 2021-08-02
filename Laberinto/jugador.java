import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class jugador here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class jugador extends movers
{
    /**
     * Act - do whatever the jugador wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    public void ganar()
    {
        if(isTouching(comida.class))
        {
            getWorld().addObject(new ganarpantalla(), getWorld().getWidth()/2, getWorld().getHeight()/2);
            Greenfoot.stop();
        }
    }
}
