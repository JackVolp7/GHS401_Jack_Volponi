public class Sri extends Animal
{
    private int hairCount;
    private boolean isInIndianClub;
    
    public Sri()
    {
        super();
        
        this.hairCount=100;
        this.isInIndianClub=true;
    }
    public Sri(int legs, boolean alive, int hairCount, boolean isInIndianClub)
    {
        super(legs, alive);
        
        this.hairCount=hairCount;
        this.isInIndianClub=isInIndianClub;
    }
    public String juggling()
    {
        return "the Sri is juggling";
    }
    public String toString()
    {
        return super.toString() + " Hair count: " + this.hairCount+ " Is in indian club: "+ this.isInIndianClub;
    }
}
