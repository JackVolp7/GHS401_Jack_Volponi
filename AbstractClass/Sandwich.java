
public class Sandwich extends Food
{
    private String meat;
    
    public Sandwich(int c, String n, String m)
    {
        super(c,n);
        
        this.meat=m;
    }
    
    public String caloriesDivided(int peices)
    {
        return "Divide this sandwich into "+ peices + " portions, each portion is "+ super.getCalories()/peices;
    }
    
    public String toString()
    {
        return super.toString() + " meat is "+meat;
    }
}
