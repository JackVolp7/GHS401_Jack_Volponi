import javax.swing.JOptionPane;


public class SarahandJackP1DSquareRange
{
   public static void main()
   {
       int arrayLength = Integer.parseInt(JOptionPane.showInputDialog("How long do you want the array to be"));
       int numbers[] = new int[arrayLength];
       System.out.println("Index\tSquare\tRandom Number");
       
      
       
       for(int i=0; i< numbers.length; i++)
       {
           int index = i+1;
           int range = ((i+1)*(i+1));
           int random = (int)(Math.random()*(range +1 - index) + index);
           
           
           if (random == index || random == range) {
               System.out.println(index +"\t"+ range +"\t" + random + "\tThe random value is equal to the index or square" ); 
       
            }
                else {
                   System.out.println(index +"\t"+ range +"\t" + random); 
                }
       }
       
       
       String movies[] = new String[3];
       movies[0]= "Nausuicaa";
       movies[1]= "Godfather";
       movies[2]="123";
       String songs[] = new String[3];
       songs[0]= "Shelter";
       songs[1]= "HUMBLE";
       songs[2]="345";
       
       int y = 0;
       for(int x = 0; x < movies.length; x++) {
           System.out.println(movies[x] + "\n"); 
        }
       while(y<songs.length)
       {
           if(y==(songs.length-1))
           {
               System.out.print(songs[y]);
           }
           else if(y<songs.length)
           {
               System.out.print(songs[y]+",");
           }
           y++;
       }
   }
}
