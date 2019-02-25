import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.concurrent.TimeUnit;

public class player extends Actor
{
    long lastBullet = System.currentTimeMillis();
    GreenfootSound gunshot = new GreenfootSound("gunshot.wav");
    
    public static int healthP1=100;
    public player()
    {
        healthP1 = 100;               
    }
    public void act() 
    {
       movement();
       checkShot();
       getWorld().showText("health Player 1: "+healthP1, 100, 500);
       if(healthP1<=0)
       {
           getWorld().showText("Player2 Wins", getWorld().getWidth()/2, getWorld().getHeight()/2);
           getWorld().removeObject(this);
       }
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
        long currentTime = System.currentTimeMillis();
        
        if(Greenfoot.isKeyDown("space") && currentTime >= lastBullet+600)
        {
            gunshot.play();
            getWorld().addObject(new Bullet(),getX(),getY());
            lastBullet=currentTime;
        }
    }
    
    
}
