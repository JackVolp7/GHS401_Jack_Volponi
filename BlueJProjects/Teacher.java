
public class Teacher
{
   private String name;
   private int yearsXp;
   
   
   public Teacher(String name, int yearsXp)
   {
       this.name=name;
       this.yearsXp=yearsXp;
   }
   
   public int getYearsXp() //getter method
   {
       return this.yearsXp;
   }
   
   public String toString()
   {
       return "name: "+name+" Years: "+yearsXp+" vowels: "+ numVowelsInName();
   }
   
   //setter method 
   public void setYearsXp(int yearsXp)
   {
       this.yearsXp=yearsXp;
   }
   public int numVowelsInName()
   {
       int numVowels=0;
       
       for(int i=0;i<this.name.length();i++)
       {
           if(this.name.substring(i,i+1).equals("a") || this.name.substring(i,i+1).equals("e") || this.name.substring(i,i+1).equals("i") || this.name.substring(i,i+1).equals("o") || this.name.substring(i,i+1).equals("u"))
           {
               numVowels++;
               
        
            }
       }
   
       return numVowels; 
    }
}
