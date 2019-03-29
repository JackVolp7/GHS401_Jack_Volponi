public class Fighter extends SuperHero
{
    private boolean isSStrong;
    private String motto;
    
    public Fighter()
    {
        super();
        
        this.isSStrong=true;
        this.motto="are you feeling it mr crabs";
    }
    public Fighter(String superPower, boolean isSStrong, String motto)
    {
        super(superPower);
        
        this.isSStrong=isSStrong;
        this.motto=motto;
    }
    public String getMotto()
    {
        return this.motto;
    }
    public String leftHook()
    {
        return "fighter just slept on a boi";
    }
    public String toString()
    {
        return super.toString() + " Super Strong: " + this.isSStrong;
    }
}
