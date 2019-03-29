
public class Pop extends Music
{
    private boolean isHighPitched;
    
    public Pop()
    {
        super();
        
        this.isHighPitched=false;
    }
    public Pop(String name, int length, boolean isHighPitched)
    {
        super(name,length);
        
        this.isHighPitched=isHighPitched;
    }
    public String getName()
    {
        return "this is a pop name";
    }
    public boolean getPitch()
    {
        return this.isHighPitched;
    }
    public String toString()
    {
        return super.toString() + " Is this high pitched? "+this.isHighPitched;
    }
}
