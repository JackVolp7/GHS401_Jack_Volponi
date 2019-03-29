import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

/**
 * Write a description of class Ship here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ship extends Actor
{
    private List<Star> starData; 
    
    public void act() 
    {
        move(-10);
        if(isAtEdge())
        {
            turn((int)1+Greenfoot.getRandomNumber(181));
        }
        starData = getWorld().getObjects(Star.class);
        getWorld().showText("Max Luminosity: "+getMaxLuminosity(),500,150);
        getWorld().showText("Average Luminoity: "+averageLuminosity(),500,300);
        
    }
    public Ship()
    {
                
    }
    public int getMaxLuminosity()
    {
        int max=0;
        for(int i=0; i<starData.size(); i++)
        {
            if(this.starData.get(i).getLumi()>max)
            {
                max=this.starData.get(i).getLumi();
            }
        }
        return max;
    }
    public double averageLuminosity()
    {
        double average=0;
        for(int i=0;i<starData.size();i++)
        {
            average+=starData.get(i).getLumi();
        }
        return (double)average/starData.size();
    }
}
