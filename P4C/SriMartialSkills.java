public class SriMartialSkills extends Sri
{
    private int moves; 
    private boolean hasSideKick;
    
    public SriMartialSkills()
    {
        super();
        
        this.moves=23;
        this.hasSideKick=true;
    }
    public SriMartialSkills(int legs, boolean alive, int hairCount,boolean isInIndianClub, int moves, boolean hasSideKick)
    {
        super(legs,alive,hairCount, isInIndianClub);
        
        this.moves=moves;
        this.hasSideKick=hasSideKick;
    }
    public String toString()
    {
        
    }
}
