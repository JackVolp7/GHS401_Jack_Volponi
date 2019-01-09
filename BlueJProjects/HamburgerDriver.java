import javax.swing.JOptionPane;


/*public class HamburgerDriver
{
    public static void main()
    {
       Hamburger[] burger= new Hamburger[3];
       
       for(int i=0; i<burger.length; i++)
       {
           //make one instance or object of the Hamburger class
           Hamburger burger[i] = new Hamburger();
           
           //print the ToString of the object
           System.out.println(burger.toString());
       }
    }
}
*/

public class HamburgerDriver
{
    public static void main()
    {       
        //make one instance or object of the Hamburger class
        Hamburger h1 = new Hamburger();
        Hamburger h3 = new Hamburger(true,420,"red");
        
        //print the ToString of the object
        System.out.println(h1.toString());
        System.out.println(h3.toString());
    }
}