public class StudentAdvance extends Advance
{
    private double price;
    
    public StudentAdvance(int daysLeft)
    {
        super(daysLeft);
        this.price=(super.getPrice()/2);
    }
    public double getPrice()
    {
        return this.price;
    }
    public String toString()
    {
        return super.toString()+" student id required";
    }
} // end class StudentAdvance
