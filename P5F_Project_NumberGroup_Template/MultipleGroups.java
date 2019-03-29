import java.util.List;
import java.util.ArrayList;

public class MultipleGroups implements NumberGroup
{
    private List<NumberGroup> groupList;
    public MultipleGroups(){
       groupList = new ArrayList<NumberGroup>();
       groupList.add(new Range(-3,0));
       groupList.add(new Range(7,100));
       groupList.add(new Range(4,8));
    }
    
    public boolean contains(int target)
    {
        for(NumberGroup c:groupList)
        {
            if(c.contains(target))
            {
                return true;
            }
        }
        return false;
    }
} // end class MulitpleGroups




  
