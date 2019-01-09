import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class linux extends Actor
{
    private int speed;
    private String name;

    /**
     * Act - do whatever the linux wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(speed);
        if(isAtEdge())
        {
            turn(68);
        }
        getWorld().showText(toString(),getWorld().getWidth()/2,getWorld().getHeight()/2);
        
    }    
    public linux()
    {
        this.speed=2;
        this.name="gangster";
    }
    public linux(int speed,String name)
    {
        this.speed=speed;
        this.name=name;
    }
    public String toString()
    {
       return "x coord is "+this.getX()+"\n"+"y coord is "+this.getY() +"\n" +"name is "+name + "\n" +"speed is "+speed;
    }
    
}