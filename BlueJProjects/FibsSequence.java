/*import javax.swing.JOptionPane;

public class Fibonacci_Fun
{
    public static void main()
    {
        int numFib = Integer.parseInt(JOptionPane.showInputDialog("Enter number of Fib numbers"));
        int a=1;
        int b=1;
        int c=1;
        int d=2;
        
        System.out.println("Index       Sequence        Running Total");
        System.out.println("1"+"\t"+"\t"+"0"+"\t"+"\t"+"\t"+"0");
        System.out.println("2"+"\t"+"\t"+"1"+"\t"+"\t"+"\t"+"1");
        for(int i=2; i<numFib; i++)
        {
           System.out.println((i+1)+"\t"+"\t"+c+"\t"+"\t"+"\t"+d);
           
           c=a+b;
           d=d+c;
           a=b;
           b=c;
        }
    }
}


*/
import javax.swing.JOptionPane;
public class FibsSequence
{
    public static void main()
    {
        int a = Integer.parseInt(JOptionPane.showInputDialog("how many"));
        int x = 0;
        int y = 0;
        System.out.println("Line #   Fib#   RunningTotal");

        int bloob =0;
        int blob =0;

        for(int i=0; i<a; i++)
        {
            
            bloob = x + y;
            blob = blob+bloob;
            System.out.println((i+1) + "\t" + bloob + "\t" + blob);
            y = x;
            x = bloob;
            if (i==0)
            {
                y++;
            }
 
            
        }
             
        
        
    }
}








