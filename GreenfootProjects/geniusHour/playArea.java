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
        addObject(new player(),640,360);
        addObject(new player2(),640,260);
        addObject(new Rock(),300,260);
        addObject(new Rock(),1000,260);
    }
    public void act()
    {
    
    }
    
}