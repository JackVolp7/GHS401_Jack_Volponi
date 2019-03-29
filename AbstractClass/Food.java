
public abstract class Food
{
    private String name;
    private int calories;
    private int ceralNumber;
    private static int foodCounter=0;
    
    public Food(int c, String n)
    {
        this.calories=c;
        this.name=n;
        this.foodCounter++; //adds to static food counter for all food items to acces
        this.ceralNumber = foodCounter;
    }
    
    public int getCalories()
    {
        return this.calories;
    }
    
    public abstract String caloriesDivided(int peices);
    
    public String toString()
    {
        return this.name + " has "+this.calories+" calories. "+" Ceral number is " + ceralNumber;
    }
}
