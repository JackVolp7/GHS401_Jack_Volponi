import java.util.*;

public class RemoveStuff
{
    public static void main()
    {
        String name="Jack";
        int age = 16;
        String[]family={"Larry","Curly","Moe"};
        
        ArrayList<String> myList = new ArrayList<String>();
        myList.add("Larry");
        myList.add("Curly");
        myList.add("Moe");
        System.out.println(name + " is "+age);
        
        for(String currString:family)
        {
            System.out.println(currString);
        }
        for(String currString: myList)
        {
            System.out.println(currString);
        }
        System.out.println("-----------------------------------------------------");
        Changer(name,age,family,myList);
        System.out.println(name + " is "+age);
        
        for(String currString:family)
        {
            System.out.println(currString);
        }
        for(String currString: myList)
        {
            System.out.println(currString);
        }
    }
    public static void Changer(String n, int a, String[] f, ArrayList<String> m)
    {
        n="blob";
        a=100;
        for(int i=0;i<f.length;i++)
        {
            f[i]="Mickey Mouse";
        }
        for(int i=0;i<m.size();i++)
        {
            m.set(i,"Donald Duck");
        }
    }
}
