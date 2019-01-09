import javax.swing.JOptionPane;

public class whileloops
{
    public static void main()
    {
        int age= Integer.parseInt(JOptionPane.showInputDialog("give your age to the state"));
        while(age < 0 || age > 123)
        {
            age = Integer.parseInt(JOptionPane.showInputDialog("give your age to the state you lyin dude"));
            
        }    
        
        System.out.println("good job heres a hammer and sickle now go mine iron for us or you go to gulag");
                        
    }
}
