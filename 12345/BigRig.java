
public class BigRig extends Auto
{
    private int loadCapacity;
    
    public BigRig(int w, int f)
    {
        //super(w);
        this.loadCapacity=f;
    }
    public String go()
    {
        return "Honk! Honk!";
    }
}
