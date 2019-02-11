import java.util.ArrayList;

public class ListStuff
{
    public static void main()
    {
        // creating an ArrayList
        ArrayList<String>myList=new ArrayList<String>();
        //adding stuff to the list
        myList.add("Jack");
        myList.add("Sri");
        myList.add("Cole");
        myList.add(1,"Nadav");
        
        //change something in the list
        myList.set(0,"David");
        
        //remove something from list
        myList.remove(2);
        myList.remove("Sri");
        
        // to get length of ArrayList use list.size()
        for(int i=0; i<myList.size(); i++)
        {
            System.out.println(myList.get(i));
        }
    }
}
