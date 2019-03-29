public class Advance extends Ticket
{
    private double price;
    
    public Advance(int daysLeft)
    {
        super();
        if(daysLeft>=10)
        {
            this.price=30;
        }
        else if(daysLeft<10)
        {
            this.price=40;
        }
    }
    public double getPrice()
    {
        return this.price;
    }
    
    public String toString()
    {
        return super.toString() +  " price: " + this.price;
    }
       
} // end class Advance