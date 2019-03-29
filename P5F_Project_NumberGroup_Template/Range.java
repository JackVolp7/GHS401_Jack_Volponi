public class Range implements NumberGroup
{
    private int min;
    private int max;
    
    public Range(int min, int max)
    {
        this.min=min;
        this.max=max;
    }
    public boolean contains(int target)
    {
        return target>=min && target<=max;
    }
} // end class Range