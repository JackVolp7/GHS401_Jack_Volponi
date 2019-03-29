public class SuperHero
{
    private String superPower;
    
    public SuperHero()
    {
        this.superPower="none";
    }
    public SuperHero(String superPower)
    {
        this.superPower=superPower;
    }
    public String toString()
    {
        return " Super power: "+this.superPower;
    }
    /*public String getMotto()
    {
        return "I am a superhero";
    }*/
}
