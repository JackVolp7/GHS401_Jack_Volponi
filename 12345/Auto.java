
public class Auto
{
    private int wheels;
    
    public Auto(int wheels)
    {
        this.wheels=wheels;
    }
    public Auto()
    {
        this.wheels=0;
    }
    public void flatTire()
    {
        go();
        wheels-=1;
        System.out.println("super flat tire");
    }
    public String go()
    {
        System.out.println("super go");
        return "vroom";
    }
}
