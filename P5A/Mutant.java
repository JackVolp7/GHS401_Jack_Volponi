public class Mutant extends SuperHero
{
    private String mutation;
    private String motto;
    public Mutant()
    {
       super();
       this.mutation = "Dude is normal";
       this.motto="i was weird in highschool";
    }
    public Mutant(String superPower, String mutation,String motto)
    {
        super(superPower);
        this.mutation = mutation;
        this.motto=motto;
    }
    public String getMotto()
    {
        return this.motto;
    }
    public String mutate()
    {
        return "mutant has mutated";
    }
    public String toString()
    {
        return super.toString() + " Mutation: " + this.mutation;
    }
}
