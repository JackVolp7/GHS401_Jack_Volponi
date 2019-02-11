import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Robato extends Actor
{
    private int speed;
    private int batteryLevel;
    private String color;
    private int counter=0;
    private int turnCount=1;
    private boolean missionAccomplished;
    
    /**
     * Act - do whatever the Robato wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(batteryLevel==0)
        {
            speed=0;
            counter=0;
        }
        move(speed);
        counter++;
        
        if(this.getX()==getWorld().getWidth()-1)
        {
            turn(90);
            move(1);
            turn(90);
            System.out.println("edge hit");    
        }
        if(this.getX()==0)
        {
            turn(-90);
            move(1);
            turn(-90);
            System.out.println("edge hit");    
        }
        if(this.getX()>=getWorld().getWidth()-1 && this.getY()>=getWorld().getHeight()-1){
            setLocation(getWorld().getWidth()/2,getWorld().getHeight()/2);
            getWorld().showText("Mission Complete!",getWorld().getWidth()/2,getWorld().getHeight()/2);
            Greenfoot.stop();
        }
    }
    public Robato()
    {
        this.speed=1;
        this.batteryLevel=100;
        this.color="chrome";
    }
    public Robato(int speed, int batteryLevel, String color)
    {
        this.speed=speed;
        this.batteryLevel=batteryLevel;
        this.color=color;
        this.missionAccomplished = missionAccomplished;
    }
    public String toString()
    {
        return "status "+"\nspeed: "+ this.speed + "\nbattery level: " + this.batteryLevel + "\ncolor: "+this.color;
    }
}
