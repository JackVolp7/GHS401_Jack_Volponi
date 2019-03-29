import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Baby extends Actor
{
    /**
     * Act - do whatever the Baby wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
    
       */
    
    
    public void act() 
    {
        
        setLocation(this.getX(),this.getY()-5);       
        
        Actor a = getOneIntersectingObject(Target.class);  
        
        if(a != null)
        {
            getWorld().removeObject(a);
        }
        
    }    
}
