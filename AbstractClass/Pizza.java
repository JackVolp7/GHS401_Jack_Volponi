
public class Pizza extends Food
{
    private String cheese;
    public Pizza(int c,String n, String cH)
    {
        super(c,n);
        
        this.cheese=cH;
    }
    
    public String caloriesDivided(int peices)
    {
        return "Divide this pizza into "+ peices + " portions, each portion is "+ super.getCalories()/peices;
    }
    
    public String toString()
    {
        return super.toString() + " cheese is "+this.cheese;
    }
}
