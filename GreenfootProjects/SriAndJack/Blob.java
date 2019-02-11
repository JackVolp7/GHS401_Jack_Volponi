import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Blob here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Blob extends Actor
{
    public static int xDestination;
    public static int yDestination;
    
    public void act() 
    {
        this.setLocation(xDestination,yDestination);
    }    
    public Blob(int xDestination, int yDestination)
    {
        this.xDestination=xDestination;
        this.yDestination=yDestination;
    }
}
