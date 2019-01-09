import greenfoot.*;

public class button extends Actor 
{
    int changeScreen=0;
    
    public void main()
    {
        if(Greenfoot.mouseClicked(this))
        {
            changeScreen=1;
        }
    }
}
