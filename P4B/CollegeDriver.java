import java.util.ArrayList;
public class CollegeDriver
{
    public static void main()
    {
       ArrayList<College> c = new ArrayList<College>();
       
       c.add(new College("USC"));
       c.add(new College("UC Irvine"));
       c.add(new College("Macdonalds University"));
       c.add(new College("College Board"));
       c.add(new College("hood"));
       
       for (College nowColl:c)
       {
           System.out.println(nowColl.getName());
           if (nowColl==(c.get(c.size()-1)))
           {
               System.out.println("\nAbout to removes some colleges...\n");
           }
       }
       for(int i=0; i<c.size();i++)
       {
           if(c.get(i).getName().length()<=4)
           {
               c.remove(i);
               i--;
           }
       }
       for(int i=0;i<c.size();i++)
       {
           System.out.println(c.get(i).getName());
           if (c.get(i)==(c.get(c.size()-1)))
           {
               System.out.println("\nAdding colleges...\n");
               c.add(new College("university moms basement "));
               c.add(new College("university cardboard fort"));
               break;
           }
       }
       for (College nowColl:c)
       {
            System.out.println(nowColl.getName());
       }
       
    }
}
