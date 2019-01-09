import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Plane here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Plane extends Actor
{
    private int speed;
    
    public Plane()
    {
        this.speed=0;
        System.out.println("ship was made");
    }
    public Plane(int speed)
    {
        this.speed=speed;
        System.out.println("ship with speed "+speed+" was created"); 
    }
    public void act() 
    {
        move(this.speed);
        if(this.isAtEdge())
        {
            turn(12);
        }
        getWorld().showText(""+ this.getX(),200,200);
    }    
}
