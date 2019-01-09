import javax.swing.JOptionPane;

public class greatestofalltimeSarahandJack
{
    public static void main()
    {
        int arrayLength = Integer.parseInt(JOptionPane.showInputDialog("enter array length"));
        int myArray[] = new int[arrayLength];
        int max=0; 
        int least = 100;
        
        while(arrayLength < 10 || arrayLength > 100)
        {
            arrayLength = Integer.parseInt(JOptionPane.showInputDialog("enter array length"));
        }
        
        for(int i=0; i<myArray.length; i++)
        {
            myArray[i]=(int)(Math.random()*91+10);
            System.out.print(myArray[i]+" ");
            
             if(myArray[i] > max) {
                max = myArray[i];
                
            }
            
             if(myArray[i] < least) {
                least = myArray[i];
                
            }
        }
        
        System.out.println("\nGreatest: " + max + "\nLeast: " + least);
    }
}
