

public class Rap extends Music
{
    private String subGenre;
    
    public Rap()
    {
        super();
        
        this.subGenre="none";
    }
    public Rap(String name, int length, String subGenre)
    {
        super(name,length);
        
        this.subGenre=subGenre;
    }
    public String getName()
    {
        return "this is a rap name";
    }
    public String getSubGenre()
    {
        return this.subGenre;
    }
    public String toString()
    {
        return super.toString() + " Subgenre: "+this.subGenre;
    }
}
