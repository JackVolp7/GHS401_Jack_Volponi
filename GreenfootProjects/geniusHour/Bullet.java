import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Bullet extends Actor
{
    private int speed=30;
    
    public void act() 
    {        
        setLocation(this.getX()+speed,this.getY());
        hitDetection();
    }
    public void hitDetection()
    {
         Actor a = getOneIntersectingObject(player2.class);  
         Actor b = getOneIntersectingObject(Rock.class);
         if(a != null)  
         {  
             player2.health-=30;
             getWorld().removeObject(this);
         }
         if(b != null)  
         {  
             getWorld().removeObject(this);
         }
    }
}