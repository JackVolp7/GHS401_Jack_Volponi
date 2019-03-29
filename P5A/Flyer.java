
public class Flyer extends SuperHero
{
    private int speed;
    private String motto;
    public Flyer()
    {
        super();
        
        this.speed=10;
        this.motto="i fly";
    }
    public Flyer(String superPower, int speed,String motto)
    {
        super(superPower);
        
        this.speed=speed;
        this.motto=motto;
    }
    public String getMotto()
    {
        return this.motto;
    }
    public String goSuperFast()
    {
        return "flyer is going " + Math.random()*801+200 + " Miles per hour";
    }
    public String toString()
    {
        return super.toString() + " speed: " + this.speed;
    }
}
