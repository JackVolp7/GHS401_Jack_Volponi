import javax.swing.JOptionPane;


public class Hamburger
{
    //this is a class called Hamburger
    // from this class, we can make as many Hamburger instances(object) as we want
    //instance variables
    private boolean hasLettuce;
    private int numPatties;
    private String cheeseType;
    
    //zero-argument constructor
    //this runs everytime a zero-arg Hamburger is made
    //always is named public classname
    public Hamburger() //System.out.println("a Hamburger was created")
    {
        this.hasLettuce=false; //sets all instance variables           
        this.numPatties=0;//to generic values 
        this.cheeseType=null;
    }
    //toStringMethod
    public String toString()
    {
        String output="Has lettuce:"+this.hasLettuce+"\nPatties:"+this.numPatties+"\nCheese:"+this.cheeseType;
        return output;
    }
    //multi-org constructor
    public Hamburger(boolean hasLettuce, int numPatties, String cheeseType)
    {
        this.hasLettuce = hasLettuce;//set the instance variables to the argument variables
        this.numPatties=numPatties;
        this.cheeseType=cheeseType;
    }
}
