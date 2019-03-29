import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

public class SpaceShip extends Actor
{
    private List<SpaceJunk> spaceJunkObjects;
    private int removed;
    public SpaceShip()
    {
        spaceJunkObjects=new ArrayList<SpaceJunk>(); 
        this.removed=0;
    }

    public int removeSpaceJunk(int maxAge)
    {
        int numYeetedObjects=0;
        for(int i=0;i<spaceJunkObjects.size();i++)
        {
            if(spaceJunkObjects.get(i).getAge()>=maxAge)
            {
                getWorld().removeObject(spaceJunkObjects.get(i));
                spaceJunkObjects.remove(i);
                numYeetedObjects++;
                i--;
            }
        }
        removed+=numYeetedObjects;
        return removed;
    }

    public void act() 
    {
                
        if(this.isTouching(SpaceJunk.class))
        {
            getWorld().showText("removed: " + removeSpaceJunk(200000),getWorld().getWidth()/3, getWorld().getHeight()/3);
        }
        
        spaceJunkObjects=getWorld().getObjects(SpaceJunk.class);
        if(Greenfoot.isKeyDown("left"))
        {
            this.setRotation(180);
            move(5);
        }
        else if(Greenfoot.isKeyDown("right"))
        {
            this.setRotation(0);
            move(5);
        }
        else if(Greenfoot.isKeyDown("up"))
        {
            this.setRotation(270);
            move(5);
        }
        else if(Greenfoot.isKeyDown("down"))
        {
            this.setRotation(90);
            move(5);
        }
        
        
    }    
}
