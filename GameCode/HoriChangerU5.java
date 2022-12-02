import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HoriChangerU5 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HoriChangerU5 extends InvisibleChangerHorizontal
{
    /**
     * Act - do whatever the HoriChangerU5 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (getOneIntersectingObject(Character.class) != null)
        {  
            SecretHallway secrethallway = new SecretHallway(500, 500);
            Greenfoot.setWorld(secrethallway);
        }
    }    
}
