import java.util.ArrayList; 

public class Digits
{
    private ArrayList<Integer> digitList;
    public Digits(int num)//Part A
    {
        digitList=new ArrayList<Integer>();
        while(num>0)
        {
            digitList.add(0,num%10);
            num/=10;
        }
        /*if(num==0)
        {
            digitList.add(0);
        }*/
    }
    public boolean isStrictlyIncreasing()
    {
       for(int i=0; i<digitList.size()-1;i++)
       {
           if(digitList.get(i)>=digitList.get(i+1))
           {
               return false;
           }
       }
       return true;
    }
    public String toString()
    {
        String r="";
        
        for(Integer currentInt:digitList)
        {
            r+=currentInt;
        }
        return r;
    }
}
