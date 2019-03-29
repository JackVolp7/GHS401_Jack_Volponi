public class Animal
{
    private int legs;
    private boolean alive;
    
    public Animal()
    {
        this.legs=2;
        this.alive=true;        
    }
    public Animal(int legs, boolean alive)
    {
        this.legs=legs;
        this.alive=alive;
    }
    public String toString()
    {
        return "Legs: " + this.legs + "Alive: " + this.alive;
    }
}