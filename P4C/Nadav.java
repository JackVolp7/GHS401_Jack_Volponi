public class Nadav extends Animal
{
    private boolean brain;
    private boolean juggles;
    
    public Nadav()
    {
        super(); //calls Animal super class zero-arg constructor 
        
        this.brain=true;
        this.juggles=true;
    }
    public Nadav(boolean brain, boolean juggles, int legs, boolean alive)
    {
        super(legs,alive);
        
        this.brain=brain;
        this.juggles=juggles;
    }
    public String eatCusCus()
    {
        return "The wild Nadav is eating cuscus";
    }
    public String toString()
    {
        return super.toString() + "Brain: "+this.brain+"Juggles: " + this.juggles;
    }
}
