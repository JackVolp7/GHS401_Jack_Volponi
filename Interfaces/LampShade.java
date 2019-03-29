
public class LampShade implements InventoryItem
{
    private boolean isInStock;
    private double price; 
    
    public LampShade(boolean i, double p)
    {
        this.isInStock=i;
        this.price=p;
    }
    
    public String shipped()
    {
        return "Lamp shade has been shipped";        
    }
    
    public boolean isInStock()
    {
        return isInStock;
    }
}
