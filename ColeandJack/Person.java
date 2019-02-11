
public class Person
{
    private String firstName;
    private String middleName;
    private String lastName;

   public Person()
   {
       this.firstName=null;
       this.middleName=null;
       this.lastName=null;
   }
   public Person(String firstName,String middleName, String lastName)
   {
       this.firstName=firstName;
       this.middleName=middleName;
       this.lastName=lastName;
   }
   public String toString()
   {
       String output= "Person's full name: " + firstName + middleName + lastName;
       return output;
   }
}
