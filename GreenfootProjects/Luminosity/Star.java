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
            getWorld().removeObject(this);
        }
        //while(this.lumi>=0)
        //{
            getWorld().showText("Luminosity "+this.lumi,500,300);
            getWorld().showText("X location "+this.getX(),500,250);
            getWorld().showText("Y location "+this.getY(),500,200);
        //}
        
    }  
    public Star()
    {
        this.lumi=(int)Math.random()*501+500;
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
