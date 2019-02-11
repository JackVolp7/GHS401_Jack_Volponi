import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Baby here.
 * 
 * @author Jack Volponi 
 * @version 1.0
 */
public class Baby extends Actor
{
    private int speed;
    
    public void act() 
    {
        move(speed);
        if(isAtEdge())
        {
            turn(139);
        }
        getWorld().showText("Distance to destination is: " + calcTripDistance() + " km", getWorld().getWidth()/2, getWorld().getHeight()-100);
        getWorld().showText("Time to destination is: " + calcTripTravelTime() + " hours", getWorld().getWidth()/2, getWorld().getHeight()-150);
    }
    public Baby()
    {
        this.speed=2;
    }
    public Baby(int speed)
    {
        this.speed=speed;
    }
    public double calcTripDistance()
    {
        double d = Math.sqrt(((Blob.yDestination - this.getY())*(Blob.yDestination - this.getY()))+((Blob.xDestination - this.getX())*(Blob.xDestination - this.getX())));
        return d;
    }
    public double calcTripTravelTime()
    {
        double travelTime = (calcTripDistance()/speed);
        return travelTime;
    }
}
