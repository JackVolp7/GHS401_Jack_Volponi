
public class FoodDriver
{
    public static void main()
    {
        Food f1 = new Sandwich(500,"Club", "ham");
        Food f2 = new Sandwich(750,"Panini","human");
        Food f3 = new Pizza(1000,"Cheese","monzarella");
        Food f4 = new Pizza(1250,"Pepperoni","cheddar");
        
        Food[] foodArray = {f1,f2,f3,f4};
        
        for(Food c:foodArray)
        {
            System.out.println("\n"+c);
            
            System.out.println("\n"+c.caloriesDivided(4));
        }
    }
}
