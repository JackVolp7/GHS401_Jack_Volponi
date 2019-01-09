import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class player extends Actor
{
    /**
     * Act - do whatever the player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       movement();
       checkShot();
    }
    public void movement()
    {
        int playerX = this.getX();
        int playerY = this.getY();
        
        if(Greenfoot.isKeyDown("w") && Greenfoot.isKeyDown("d"))
        {
            setLocation(playerX+5,playerY-5);
        }
        else if(Greenfoot.isKeyDown("w") && Greenfoot.isKeyDown("a"))
        {
            setLocation(playerX-5,playerY-5);
        }
        else if(Greenfoot.isKeyDown("s") && Greenfoot.isKeyDown("a"))
        {
            setLocation(playerX-5,playerY+5);
        }
        else if(Greenfoot.isKeyDown("s") && Greenfoot.isKeyDown("d"))
        {
            setLocation(playerX+5,playerY+5);
        }
        else if(Greenfoot.isKeyDown("a"))
        {
             setLocation(playerX-5,playerY);
        }
        else if(Greenfoot.isKeyDown("d"))
        {
            setLocation(playerX+5,playerY);
        }
        else if(Greenfoot.isKeyDown("w"))
        {
            setLocation(playerX,playerY-5);
        }
        else if(Greenfoot.isKeyDown("s"))
        {
           setLocation(playerX,playerY+5);
        }
        
    }
    public void checkShot()
    {
        if(Greenfoot.isKeyDown("space"))
        {
            getWorld().addObject(new Bullet(),getX(),getY());
        }
    }
}

