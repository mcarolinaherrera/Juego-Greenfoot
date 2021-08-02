import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class movers here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class movers extends Actor
{
    int speed = 4;
    /**
     * Act - do whatever the movers wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }

    public void moveAndTurn()
    {
        if(Greenfoot.isKeyDown("right"))
        {
            setRotation(0);
            move(4);
        }
        if(Greenfoot.isKeyDown("left"))
        {
            setRotation(180);
            move(4);
        }
        if(Greenfoot.isKeyDown("up"))
        {
            setRotation(270);
            move(4);
        }
        if(Greenfoot.isKeyDown("down"))
        {
            setRotation(90);
            move(4);
        }
    }

    public void deslizarse()
    {
        int x = getX();
        int y = getY();
        if(Greenfoot.isKeyDown("right"))
        {
            setLocation(x + speed, y);
            if(limite())
            {
                setLocation(x - speed, y);
            }
        }
        if(Greenfoot.isKeyDown("left"))
        {
            setLocation(x - speed, y);
            if(limite())
            {
                setLocation(x + speed, y);
            }
        }
        if(Greenfoot.isKeyDown("up"))
        {
            setLocation(x, y - speed);
            if(limite())
            {
                setLocation(x, y + speed);
            }
        }
        if(Greenfoot.isKeyDown("down"))
        {
            setLocation(x, y + speed);
            if(limite())
            {
                setLocation(x, y - speed);
            }
        }
    }

    public boolean limite()
    {
        if (isTouching(bloque.class))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public boolean ouch()
    {
        if (isTouching(Enemigo.class))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
