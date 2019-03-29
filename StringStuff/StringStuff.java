
/**
 * Write a description of class StringStuff here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StringStuff
{
    public static void main()
    {
        String word="bamboozle";
        
        System.out.println("1 "+word.indexOf("c"));        
        System.out.println("2 "+word.indexOf("bog"));        
        System.out.println("3 "+word.indexOf("b"));
        System.out.println("4 "+word.indexOf("boo"));
        
        System.out.println("5 "+word.substring(1,4));
        System.out.println("6 "+word.substring(5));
        
        System.out.println("7 "+word.contains("boozle"));
        System.out.println("8 "+word.contains("Boozle"));
        System.out.println("9 "+word.contains("dog"));
    }
}
