import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    int turn=0;
    Actor[][] actorArray = new Actor[3][3];
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);        
                
        for(int r=0; r<actorArray.length;r++)
        {
            for(int c=0; c<actorArray[0].length; c++)
            {
                actorArray[r][c]=new Default();
            }
        }
        addObject(actorArray[0][0], 100, 100);
        addObject(actorArray[0][1], 200, 100);
        addObject(actorArray[0] [2], 300, 100);
        addObject(actorArray[1][0], 100, 200);
        addObject(actorArray[1] [1], 200, 200);
        addObject(actorArray [1] [2], 300, 200);
        addObject(actorArray[2][0], 100, 300);
        addObject(actorArray[2] [1], 200, 300);
        addObject(actorArray [2] [2], 300, 300);
    }
    public void act()
    {
        
        
        if(turn==0)//black baby
        {
            if(Greenfoot.isKeyDown("7")&& actorArray[1][0].getImage().equals("bananas.png"))
            {
                actorArray[0][0].setImage("baby2.png");
                turn=1; 
            }
            if(Greenfoot.isKeyDown("8")&& actorArray[1][0].getImage().equals("bananas.png"))
            {
                actorArray[0][1].setImage("baby2.png");
                turn=1; 
            }
            if(Greenfoot.isKeyDown("9")&& actorArray[1][0].getImage().equals("bananas.png"))
            {
                actorArray[0][2].setImage("baby2.png");
                turn=1; 
            }
            if(Greenfoot.isKeyDown("4")&& actorArray[1][0].getImage().equals("bananas.png"))
            {
                actorArray[1][0].setImage("baby2.png");
                turn=1; 
            }
            if(Greenfoot.isKeyDown("5")&& actorArray[1][0].getImage().equals("bananas.png"))
            {
                actorArray[1][1].setImage("baby2.png");
                turn=1; 
            }
            if(Greenfoot.isKeyDown("6")&& actorArray[1][0].getImage().equals("bananas.png"))
            {
                actorArray[1][2].setImage("baby2.png");
                turn=1; 
            }
            if(Greenfoot.isKeyDown("1")&& actorArray[1][0].getImage().equals("bananas.png"))
            {
                actorArray[2][0].setImage("baby2.png");
                turn=1; 
            }
            if(Greenfoot.isKeyDown("2")&& actorArray[1][0].getImage().equals("bananas.png"))
            {
                actorArray[2][1].setImage("baby2.png");
                turn=1; 
            }
            if(Greenfoot.isKeyDown("3")&& actorArray[1][0].getImage().equals("bananas.png"))
            {
                actorArray[2][2].setImage("baby2.png");
                turn=1; 
            }
        }
        
        if(turn==1)//white baby
        {
            if(Greenfoot.isKeyDown("7")&& actorArray[1][0].getImage().equals("bananas.png"))
            {
                actorArray[0][0].setImage("baby1.png");
                turn=0; 
            }
            if(Greenfoot.isKeyDown("8")&& actorArray[1][0].getImage().equals("bananas.png"))
            {
                actorArray[0][1].setImage("baby1.png");
                turn=0; 
            }
            if(Greenfoot.isKeyDown("9")&& actorArray[1][0].getImage().equals("bananas.png"))
            {
                actorArray[0][2].setImage("baby1.png");
                turn=0; 
            }
            if(Greenfoot.isKeyDown("4")&& actorArray[1][0].getImage().equals("bananas.png"))
            {
                actorArray[1][0].setImage("baby1.png");
                turn=0; 
            }
            if(Greenfoot.isKeyDown("5")&& actorArray[1][0].getImage().equals("bananas.png"))
            {
                actorArray[1][1].setImage("baby1.png");
                turn=0; 
            }
            if(Greenfoot.isKeyDown("6")&& actorArray[1][0].getImage().equals("bananas.png"))
            {
                actorArray[1][2].setImage("baby1.png");
                turn=0; 
            }
            if(Greenfoot.isKeyDown("1")&& actorArray[1][0].getImage().equals("bananas.png"))
            {
                actorArray[2][0].setImage("baby1.png");
                turn=0; 
            }
            if(Greenfoot.isKeyDown("2")&& actorArray[1][0].getImage().equals("bananas.png"))
            {
                actorArray[2][1].setImage("baby1.png");
                turn=0; 
            }
            if(Greenfoot.isKeyDown("3")&& actorArray[1][0].getImage().equals("bananas.png"))
            {
                actorArray[2][2].setImage("baby1.png");
                turn=0; 
            }
        }
        System.out.println(turn);
    }
}
