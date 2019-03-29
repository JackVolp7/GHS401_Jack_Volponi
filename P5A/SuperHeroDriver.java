import java.util.*;

public class SuperHeroDriver 
{
    public static void main()
    {
        ArrayList<SuperHero> heroList = new ArrayList<SuperHero>();
        
        SuperHero h1=new Flyer("flying",10,"Ahoy sponge bob");
        Fighter h2=new Fighter("aids immunity", true, "get down mrs obama");
        Mutant h3 = new Mutant("bob","extra thicc waist", "its not a tumor");
        
        heroList.add(h1);
        heroList.add(h2);
        heroList.add(h3);
        
        System.out.println(h1.getMotto());
        for(int i=0;i<heroList.size();i++)
        {
            //System.out.println(heroList.get(i).getMotto());
        }
        for(SuperHero c:heroList)
        {
            System.out.println(c.toString());
        }
        
    }
}
