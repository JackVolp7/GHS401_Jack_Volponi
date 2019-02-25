import java.util.ArrayList;

public class FriendDriver
{
   public static void main()
   {
       ArrayList<String> friendList= new ArrayList<String>();
       friendList.add("Phoebe");
       friendList.add("Chandler");
       friendList.add("Joey");
       friendList.add("Athul");
       
       for(int i=0; i<friendList.size(); i++)
       {
           //friendList.remove(i);
           System.out.println(friendList.get(i));
       }
       for(String currFriend:friendList)
       {
           System.out.println(currFriend);
           
       }
   }
}
