import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Star here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Star extends Actor
{
    private int lumi;
    

    public void act() 
    {
        this.lumi--;
        if(this.lumi<=0)
        {
            getWorld().showText("",getX(),getY());
            getWorld().removeObject(this);
            
            
        }
        else if(this.lumi>0)
        {
            getWorld().showText(""+getLumi(),getX(),getY());
            
        }
    }  

    public Star()
    {
        this.lumi=(int)500+Greenfoot.getRandomNumber(501);
    }

    public int getLumi()
    {
        return this.lumi;
    }

    public void setLumi(int lumi)
    {
        this.lumi=lumi;
    }

}
