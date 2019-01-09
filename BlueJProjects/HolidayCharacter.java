
public class HolidayCharacter
{
    private String name;
    private boolean cool;
    private int fans;
            
    public HolidayCharacter()
    {
        this.name=null;
        this.cool=false;
        this.fans=0;
        
    }
    public HolidayCharacter(String name,boolean cool, int fans)
    {
        this.name=name;
        this.cool=cool;
        this.fans=fans;
    }
    public String toString()
    {
        String output="Name: "+name+" Cool? "+cool+" Fans:"+fans;
        return output;
    }
}
