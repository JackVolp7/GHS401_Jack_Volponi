import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addObject(new Target(),75,20);
        addObject(new Target(),175,20);
        addObject(new Target(),275,20);
        addObject(new Target(),375,20);
        addObject(new Target(),475,20);
        addObject(new Target(),575,20);
        
    }
    public void act()
    {
        if(Greenfoot.isKeyDown("q"))
        {
            addObject(new Baby(),75, 400);
        }
        if(Greenfoot.isKeyDown("w"))
        {
            addObject(new Baby(),175, 400);
        }
        if(Greenfoot.isKeyDown("e"))
        {
            addObject(new Baby(),275, 400);
        }
        if(Greenfoot.isKeyDown("r"))
        {
            addObject(new Baby(),375, 400);
        }
        if(Greenfoot.isKeyDown("t"))
        {
            addObject(new Baby(),475, 400);
        }
        if(Greenfoot.isKeyDown("y"))
        {
            addObject(new Baby(),575, 400);
        }
    }
}
