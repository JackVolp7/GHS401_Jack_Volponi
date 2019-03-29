
/**
 * Write a description of class InventoryItem here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public interface InventoryItem
{
    //an interface is a way to connect classes
    //that do not inherit eachother
    
    //all an interface is is a collection of methods 
    // that all implementing classes must have
    
    public String shipped();
    
    boolean isInStock();
}
