import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class cat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class cat extends jugador
{
    /**
     * Act - do whatever the cat wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public cat()
    {
        getImage().scale(getImage().getWidth()/(2), getImage().getHeight()/(2));
    }
    public void act()
    {
        deslizarse();
        ganar();
        golpe();
    }
    public void golpe()
    {
        if(ouch())
        {
            setLocation(89, 521);
        }
    }
}
