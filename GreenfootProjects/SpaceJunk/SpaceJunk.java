import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class SpaceJunk extends Actor
{
    private int age;
    public SpaceJunk()
    {
        this.age=Greenfoot.getRandomNumber(200001);
    }
    public SpaceJunk(int age)
    {
        this.age=age;
    }
    public int getAge()
    {
        return this.age;
    }
    public void setAge(int newAge)
    {
        this.age=newAge;
    }
    public void act() 
    {
        this.age+=500;
        getWorld().showText("age: "+ getAge(), this.getX(), this.getY()); 
    }    
}
