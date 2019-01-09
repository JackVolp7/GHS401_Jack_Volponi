import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Bullet extends Actor
{
    private int speed=10;
    
    public void act() 
    {        
        setLocation(getX(),getY()-speed);
    }    
}
