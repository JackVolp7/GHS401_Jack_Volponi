
public abstract class Animal
{
   private int legs;
   private static int animalsMade=0;
   private int animalNumber;
   
   public Animal(int legs){
       animalsMade++;
       this.animalNumber=animalsMade;
       this.legs=legs;
    }
    
    public abstract String getNoise();
    
    public String toString(){
        
        return "Legs: " + this.legs + "Animal Number: " + this.animalNumber;
        
    }
}
