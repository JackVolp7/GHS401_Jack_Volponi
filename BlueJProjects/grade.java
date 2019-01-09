import javax.swing.JOptionPane;


public class grade
{
    public static void main()
    {
       int grade = Integer.parseInt(JOptionPane.showInputDialog("give grade percentage"));
       
       if(grade > 100 || grade < 0)
       {
           System.out.println("Stop Lying");
           main();
        }
       else if(grade >= 90)
       {
           System.out.println("You have an A");
        }
       else if(grade >= 80)
       {
           System.out.println("You have an B");
        }
       else if(grade >= 70)
       {
           System.out.println("You have an C");
        }
       else if(grade >= 60)
       {
           System.out.println("You have an D");
        }
       else if(grade < 60)
       {
           System.out.println("You have an F, do better");
        }
    }
}
