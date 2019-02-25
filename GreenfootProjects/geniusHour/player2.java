
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.concurrent.TimeUnit;


public class player2 extends Actor
{
    long lastBullet = System.currentTimeMillis();
    GreenfootSound gunshot = new GreenfootSound("gunshot.wav");
    public static int health=100;
    private float timer;
    private int lastLocationX;
    private int lastLocationY;
    
    public player2()
    {
        health=100;
    }
    public void act() 
    {
       movement();
       checkShot();
       getWorld().showText("health Player 2: "+health, 100,100);
       timer+=120;
    }
    public void movement()
    {
        int playerX = this.getX();
        int playerY = this.getY();
        
        if(Greenfoot.isKeyDown("up") && Greenfoot.isKeyDown("right"))
        {
            setLocation(playerX+5,playerY-5);
        }
        else if(Greenfoot.isKeyDown("up") && Greenfoot.isKeyDown("left"))
        {
            setLocation(playerX-5,playerY-5);
        }
        else if(Greenfoot.isKeyDown("down") && Greenfoot.isKeyDown("left"))
        {
            setLocation(playerX-5,playerY+5);
        }
        else if(Greenfoot.isKeyDown("down") && Greenfoot.isKeyDown("right"))
        {
            setLocation(playerX+5,playerY+5);
        }
        else if(Greenfoot.isKeyDown("left"))
        {
             setLocation(playerX-5,playerY);
        }
        else if(Greenfoot.isKeyDown("right"))
        {
            setLocation(playerX+5,playerY);
        }
        else if(Greenfoot.isKeyDown("up"))
        {
            setLocation(playerX,playerY-5);
        }
        else if(Greenfoot.isKeyDown("down"))
        {
           setLocation(playerX,playerY+5);
        }
        
    }
    public void checkShot()
    {
        long currentTime = System.currentTimeMillis();
        
        if(Greenfoot.isKeyDown("m") && currentTime >= lastBullet+600)
        {
            gunshot.play();
            getWorld().addObject(new Bullet2(),getX(),getY());
            lastBullet=currentTime;
        }
    }
    public void clipping()
    {
        if(timer%0.5==0)
        {
            lastLocationX=this.getX();
            lastLocationY=this.getY();
        }
    }
}
