import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class play here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class play extends Actor
{
    /**
     * Act - do whatever the play wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     * Checks if the play button is clicked and if it is it changes to playArea
     * later I will make it so it goes to character select then playArea
     */
    public void act() 
    {
        click();
    }
    private void click()
    {
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new playArea());
        }
    }
}
