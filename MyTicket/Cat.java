public class Cat extends Animal
{
    private int lives;
    
   public Cat(int legs, int lives){
       
       super(legs);
       this.lives=lives;
    }
    
     public String getNoise(){
        
        return "Meow";
    }
    
    public String toString(){
        
        return super.toString()+ " Lives: " + this.lives;
    }
}