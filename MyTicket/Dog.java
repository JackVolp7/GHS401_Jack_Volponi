

public class Dog extends Animal
{
    private boolean isFast;
    
   public Dog(int legs, boolean isFast){
       
       super(legs);
       this.isFast=isFast;
    }
    
     public String getNoise(){
        
        return "Rough";
    }
    
    public String toString(){
        
        return super.toString()+ " Is Fast: " + this.isFast;
    }
}
