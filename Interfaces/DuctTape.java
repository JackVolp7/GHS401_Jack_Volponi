
public class DuctTape implements InventoryItem
{
    private boolean isInStock;
    private double price; 
    
    public DuctTape(boolean i, double p)
    {
        this.isInStock=i;
        this.price=p;
    }
    
    public String shipped()
    {
        return "Duct tape shade has been shipped";        
    }
    
    public boolean isInStock()
    {
        return isInStock;
    }
}
