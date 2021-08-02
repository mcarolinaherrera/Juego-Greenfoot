import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class awaa here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class awaa extends Enemigo
{
    /**
     * Act - do whatever the awaa wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    boolean upDown;
    int speed = 2;
    public awaa(boolean upAndDown)
    {
        getImage().scale(getImage().getWidth()/2, getImage().getHeight()/2);
        upDown = upAndDown;
    }
    public void act()
    {
        moveAround();
        awalim();
    }
    public void awalim()
    {
        if(limite())
        {
            speed = -speed;
        }
    }
    private void moveAround()
    {
        int x = getX();
        int y = getY();
        if (upDown)
        {
            setLocation(x, y + speed);
        }
        else if (!upDown)
        {
            setLocation(x + speed, y);
        }
    }
}
