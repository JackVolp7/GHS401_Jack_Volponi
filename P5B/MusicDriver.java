
import java.util.ArrayList;
public class MusicDriver
{
   
   public static void main()
   {
       
       ArrayList<Music> musicList = new ArrayList<Music>();
       
       Music[] musicArray=new Music[4];
       
       
       
       Music m1 = new Music();
       Music m2 = new Music("Bob",4);
       Music r1 = new Rock();
       Music r2 = new Rock("Shoot to kill",4,"ACDC");
       Pop p1 = new Pop();
       Pop p2 = new Pop("Baby",5,true);
       Rap rP1 = new Rap();
       Rap rP2 = new Rap("Tary",2,"Lyrical");
       
       musicArray[0]=m2;
       musicArray[1]=r2;
       musicArray[2]=p2;
       musicArray[3]=rP2;
       
       musicList.add(m1);
       musicList.add(m2);
       musicList.add(r1);
       musicList.add(r2);
       musicList.add(p1);
       musicList.add(p2);
       musicList.add(rP1);
       musicList.add(rP2);
       
       for(Music currMusic: musicList)
       {
          System.out.println(currMusic.toString()); 
       }
       System.out.println("\n");
       
      for(int i=0; i<musicList.size();i++)
       {
           System.out.println(musicList.get(i).getName());
       }
       System.out.println("\n");
       
       System.out.println(r2.getBandName());
       System.out.println(p2.getPitch());
       System.out.println(rP2.getSubGenre());
       
       System.out.println("\n");
       
       for(int i=0;i<musicArray.length;i++)
       {
           System.out.println(musicArray[i].getName());
       }
       
       
   }
}
