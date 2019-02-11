
public class TeacherDriver
{
    public static void main()
    {
        Teacher teacher1= new Teacher("Billy Bob",10);
        Teacher teacher2= new Teacher("Nadav",100000);
        
        System.out.println(teacher1.toString());
        System.out.println(teacher2.toString());
        
        //set years experience
        System.out.println(teacher1.getYearsXp());
        
        teacher1.setYearsXp(5);
        
        System.out.println(teacher1.getYearsXp());
        System.out.println(teacher1.numVowelsInName());
    }
}
