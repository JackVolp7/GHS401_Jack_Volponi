import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Bullet2 extends Actor
{
    private int speed=30;
    
    public void act() 
    {        
        setLocation(this.getX()-speed,this.getY());
        /*if(isAtEdge())
        {
            getWorld().removeObject(this);
        }*/
        hitDetection();
    } 
    public void hitDetection()
    {
         Actor c = getOneIntersectingObject(player.class);  
         Actor d = getOneIntersectingObject(Rock.class);
         
         if(c != null)  
         {  
             player.healthP1-=30;            
             getWorld().removeObject(this);
         }  
         if(d != null)  
         {  
             getWorld().removeObject(this);
         }
    }
}
