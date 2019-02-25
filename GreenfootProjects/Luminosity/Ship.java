import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;

/**
 * Write a description of class Ship here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ship extends Actor
{
    private ArrayList <Star> ofDavid; 
    
    public void act() 
    {
        move(10);
        if(isAtEdge())
        {
            turn((int)Math.random()*181+1);
        }
        ArrayList<Star> ofDavid = (ArrayList<Star>)getWorld().getObjects(Star.class);
        getWorld().showText("Max Luminosity: "+getMaxLuminosity(),400,250);
        
    }
    public Ship()
    {
        ArrayList ofDavid = new ArrayList<Star>();
        
    }
    public double calcAverageLuminosity()
    {
        double total=0;
        for(int i=0; i<ofDavid.size(); i++)
        {
            total+= ofDavid.get(i).getLumi();
        }
        return total/ofDavid.size();
    }
    public int getMaxLuminosity()
    {
        int max=0;
        for(int i=0; i<ofDavid.size(); i++)
        {
            if(this.ofDavid.get(i).getLumi()>max)
            {
                max=this.ofDavid.get(i).getLumi();
            }
        }
        return max;
    }
}
