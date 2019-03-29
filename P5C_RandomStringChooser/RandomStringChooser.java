import java.util.*;
public class RandomStringChooser
{
    private ArrayList<String> wordList;
    //private String[] wordArray;
    
    public RandomStringChooser(String[] wordArray)
    {
        wordList=new ArrayList<String>();
        for(String c:wordArray)
        {
            this.wordList.add(c);
        }        
    } 
    public String getNext()
    {
        if(this.wordList.size()>0)
        {       
            String temp = wordList.get((int)(Math.random()*wordList.size()));            
            wordList.remove(temp);
            return temp;
        }
        else
        {
            return "NONE";
        }
    }
    public String toString()
    {
        String output = new String();

        for( String word : wordList )
        {
            output += word + ", ";    
        } // end for

        return output;
    } // end method toString
} // end RandomStringChooser