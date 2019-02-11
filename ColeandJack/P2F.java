import javax.swing.JOptionPane;

public class P2F
{
    public static void main()
    {
        int length1 = 0;
        int length2 = 0;
        String[] name1 = new String[3]; 
        String[] name2 = new String[3]; 
        
        name1[0]= JOptionPane.showInputDialog("Enter your first name: ");
        name1[1]= JOptionPane.showInputDialog("Enter your middle name: ");
        name1[2]= JOptionPane.showInputDialog("Enter your last name: ");
        
        name2[0]= JOptionPane.showInputDialog("Enter Friend's first name: ");
        name2[1]= JOptionPane.showInputDialog("Enter Friend's middle name: ");
        name2[2]= JOptionPane.showInputDialog("Enter Friend's last name: ");
        
        for(int i=0; i<3; i++)
        {
            length1 = (name1[i].length() + length1);
            length2 = (name2[i].length() + length2);
        }
        if(length1 < length2)
        {
            System.out.println("Your Friends name is longer.");
        }
        else if(length1 > length2)
        {
            System.out.println("Your name is longer.");
        }
        else if(length1 == length2)
        {
            System.out.println("Your names are the same length.");
        }
               
        Person person1=new Person(name1[0],name1[1],name1[2]);
        Person person2=new Person(name2[0],name2[1],name2[2]);       
        
        System.out.println(person1.toString());
        System.out.println(person2.toString());
    }
}
