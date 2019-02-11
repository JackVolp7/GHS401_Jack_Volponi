import java.util.ArrayList;

public class P3E
{
   public static void main()
   {
       ArrayList<String>elementList=new ArrayList<String>();
       
       elementList.add("argon");
       elementList.add("boron");
       elementList.add("carbon");
       elementList.add("flourine");
       elementList.add("gold");
       elementList.add("iron");
       elementList.add("livermorium"); 
       
       System.out.println("Here are the elements: ");
       for(int i=0;i<elementList.size();i++)
       {
           System.out.println(elementList.get(i));           
       }                
       System.out.println("\nthis element has on in it");
       for(int i=0;i<elementList.size();i++)
       {         
           if(elementList.get(i).contains("on"))
           {

               System.out.println(elementList.get(i));
           }
       }
       System.out.println("\nThese are elements remaining after removing d");
       for(int i=0;i<elementList.size();i++)
       {           
           if(0<= (elementList.get(i).substring(0,1).compareTo("d")))
           {
               elementList.remove(i);
               i--;
           }
       }
       for(int i=0;i<elementList.size();i++)
       {
           System.out.println("Still Remaining: "+elementList.get(i));
       }
   }
}
