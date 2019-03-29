
public class Rock extends Music
{
    private String bandName;
    
    public Rock()
    {
        super();
        
        this.bandName="none";
    }
    public Rock(String name, int length, String bandName)
    {
        super(name,length);
        
        this.bandName=bandName;
    }
    public String getName()
    {
        return "this is a rock name";
    }
    public String getBandName()
    {
        return this.bandName;
    }
    public String toString()
    {
        return super.toString() + " Band Name: "+this.bandName;
    }
    
}
