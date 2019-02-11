import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Robato extends Actor
{
    private int speed;
    private int batteryLevel;
    private String color;
    private int counter=0;
    private int turnCount=1;
    
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
        if(counter%3==0)
        {
            batteryLevel--; 
            System.out.println("battery Level: "+batteryLevel);
        }
        if(turnCount%4==1)
        {
            if(isAtEdge())
            {
            setLocation(this.getX()-1,this.getY());
            turn(90);
            System.out.println("edge hit");           
            turnCount++;
            }
        }
        if(turnCount%4==2)
        {
            if(isAtEdge())
            {
            setLocation(this.getX(),this.getY()-1);
            turn(90);
            System.out.println("edge hit");           
            turnCount++;
            }
        }
        if(turnCount%4==3)
        {
            if(isAtEdge())
            {
            setLocation(this.getX()+1,this.getY());
            turn(90);
            System.out.println("edge hit");           
            turnCount++;
            }
        }
        if(turnCount%4==0)
        {
            if(isAtEdge())
            {
            setLocation(this.getX(),this.getY()+1);
            turn(90);
            System.out.println("edge hit");           
            turnCount++;
            }
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
    }
    public String toString()
    {
        return "status "+"\nspeed: "+ this.speed + "\nbattery level: " + this.batteryLevel + "\ncolor: "+this.color;
    }
}
