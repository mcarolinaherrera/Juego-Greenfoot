import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemigo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemigo extends movers
{
    /**
     * Act - do whatever the Enemigo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    public void orilla()
    {
        int x = getX();
        int y = getY();
        int width = getWorld().getWidth() - 1;
        int height = getWorld().getHeight() - 1;
        if( x >= width)
        {
            setLocation( 1, y);
        }
        if( x <= 0)
        {
            setLocation( width - 1, y);
        }
        if( y >= height)
        {
            setLocation( x, 1);
        }
        if( y <= 0)
        {
            setLocation( x, height - 1);
        }
    }
}

