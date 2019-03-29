
public class Music
{
    private String name;
    private int length;
    
    public Music()
    {
        this.name="nothing";
        this.length=0;
    }
    public Music(String name, int length)
    {
        this.name=name;
        this.length=length;        
    }
    public String getName()
    {
        return this.name; 
    }
    public String toString()
    {
        return "Name: "+this.name+" Length: " + this.length;
    }
}
