import javax.swing.JOptionPane;

public class StringStuff2
{
    public static void main()
    {
        String word1=JOptionPane.showInputDialog("Please enter an animal:");
        
        if(word1.contains("f"))
        {
            System.out.println("The word has an f");
        }
        else
        {
            System.out.println("The word has no f's");
        }
        
        System.out.println(word1.toLowerCase());
        
        boolean validLength = false;
        
        while(!validLength) //same as validLength==false
        {
            String answer= JOptionPane.showInputDialog("4 letter word or longer:");
            if(answer.length() >= 4)
            {
                validLength = true;
                System.out.println(answer);
            }
            //validLength = answer.length()>3;
        }
        
    }
}
