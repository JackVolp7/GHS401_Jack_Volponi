import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * @author Jack Volponi 
 * @version Pre-Alpha 1.0 12/15/18
 */
public class playArea extends World
{

    /**
     * Constructor for objects of class playArea.
     * 
     */
    public playArea()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1280, 720, 1); 
        prepare();
    }
    private void prepare()
    {
        player player = new player();
        addObject(player,640,360);
    }
    public void act()
    {
        
    }
    
}
